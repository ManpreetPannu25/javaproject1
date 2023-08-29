package javaAssignment;

public class DiscoveryCruise extends Cruise {
	public DiscoveryCruise(CruiseType cruiseType, double priceForAdult, double priceForKid, int numOfDays) {
		super(cruiseType, priceForAdult, priceForKid, numOfDays);
		// TODO Auto-generated constructor stub
	}

	static double adventureGames = 50;

	public double advemtureGameTicket() {
		return adventureGames;
	}

}
