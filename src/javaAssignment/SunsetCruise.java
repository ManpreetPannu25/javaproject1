package javaAssignment;

public class SunsetCruise extends Cruise {
	public SunsetCruise(CruiseType cruiseType, double priceForAdult, double priceForKid, int numOfDays) {
		super(cruiseType, priceForAdult, priceForKid, numOfDays);
		// TODO Auto-generated constructor stub
	}

	double candleLightDinnerPrice = 45;

	public double getDinnerPrice() {
		return candleLightDinnerPrice;
	}

}
