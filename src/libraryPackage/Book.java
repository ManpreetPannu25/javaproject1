package libraryPackage;

public class Book {
	String bookName;
	String bookAuthor;
	boolean isBookIssued;

	public Book(String authorOfBook, String nameOfBook, boolean isIssued) {
		bookName = nameOfBook;
		bookAuthor = authorOfBook;
		isBookIssued = isIssued;

	}
}
