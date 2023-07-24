package libraryPackage;

import java.util.Scanner;

public class OnlineLibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		Book harryPotter = new Book("JK_Rowling", "Goblet_of_fire", false);
		Book famousFive = new Book("Andy_Blyton", "On_an_Island", false);
		Book fivePointSomeone = new Book("Chetan_Bhagat", "Five_Point_Someone", false);
		Book iceAndFire = new Book("R_Martin", "Ice_and_Fire", false);
		Book lordOfTheRings = new Book("JR", "Lord_of_the_Rings", false);
		Book[] allBooksOfLibrary1 = { harryPotter, famousFive, fivePointSomeone, iceAndFire, lordOfTheRings };
		Library torontoLibrary = new Library("Toronto_Public_Library", allBooksOfLibrary1, "110EleventhSt,Toronto,ON");

		Book christmasPig = new Book("JK_Rowling", "The_Christmas_Pig", false);
		Book whereabouts = new Book("Jhumpa_lahiri", "Whereabouts", false);
		Book indiaStory = new Book("Bimal_Jalal", "The_India_Story", false);
		Book richDadPoorDad = new Book("RobertT.Kiyosaki", "Rich_Dad_Poor_Dad", false);
		Book[] allBooksOfLibrary2 = { christmasPig, whereabouts, indiaStory, richDadPoorDad };
		Library vaughanLibrary = new Library("Vaughan_Public_Library", allBooksOfLibrary2,
				"300PleasantRidgeAvenue,Vaughan,ON");

		Library[] allLibraries = { torontoLibrary, vaughanLibrary };

		System.out.println(
				"WELCOME TO THE ONLINE LIBRARY..Enter the valid library name to enjoy books pick up and drop off services");
		String libraryName = sc.next();
		boolean isLibraryAvailable = false;
		for (int j = 0; j < allLibraries.length; j++) {
			if (allLibraries[j].libraryName.equals(libraryName)) {
				isLibraryAvailable = true;
			}
		}
		if (isLibraryAvailable == false) {
			System.out.println("Entered library does not provide online services OR invalid library name");
		} else {
			System.out.println("Please enter your name to start");
			String userName = sc.next();
			System.out.println("Please enter your id associated with this Library");
			String membershipId = sc.next();
			UserDetails user = new UserDetails(userName, membershipId);

			if (libraryName.equals("Toronto_Public_Library")) {
				System.out.println("The requested library is " + libraryName + " with given books to choose");
				for (int i = 0; i < allBooksOfLibrary1.length; i++) {
					System.out.println(allBooksOfLibrary1[i].bookName);
				}
				do {
					System.out.println("Please enter the book you want from this library");
					String bookName = sc.next();

					for (int i = 0; i < allBooksOfLibrary1.length; i++) {
						if ((allBooksOfLibrary1[i].bookName.equals(bookName)
								&& allBooksOfLibrary1[i].isBookIssued == false)) {
							System.out.println("Requested book is available  and eligible to get issued");
							allBooksOfLibrary1[i].isBookIssued = true;
							cnt++;
						} else if ((allBooksOfLibrary1[i].bookName.equals(bookName)
								&& allBooksOfLibrary1[i].isBookIssued == true)) {
							System.out.println("Requested book is already issued.Please choose another book");
							break;
						}
					}
					if (cnt == 0) {
						System.out.println("Requested book is not present in this library OR Invalid book name");
					}
				} while (cnt < 2);
				System.out.println(
						"However,You have reached the maximum limit of books(2) to be issued at a time...Please do not request more books");
			}

			if (libraryName.equals("Vaughan_Public_Library")) {
				System.out.println("The requested library is " + libraryName + " with given books to choose");
				for (int i = 0; i < allBooksOfLibrary2.length; i++) {
					System.out.println(allBooksOfLibrary2[i].bookName);
				}
				do {
					System.out.println("Please enter the book you want from this library");
					String bookName = sc.next();

					for (int i = 0; i < allBooksOfLibrary2.length; i++) {
						if ((allBooksOfLibrary2[i].bookName.equals(bookName)
								&& allBooksOfLibrary2[i].isBookIssued == false)) {
							System.out.println("Requested book is available  and eligible to get issued");
							allBooksOfLibrary2[i].isBookIssued = true;
							cnt++;
						} else if ((allBooksOfLibrary2[i].bookName.equals(bookName)
								&& allBooksOfLibrary2[i].isBookIssued == true)) {
							System.out.println("Requested book is already issued.Please choose another book");
							break;
						}
					}
					if (cnt == 0) {
						System.out.println("Requested book is not present in this library OR Invalid book name");
					}
				} while (cnt < 2);
				System.out.println(
						"However,You have reached the maximum limit of books(2) to be issued at a time...Please do not request more books");
			}
			System.out.println("would you prefer drop_off or pik_up? Select one of the option");
			String deliverType = sc.next();
			if (deliverType.equals("drop_off")) {
				System.out.println("Please enter your address for drop off without any space in between");
				String userAddress = sc.next();
				System.out.println("Dear " + user.userName + " with Id " + membershipId
						+ " will be receiving requested books within 3 days at this address- " + userAddress);
			} else if (deliverType.equals("pik_up")) {
				if (libraryName.equals("Toronto_Public_Library")) {
					System.out.println("Dear " + userName + " with Id " + membershipId
							+ " will be receiving requested books from this address- " + torontoLibrary.libraryAddress);
				} else if (libraryName.equals("Vaughan_Public_Library")) {
					System.out.println("Dear " + userName + " with Id " + membershipId
							+ " will be receiving requested books from this address- " + vaughanLibrary.libraryAddress);
				}

			}

		}
	}
}
