package javaAssignment;

public class ScenicCruise extends Cruise {
	public ScenicCruise(CruiseType cruiseType, double priceForAdult, double priceForKid, int numOfDays) {
		super(cruiseType, priceForAdult, priceForKid, numOfDays);
		// TODO Auto-generated constructor stub
	}

	double scenicSpaPrice = 50;

	public double getSpaPrice() {
		return scenicSpaPrice;

	}
}
