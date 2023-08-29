package javaAssignment;

import java.util.Scanner;

public class PackageBill {

	public void getNumOfAdults(Cruise trip) {
		trip.getNumOfAdults();
	}

	public void getNumOfKids(Cruise trip) {
		trip.getNumOfKids();
	}

	static Scanner sc = new Scanner(System.in);


	public static double getCruisePriceAdult(Cruise cruise, String prefferedCruise) {
		if (prefferedCruise.equalsIgnoreCase("Scenic_Cruise")) {
			return cruise.priceForAdult;
		} else if (prefferedCruise.equalsIgnoreCase("Sunset_Cruise")) {
			return cruise.priceForAdult;
		} else if (prefferedCruise.equalsIgnoreCase("Discovery_Cruise")) {
			return cruise.priceForAdult;
		} else if (prefferedCruise.equalsIgnoreCase("Mystery_Cruise")) {
			return cruise.priceForAdult;
		}

		return cruise.priceForAdult;
	}

	public static double getCruisePriceKid(Cruise trip, String prefferedCruise) {
		if (trip.ageOfKids > 5) {
			if (prefferedCruise.equalsIgnoreCase("Scenic_Cruise")) {
				return trip.priceForKid;
			} else if (prefferedCruise.equalsIgnoreCase("Sunset_Cruise")) {
				return trip.priceForKid;
			} else if (prefferedCruise.equalsIgnoreCase("Discovery_Cruise")) {
				return trip.priceForKid;
			} else if (prefferedCruise.equalsIgnoreCase("Mystery_Cruise")) {
				return trip.priceForKid;
			}
		} else {
			return Cruise.PRICEFORKIDSBELOW_AGE5;
		}

		return trip.priceForKid;
	}

	public static double getSpecialOfferPrice(Cruise trip, String prefferedCruise) {
		int numOfAdults = trip.getNumOfAdults();
		int numOfKids = trip.getNumofkidsabovefive();
		double specialOffferPrice = 0.0;

		if (prefferedCruise.equalsIgnoreCase("Scenic_Cruise")) {
			specialOffferPrice = (numOfAdults + numOfKids) * ((ScenicCruise) trip).getSpaPrice();
			return specialOffferPrice;

		} else if (prefferedCruise.equalsIgnoreCase("Sunset_Cruise")) {
			specialOffferPrice = (numOfAdults + numOfKids) * ((SunsetCruise) trip).getDinnerPrice();
			return specialOffferPrice;

		} else if (prefferedCruise.equalsIgnoreCase("Discovery_Cruise")) {
			specialOffferPrice = (numOfAdults + numOfKids) * ((DiscoveryCruise) trip).advemtureGameTicket();
			return specialOffferPrice;

		} else if (prefferedCruise.equalsIgnoreCase("Mystery_Cruise")) {
			specialOffferPrice = (numOfAdults + numOfKids) * ((MysteryCruise) trip).getCasinoFee();
			return specialOffferPrice;

		}

		return specialOffferPrice;

	}

	public static void calculateTotal(Cruise trip, Meals meal, String prefferedCruise, double specialOfferPrice) {

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffer meals at $20.99 for adults and $4.99 for kids?\n Please enter YES if you are interested for buffer");
		String input = sc.next();
		if (input.equalsIgnoreCase("Yes")) {
			int numOfAdults = trip.getNumOfAdults();
			int numOfKids = trip.getNumOfKids();
			double cruisePriceForAdult = numOfAdults * getCruisePriceAdult(trip, prefferedCruise)
					* trip.getNumOfDays(prefferedCruise);
			double cruisePriceForKid = numOfKids * getCruisePriceKid(trip, prefferedCruise)
					* trip.getNumOfDays(prefferedCruise);
			double buffetPriceForAdult = numOfAdults * Meals.getMealPriceForAdultCruise()
					* trip.getNumOfDays(prefferedCruise);
			double buffetPriceForKids = numOfKids * Meals.getMealPriceForKidCruise()
					* trip.getNumOfDays(prefferedCruise);
			double totalPackagePrice = cruisePriceForAdult + cruisePriceForKid + buffetPriceForAdult
					+ buffetPriceForKids + specialOfferPrice;
			double hst = ((15 * totalPackagePrice) / 100);
			double finalPrice = (totalPackagePrice + hst);

			System.out.println("Your package includes: ");
			System.out.println(prefferedCruise + " adults @ " + trip.numOfAdults + " : " + cruisePriceForAdult);
			System.out.println(prefferedCruise + "Children above 5  @ " + trip.numOfKids + " : " + cruisePriceForKid);
			System.out.println("Buffet special price Adults @ " + trip.numOfAdults + " : " + buffetPriceForAdult);
			System.out.println("Buffet Special price for children above 5 @ " + numOfKids + " : " + buffetPriceForKids);
			System.out.println("Total Price : " + totalPackagePrice);
			System.out.println("HST @ 15% : $" + hst);
			System.out.println("Final Price : $" + finalPrice);

		} else if (input.equalsIgnoreCase("No")) {
			int numOfAdults = trip.getNumOfAdults();
			int numOfKids = trip.getNumofkidsabovefive();
			double cruisePriceForAdult = numOfAdults * getCruisePriceAdult(trip, prefferedCruise)
					* trip.getNumOfDays(prefferedCruise);
			double cruisePriceForKid = numOfKids * getCruisePriceKid(trip, prefferedCruise)
					* trip.getNumOfDays(prefferedCruise);
			double totalPackagePrice = cruisePriceForAdult + cruisePriceForKid + specialOfferPrice;
			double hst = ((15 * totalPackagePrice) / 100);
			double finalPrice = (totalPackagePrice + hst);

			System.out.println("Your package includes: ");
			System.out.println(prefferedCruise + " adults @ " + trip.numOfAdults + " : " + cruisePriceForAdult);
			System.out.println(prefferedCruise + "Children above 5  @ " + trip.numOfKids + " : " + cruisePriceForKid);
			System.out.println("Total Price : " + totalPackagePrice);
			System.out.println("HST @ 15% : $" + hst);
			System.out.println("Final Price : $" + finalPrice);
		} else {
			System.out.println("Invalid Selection");
		}

	}

//....................................................................................................//
	public static void hotelBookingPrice(String prefferedRoom) {
		System.out.println("Enter the number days you want to stay");
		int userDaysInput = sc.nextInt();
		System.out.println("The amount you will charged is");
		switch (prefferedRoom) {
		case "Deluxe_Room":
			System.out.println(
					prefferedRoom + " @ " + userDaysInput + ": " + userDaysInput * HotelBooking.priceForDeluxe);
			break;
		case "Family_Suite":
			System.out.println(
					prefferedRoom + " @ " + userDaysInput + ": " + userDaysInput * HotelBooking.priceForFamilySuite);
			break;
		}
	}

	public static void hotelPriceCalWithMeal(int userDaysInput) {
		double lunchPriceForAdult = userDaysInput * HotelBooking.hotelLunchPriceForAdult;
		double lunchPriceForChild = userDaysInput * HotelBooking.hotelLunchPriceForChild;
		double totalPrice = lunchPriceForAdult + lunchPriceForChild;
		double hst = (18 * totalPrice) / 100;
		double finalPrice = hst + totalPrice;
		System.out.println("Lunch Pre-Booked Special Rate Adults @" + userDaysInput + ": " + lunchPriceForAdult);
		System.out.println("Lunch Pre-Booked Special Rate Children @" + userDaysInput + ": " + lunchPriceForChild);
		System.out.println("Total Price :" + totalPrice);
		System.out.println("HST @18 : " + hst);
		System.out.println("Final Price : " + finalPrice);
	}

	public static void hotelBookingPriceWithoutMeal(String prefferedRoom, int userDaysInput) {
		System.out.println("The amount you will charged is");
		switch (prefferedRoom) {
		case "Deluxe_Room":
			double totalPrice = userDaysInput * HotelBooking.priceForDeluxe;
			System.out.println(prefferedRoom + " @ " + userDaysInput + ": " + totalPrice);
			double hst = (18 * totalPrice) / 100;
			double finalPrice = hst + totalPrice;
			System.out.println("Total Price :" + totalPrice);
			System.out.println("HST @18 : " + hst);
			System.out.println("Final Price : " + finalPrice);
			break;
		case "Family_Suite":
			double totalPriceFS = userDaysInput * HotelBooking.priceForFamilySuite;
			System.out.println(prefferedRoom + " @ " + userDaysInput + ": " + totalPriceFS);
			double hstFS = (18 * totalPriceFS) / 100;
			double finalPriceFS = hstFS + totalPriceFS;
			System.out.println("Total Price :" + totalPriceFS);
			System.out.println("HST @18 : " + hstFS);
			System.out.println("Final Price : " + finalPriceFS);
			break;
		}
	}

}
