package canadaWonderland;

public class RideBehemoth extends WonderlandRides {
	private String funPixCard;

	public RideBehemoth(int heightInInches) {
		super(heightInInches);

	}

	@Override
	String validateHeightCheck(int HeightInInches) {
		if ((HeightInInches >= 54) && (HeightInInches <= 80)) {
			return "Behemoth";
		}
		return "";
	}

	void durationOfRideBehemoth() {
		System.out.println("The estimated duration of behemoth is approximately 3 minutes ");
	}

	void specialOffer() {
		System.out.println("Please enter Y if you have fun pix card");
		funPixCard = sc.next();
		if (funPixCard.equalsIgnoreCase("Y")) {
			System.out.println(" waoohoo! show your FunPix card and collect your on-ride photo.");
		} else {
			System.out.println("Invalid entry... not eligible for on-ride photo");
		}

	}
}
