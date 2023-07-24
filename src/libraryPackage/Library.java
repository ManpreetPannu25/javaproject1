package libraryPackage;

public class Library {
	String libraryName;
	String libraryAddress;
	Book[] books;

	public Library(String nameOfLibrary, Book[] booksAvailable, String addressOfLibrary) {
		libraryName = nameOfLibrary;
		books = booksAvailable;
		libraryAddress = addressOfLibrary;
	}
}
