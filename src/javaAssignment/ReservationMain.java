package javaAssignment;

import java.util.Scanner;

public class ReservationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDetails user = new Cruise();
		Cruise trip = new Cruise();
		Meals meal = new Meals();
		HotelBooking hotel = new HotelBooking(null);

		System.out.println("Please press 1 to Register and Sign in");
		int userInput1 = sc.nextInt();
		if (userInput1 == 1) {
			user.userRegistration(user);
			String userlastChoice = "Y";
			while (userlastChoice.equalsIgnoreCase("Y")) {
				System.out.println(
						"Please press 2 to book Cruise OR press 3 to book Hotel OR Press 4 to update log in Credentials");
				int userInput2 = sc.nextInt();
				if (userInput2 == 2) {
					String prefferedCruise = null;
					trip.cruiseOption();
					prefferedCruise = sc.next();
					switch (prefferedCruise) {
					case "Scenic_Cruise":
						trip = new ScenicCruise(CruiseType.SCENIC_CRUISE, 43.99, 12.99, 3);
						trip.cruiseDetails(prefferedCruise);
						trip.anotherSelection(prefferedCruise);

						PackageBill.calculateTotal(trip, meal, prefferedCruise, ((ScenicCruise) trip).getSpaPrice());

						break;
					case "Sunset_Cruise":
						trip = new SunsetCruise(CruiseType.SUNSET_CRUISE, 52.99, 15.99, 1);
						trip.cruiseDetails(prefferedCruise);
						trip.anotherSelection(prefferedCruise);
						PackageBill.calculateTotal(trip, meal, prefferedCruise, ((SunsetCruise) trip).getDinnerPrice());

						break;
					case "Discovery_Cruise":
						trip = new DiscoveryCruise(CruiseType.DISCOVERY_CRUISE, 39.99, 9.99, 4);
						trip.cruiseDetails(prefferedCruise);
						trip.anotherSelection(prefferedCruise);
						PackageBill.calculateTotal(trip, meal, prefferedCruise,
								((DiscoveryCruise) trip).advemtureGameTicket());

						break;
					case "Mystery_Cruise":
						trip = new MysteryCruise(CruiseType.MYSTERY_CRUISE, 45.99, 12.99, 2);
						trip.cruiseDetails(prefferedCruise);
						trip.anotherSelection(prefferedCruise);
						PackageBill.calculateTotal(trip, meal, prefferedCruise, ((MysteryCruise) trip).getCasinoFee());
						break;
					}
				} else if (userInput2 == 3) {
					// String prefferedRoom;
					HotelBooking.displayMenu(null, trip, userInput2);

				} else if (userInput2 == 4) {

					trip.changePersonalInfo();
					break;
				}

			}
			System.out.println("Do you want to book another cruise or Hotel room..Please press Y to continue");

		}
	}
}
