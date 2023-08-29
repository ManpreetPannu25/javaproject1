package javaAssignment;

public class MysteryCruise extends Cruise {
	public MysteryCruise(CruiseType cruiseType, double priceForAdult, double priceForKid, int numOfDays) {
		super(cruiseType, priceForAdult, priceForKid, numOfDays);
		// TODO Auto-generated constructor stub
	}

	double casinoEntryFee = 20;

	public double getCasinoFee() {
		return casinoEntryFee;
	}

}
