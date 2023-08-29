package canadaWonderland;

public class RideLumberjack extends WonderlandRides {

	public RideLumberjack(int heightInInches) {
		super(heightInInches);

	}

	@Override
	String validateHeightCheck(int HeightInInches) {
		if (HeightInInches >= 48)
			return "Lumberjack";

		return "";
	}

	void durationOfRideLumberjack() {
		System.out.println("The estimated duration of Lumberjack is approximately 2 minutes");
	}

	void validatePhysicalHealth() {
		String OneArmWithHand;
		String OneFootWithLeg;
		System.out.println("IMPORTANT- PHYSICAL REQUIREMENTS");
		System.out.println(
				"Do you have 1 functioning arm with a hand (excluding prosthesis).Please type Y  for yes and N for No");
		OneArmWithHand = sc.next();
		System.out.println(
				"Do you have 1 functioning leg with a foot (excluding prosthesis).Please type Y  for yes and N for No");
		OneFootWithLeg = sc.next();
		if (OneArmWithHand.equalsIgnoreCase("Y") && OneFootWithLeg.equalsIgnoreCase("Y"))
			System.out.println(" You are eligible for Ride - Lumberjack");

		else
			System.out.println(" You are not eligible for Ride - Lumberjack");
	}
}
