package libraryPackage;

import java.util.Scanner;

import libraryPackage.Book.BookType;

public class Library {
	String libraryName;
	String libraryAddress;
	Book[] books;

	public Library(String libraryName, String libraryAddress, Book[] books) {
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.books= books;
	}

	// FICTIONAL
	Book f1 = new Book("JK_Rowling", "Goblet_of_fire", false, BookType.FICTIONAL);
	Book f2 = new Book("Hernan Diaz", "Trust", false, BookType.FICTIONAL);
	Book f3 = new Book("Lucinda Riley", "The story of Pa Salt", false, BookType.FICTIONAL);
	Book f4 = new Book("Hanya Yanagihara", "To Paradise", false, BookType.FICTIONAL);
	Book f5 = new Book("Jane Harper", "Exiles", false, BookType.FICTIONAL);
	// HORROR
	Book h1 = new Book("William Peter Blatty", "The Exorcist", false, BookType.HORROR);
	Book h2 = new Book("Scott Smith", "The Ruins", false, BookType.HORROR);
	Book h3 = new Book("Helen Oyeyemi", "White is for Witching", false, BookType.HORROR);
	Book h4 = new Book("Stephen King", "It", false, BookType.HORROR);
	Book h5 = new Book("Richard Preston", "The Hot Zone", false, BookType.HORROR);

	// ROMANIC
	Book r1 = new Book("Jasmine Guillory", "The Proposal", false, BookType.ROMANTIC);
	Book r2 = new Book("Sally Thorne", "The Hating Game", false, BookType.ROMANTIC);
	Book r3 = new Book("Nora Roberts", "Vision In White", false, BookType.ROMANTIC);
	Book r4 = new Book("Sylvia Day", "Bared To You", false, BookType.ROMANTIC);
	Book r5 = new Book("Anais Nin", "Delta Of Venus", false, BookType.ROMANTIC);
	// BIOGRAPHY
	Book b1 = new Book("Christian Lewis", "Finding Hildasay", false, BookType.BIOGRAPHY);
	Book b2 = new Book("Carolyn Hays", "A Girlhood", false, BookType.BIOGRAPHY);
	Book b3 = new Book("Prince Harry", "Spare", false, BookType.BIOGRAPHY);
	Book b4 = new Book("Harriet Gibsone", "Is This Ok?", false, BookType.BIOGRAPHY);
	Book b5 = new Book("Polly Morland", "A Fortunate Women", false, BookType.BIOGRAPHY);
	// MYSTERY
	Book m1 = new Book("Brendan Slocumb", "The Violin Conspiracy", false, BookType.MYSTERY);
	Book m2 = new Book("Richard Osman", "The Bullet That Missed", false, BookType.MYSTERY);
	Book m3 = new Book("Sulari Gentill", "The Woman in the Library", false, BookType.MYSTERY);
	Book m4 = new Book("Linda Castillo", "Fallen", false, BookType.MYSTERY);
	Book m5 = new Book("Tracy Clark", "Runner", false, BookType.MYSTERY);

	Book[] allBooks = { f1, f2, f3, f4, f5, h1, h2, h3, h4, h5, r1, r2, r3, r4, r5, b1, b2, b3, b4, b5, m1, m2, m3, m4,
			m5 };

	UserDetails u1 = new UserDetails("Manpreet", "aaaa", "1111");
	UserDetails u2 = new UserDetails("Pawandeep", "bbbb", "2222");
	UserDetails u3 = new UserDetails("Guntaas", "cccc", "3333");
	UserDetails u4 = new UserDetails("Ramandeep", "dddd", "4444");
	UserDetails u5 = new UserDetails("Parminder", "eeee", "5555");

	UserDetails[] allMembers = { u1, u2, u3, u4, u5 };

	Scanner sc = new Scanner(System.in);

	boolean memberLogIn(String enteredName, String enteredPassword, String enteredId) { // case 1
		int loginAttempt = 1;
		boolean loginStatus = false;

		System.out.println("Enter your Name:");
		enteredName = sc.next();
		System.out.println("Enter your Id:");
		enteredId = sc.next();
		System.out.println("Enter your password");
		enteredPassword = sc.next();

		while (loginAttempt < 5) {
			System.out.println("Login attempt number:" + loginAttempt);
			for (int i = 0; i < allMembers.length; i++) {
				if (allMembers[i].getMemberName().equalsIgnoreCase(enteredName)
						&& (allMembers[i].getMembershipId().equals(enteredId))
						&& allMembers[i].getMemberPassword().equalsIgnoreCase(enteredPassword)) {
					loginStatus = true;
					System.out.println(allMembers[i].getMemberName() + " is logged into the application");
					System.out.println("Please enter 3 to borrow books"); // case 3
					return loginStatus;
				}
			}
			loginAttempt++;
			if (loginStatus == false && loginAttempt < 5) {
				System.out.println("Incorrect enteries.Please Try again");
			} else {
				System.out.println("You have reached the maximum number of login attempts.Please try again later!");
			}
		}
		return loginStatus;
	}

	void validateGuestLogIn(String guestName, String guestEmail) { // case 2
		System.out.println("Enter your name");
		guestName = sc.next();
		System.out.println("Enter your email address to sign in as a guest");
		guestEmail = sc.next();
		System.out.println("WELCOME to the online library as a guest. Press 4 to  view the available books"); // case 4
	}

	String displayBooksToGuest(String enteredGenere) { // case 4
		boolean isValidGenere = false;
		for (int i = 0; i < allBooks.length; i++) {
			if (allBooks[i].getBookGenere().getGenere().equalsIgnoreCase(enteredGenere))
				isValidGenere = true;
			System.out.println(allBooks[i].getBookName());
		}
		if (isValidGenere == false) {
			System.out.println(enteredGenere + " This genere books are not available at this library");
		}
		return null;
	}
}
