package libraryPackage;

import java.util.Scanner;

import libraryPackage.Book.BookType;

public class OnlineLibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDetails user = new UserDetails();
		BookKeeping bookHandling= new BookKeeping();
		DeliveryService delivery= new DeliveryService();
		Library cambridgeLibrary = new Library("Cambridge_Library", "12 Water st South");

		System.out.println(
				"WELCOME TO THE ONLINE LIBRARY..Press option-" + 1 +" to start as a Library Member OR Press option-" +2+ "to start as  a Guest");
		System.out.println("NOTE: Only library members can borrow books. Guests can only view books");

		boolean memberLogIn = cambridgeLibrary.memberLogIn( enteredName, enteredPassword, enteredId);
	
		
		if (memberLogIn == true) {
			
		}
		int option = sc.nextInt();
		
		switch (option) {
		
		case 1:
			cambridgeLibrary.memberLogIn("", "", "");
			
		case 2:
			user.validateGuestLogIn(String guestName, String guestEmail)
	
			
		case 3:
			bookHandling.toBorrowBooks(Book[] allBooks, String bookName, boolean isBookIssued) 
			
		case 4:
			
			bookHandling.viewLibraryBooks(Book[] allBooks)
			
		case 5:
			delivery.getDeliveryType(String deliverType, UserDetails user, String libraryName)
		
			default:
			System.out.println("Invalid entry");
}
