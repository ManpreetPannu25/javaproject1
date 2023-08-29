package canadaWonderland;

import java.util.Scanner;

public class WonderlandRides {
	Scanner sc = new Scanner(System.in);

	private int heightInInches;

	public WonderlandRides(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	String validateHeightCheck(int heightInInches) {
		if (heightInInches >= 48)
			return "You are eligible for given rides according to your height";
		else
			return "Not eligible for rides";
	}

	void rideSafetyRegulations() {
		System.out.println("IMPORTANT SAFETY REGULATIONS");
		System.out.println(
				"Guests with a cervical collar, neck brace, broken collar bone, full arm cast, braced arm cast, or full leg cast are not permitted to ride");
	}

	void priceOfLaneCard() {
		System.out.println("Do you want BUY lane pass to buypass the regular lines?");
		System.out.println("Enter Y for yes Or N for No to get the price of different lane passes");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the type of entry lane pass you want...either FastLane OR FastLanePlus");
			String typeOfLaneEntryPass = sc.next();
			double amount = typeOfLaneEntryPass.equalsIgnoreCase("FastLane") ? (75 + (0.13 * 75)) : (85 + (0.13 * 85));
			System.out.println("The price of " + typeOfLaneEntryPass + " is: " + amount);
		} else if (answer.equalsIgnoreCase("N")) {
			System.out.println("No worries, continue with long line-up");
		} else {
			System.out.println("Invalid entry ");
		}
	}

	void durationOfRide() {
		System.out.println("The estimated duration of Wonderland Rides is between 2- 5 minutes");
	}

}
