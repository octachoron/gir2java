package gir2java;

import nu.xom.Element;

public class ParsingSnapshot {
	private ParsingContext context;
	private Element element;
	
	public ParsingSnapshot(ParsingContext context, Element element) {
		this.context = context;
		this.element = element;
	}

	public ParsingContext getContext() {
		return context;
	}

	public Element getElement() {
		return element;
	}
}
