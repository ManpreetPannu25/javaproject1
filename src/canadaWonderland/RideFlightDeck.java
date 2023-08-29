package canadaWonderland;

public class RideFlightDeck extends WonderlandRides {

	public RideFlightDeck(int heightInInches) {
		super(heightInInches);

	}

	@Override
	String validateHeightCheck(int HeightInInches) {
		if ((HeightInInches >= 52) && (HeightInInches <= 78))
			return "Flightdeck";

		return "";
	}

	void durationOfRideFlightDeck() {
		System.out.println("The estimated duration of FlightDeck is approximately 2 minutes");
	}
}