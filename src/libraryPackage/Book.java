package libraryPackage;

public class Book {
	private String bookName;
	private String bookAuthor;
	private boolean isBookIssued;
	private BookType bookGenere;

	public Book(String bookAuthor, String bookName, boolean isBookIssued, BookType bookGenere) {
		this.bookName=bookName;
		this.bookAuthor = bookAuthor;
		this.isBookIssued= isBookIssued;
		this.bookGenere= bookGenere;

	}

	public BookType getBookGenere() {
		return bookGenere;
	}

	public void setBookGenere(BookType bookGenere) {
		this.bookGenere = bookGenere;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isBookIssued() {
		return isBookIssued;
	}

	public void setBookIssued(boolean isBookIssued) {
		this.isBookIssued = isBookIssued;
	}

	enum BookType {
		FICTIONAL("fictional"), 
		HORROR("horror"), 
		ROMANTIC("romantic"), 
		BIOGRAPHY("biography"),
		MYSTERY("mystery");

		private String genere;

		BookType(String typeOfBook) {
			setGenere(typeOfBook);
		}

		public String getGenere() {
			return genere;
		}

		public void setGenere(String genere) {
			this.genere = genere;
		}

		

		
		}

	}

