package bookStore;

public class BookStoreOwner extends java.lang.Object {
	private String name;
	private int id;
	public BookStoreOwner(java.lang.String name) {
		this.name = name;
	}
	public long getID() {
		return this.id;
	}
	public java.lang.String getName(){
		return this.name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		BookStoreOwner other = (BookStoreOwner) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public java.lang.String toString(){
		return "("+this.name+", "+this.id+")";
	}
}
