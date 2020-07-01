package bookStore;

public class SortBooksbyYear extends java.lang.Object implements java.util.Comparator<Book> {
	public SortBooksbyYear() {
	}
	public int compare(Book book1, Book book2) {
		if(book1.getyearPublished()>book2.getyearPublished()) {
			return 1;
		}
		if(book1.getyearPublished()<book2.getyearPublished()) {
			return -1;
		}
		else {
			return 0;
		}
			
	}
}
