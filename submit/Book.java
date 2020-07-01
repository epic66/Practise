package bookStore;

public class Book extends java.lang.Object implements java.lang.Comparable<Book>{
	private String Title;
	private int yearPublished;
	private double price;
	public Book() {
		
	}
	public Book(java.lang.String title,int yearPublished, double price) {
		this.Title = title;
		this.yearPublished = yearPublished;
		this.price = price;
	}
	public Book(Book book) {
		this.Title = book.Title;
		this.yearPublished = book.yearPublished;
		this.price = book.price;
	}
	public int getyearPublished() {
		return this.yearPublished;
	}
	public java.lang.String gettitle(){
		return this.Title;
	}
	public double getPrice() {
		return this.price;
	}
	public java.lang.String toString(){
		return "("+this.Title+", "+this.yearPublished+", "+this.price+")";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + yearPublished;
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
		Book other = (Book) obj;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}
	public int compareTo(Book other) {
		if(this.price>other.price) {
			return 1;
		}
		if(this.price<other.price) {
			return -1;
		}else {
			return 0;
		}
	}
}
