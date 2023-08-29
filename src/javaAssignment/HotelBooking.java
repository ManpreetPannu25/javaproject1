package javaAssignment;

import java.util.Scanner;

public class HotelBooking {

	static double priceForDeluxe = 180;
	static double priceForFamilySuite = 230;
	static double hotelLunchPriceForAdult = 25;
	static double hotelLunchPriceForChild = 5;

	Rooms roomType;

	public HotelBooking(Rooms roomType) {
		this.roomType = roomType;
	}

	enum Rooms {
		DELUXEROOM("Deluxe_Room"), FAMILYSUITE("Family_Suite");

		String roomType;

		Rooms(String roomType) {
			this.roomType = roomType;
		}

		public String getTypeOfRoom() {
			return roomType;
		}

	}

	static Scanner sc = new Scanner(System.in);

	public static void displayMenu(String prefferedRoom, Cruise trip, int userDaysInput) {
		System.out.println("Please enter the room you want to stay. \nDeluxe_Room \nFamily_Suite");
		System.out.println("Deluxe Room : accomodates 2 adults and 2 children at the rate of $180/night.");
		System.out.println("Family Suite : accomodates 4 adults and 4 children at the rate of $230/night.");
		prefferedRoom = sc.next();

		int adultCount = trip.getNumOfAdults();
		int kidCount = trip.getNumOfKids();
		int totalGuest = adultCount + kidCount;
		if (totalGuest > 4 && prefferedRoom.equalsIgnoreCase("Deluxe_Room")) {
			System.out.println("Room is not suitable for the number of guests.Please try again ");

		} else if (totalGuest > 8 && prefferedRoom.equalsIgnoreCase("Family_Suite")) {
			System.out.println("Room is not suitable for the number of guests. Please try again");
		} else {
			System.out.println(
					"All the rooms come with free breakfast.Do you want to add lunch in your room as well as prebooking discounted pre-booking rate of $25/adult and $5/child .. Please enter Yes if you want meal");
			String mealChoice = sc.next();
			if (mealChoice.equalsIgnoreCase("Yes")) {
				PackageBill.hotelPriceCalWithMeal(userDaysInput);
			} else if (mealChoice.equalsIgnoreCase("No")) {
				PackageBill.hotelBookingPriceWithoutMeal(prefferedRoom, userDaysInput);
			} else {
				System.out.println("Invalid Selection");
			}
		}
	}
}
