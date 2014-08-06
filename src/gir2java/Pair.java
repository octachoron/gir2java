package gir2java;

/**
 * The usual Pair class. Immutable by default, but can be subclassed to make a mutable version.
 * @author relek
 *
 * @param <TA>
 * @param <TB>
 */
public class Pair<TA, TB> {
	
	protected TA a;
	protected TB b;
	
	public Pair(TA a, TB b) {
		this.a = a;
		this.b = b;
	}
	
	TA getA() {
		return a;
	}
	
	TB getB() {
		return b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

}
