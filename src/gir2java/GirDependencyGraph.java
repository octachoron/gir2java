package gir2java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import nu.xom.Document;

/**
 * Takes .gir Documents, and performs dependency-related operations on them.
 * @author relek
 *
 */
public class GirDependencyGraph {
	private Set<Document> girs = new HashSet<Document>();
	protected Map<NamespaceDescriptor, Document> namespaceToGir;
	protected Map<Document, NamespaceDescriptor> girToNamespace;
	protected Map<Document, List<NamespaceDescriptor>> girToIncludedNamespaces = new HashMap<Document, List<NamespaceDescriptor>>();
	private GirParser parser;
	
	private class WithRemovableIncludes extends GirDependencyGraph {
		
		public WithRemovableIncludes(GirDependencyGraph graph) {
			super(graph.parser);
			
			//Deep copy the include map so we can work on it independently of the original
			for (Document doc : graph.girToIncludedNamespaces.keySet()) {
				List<NamespaceDescriptor> includesList = new ArrayList<NamespaceDescriptor>();
				includesList.addAll(graph.girToIncludedNamespaces.get(doc));
				girToIncludedNamespaces.put(doc, includesList);
			}
			
			//Shallow copy everything else, we don't want to alter them
			girs = graph.girs;
			namespaceToGir = graph.namespaceToGir;
			girToNamespace = graph.girToNamespace;
		}
		
		private void removeInclude(Document gir, NamespaceDescriptor include) {
			girToIncludedNamespaces.get(gir).remove(include);
		}
	}
	
	public GirDependencyGraph(GirParser parser) {
		this.parser = parser;
		namespaceToGir = new HashMap<NamespaceDescriptor, Document>();
		girToNamespace = new HashMap<Document, NamespaceDescriptor>();
	}
	
	public void addGir(Document gir) {
		girs.add(gir);
		
		NamespaceDescriptor definedNamespace = parser.getDefinedNamespace(gir);
		List<NamespaceDescriptor> includedNamespaces = parser.getIncludedNamespaces(gir);
		
		namespaceToGir.put(definedNamespace, gir);
		girToNamespace.put(gir, definedNamespace);
		girToIncludedNamespaces.put(gir, includedNamespaces);
	}
	
	public Set<Document> getIncluders(Document doc) {
		Set<Document> ret = new HashSet<Document>();
		NamespaceDescriptor docNs = girToNamespace.get(doc);
		
		for (Document candidate : girToIncludedNamespaces.keySet()) {
			List<NamespaceDescriptor> includes = girToIncludedNamespaces.get(candidate);
			if (includes.contains(docNs)) {
				ret.add(candidate);
			}
		}
		
		return ret;
	}
	
	public Set<Document> getIncludees(Document doc) {
		Set<Document> ret = new HashSet<Document>();
		
		List<NamespaceDescriptor> includesList = girToIncludedNamespaces.get(doc);
		if (includesList == null) {
			return ret;
		}
		
		for (NamespaceDescriptor ns : includesList) {
			ret.add(namespaceToGir.get(ns));
		}
		
		return ret;
	}
	
	public boolean hasIncludes() {
		for (Document doc : girToIncludedNamespaces.keySet()) {
			List<NamespaceDescriptor> includesList = girToIncludedNamespaces.get(doc);
			if ( (includesList != null) && (!includesList.isEmpty()) ) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Get a list of the .gir Documents tracked by this instance in topologically sorted order.
	 * The basis of the sorting is the include dependency graph. In other words, if Document A
	 * includes the namespace defined in Document B, then Document B will precede Document A in
	 * the returned list.
	 * @return
	 */
	public List<Document> getGirsTopoSorted() {
		List<Document> ret = new ArrayList<Document>();
		Set<Document> startingNodes = new HashSet<Document>(girs);
		
		//find all the documents that are not included from anywhere
		//Note: this might make this solution less efficient than reversing all edges, then toposorting
		Set<Document> includedDocs = new HashSet<Document>();
		for (Document doc : girToIncludedNamespaces.keySet()) {
			for (NamespaceDescriptor include : girToIncludedNamespaces.get(doc)) {
				includedDocs.add(namespaceToGir.get(include));
			}
		}
		startingNodes.removeAll(includedDocs);
		
		GirDependencyGraph.WithRemovableIncludes workingCopy = new GirDependencyGraph.WithRemovableIncludes(this);
		
		while (!startingNodes.isEmpty()) {
			Document nextDoc = startingNodes.iterator().next();
			startingNodes.remove(nextDoc);
			ret.add(nextDoc);
			
			for(Document includee : workingCopy.getIncludees(nextDoc)) {
				workingCopy.removeInclude(nextDoc, girToNamespace.get(includee));
				if (workingCopy.getIncluders(includee).isEmpty()) {
					startingNodes.add(includee);
				}
			}
		}
		
		if (workingCopy.hasIncludes()) {
			throw new IllegalArgumentException("The include graph seems to contain one or more cycles. This is bad. Working copy: " + workingCopy);
		}
		
		//reverse the list
		for (int i = 0; i < (ret.size() / 2); i++) {
			Document tmp = ret.get(i);
			ret.set(i, ret.get(ret.size() - 1 - i));
			ret.set(ret.size() - 1 - i, tmp);
		}
		
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Dependency graph summary:\n");
		Set<NamespaceDescriptor> referredNamespaces = new HashSet<NamespaceDescriptor>();
		
		sb.append("Namespace dependencies:\n");
		for (Document doc : girToIncludedNamespaces.keySet()) {
			sb.append(girToNamespace.get(doc));
			sb.append('\n');
			List<NamespaceDescriptor> dependencies = girToIncludedNamespaces.get(doc);
			if (dependencies == null) {
				continue;
			}
			for (NamespaceDescriptor ns : dependencies) {
				referredNamespaces.add(ns);
				sb.append(" - ");
				sb.append(ns);
				sb.append('\n');
			}
		}
		
		sb.append("\nNamespace to document bindings:\n");
		for (NamespaceDescriptor ns : namespaceToGir.keySet()) {
			sb.append(ns);
			sb.append(" -> ");
			sb.append(namespaceToGir.get(ns).getBaseURI());
			sb.append('\n');
		}
		
		referredNamespaces.removeAll(namespaceToGir.keySet());
		
		sb.append('\n');
		if (referredNamespaces.isEmpty()) {
			sb.append("No unbound namespaces");
		} else {
			sb.append("Unbound namespaces:\n");
			for (NamespaceDescriptor ns : referredNamespaces) {
				sb.append(ns);
				sb.append('\n');
			}
		}
		
		return sb.toString();
	}
}
