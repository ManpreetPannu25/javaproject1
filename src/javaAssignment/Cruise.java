package javaAssignment;

import java.util.Scanner;

public class Cruise extends UserDetails {

	CruiseType cruiseType;
	double priceForAdult;
	double priceForKid;
	int numOfDays;
	static int PRICEFORKIDSBELOW_AGE5 = 0;

	int numOfAdults;
	int numOfKids;
	int ageOfKids;
	int kidsAboveFive;
	int kidsbelowfive;

	public Cruise(CruiseType cruiseType, double priceForAdult, double priceForKid, int numOfDays) {
		this.cruiseType = cruiseType;
		this.priceForAdult = priceForAdult;
		this.priceForKid = priceForKid;
		this.numOfDays = numOfDays;
	}

	public Cruise(int numOfAdults, int numOfKids, int ageOfKids) {

		this.numOfAdults = numOfAdults;
		this.numOfKids = numOfKids;
		this.ageOfKids = ageOfKids;
	}

	public Cruise() {
	}

	public int getNumOfDays(String prefferedCruise) {
		return numOfDays;
	}

	public double getPriceForAdult(String prefferedCruise) {
		return priceForAdult;
	}

	public double getPriceForKid(String prefferedCruise) {
		return priceForKid;
	}

	Scanner sc = new Scanner(System.in);

	public void cruiseOption() {
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select");
		System.out.println("Scenic_Cruise \nSunset_Cruise \nDiscovery_Cruise \nMystery_Cruise");
	}

	public void cruiseDetails(String prefferedCruise) {
		// prefferedCruise = sc.next();
		System.out.println("The cruise you have entered is " + prefferedCruise + " which is a "
				+ getNumOfDays(prefferedCruise) + " day/s ");
		System.out.println(
				"Price for adults with age greater than 12 years: " + getPriceForAdult(prefferedCruise) + " per day");
		System.out.println("Price for kids above 5 years: " + getPriceForKid(prefferedCruise) + " per day");
	}

	public int getNumOfAdults() {
		System.out.println("Enter the number of Adults");
		return numOfAdults = sc.nextInt();

	}

	public int getNumOfKids() {
		System.out.println("Enter the number of Kids");
		numOfKids = sc.nextInt();
		int i = 1;

		do {
			if (numOfKids > 0) {
				System.out.println("Enter the age of Child " + i);
				ageOfKids = sc.nextInt();
				if (ageOfKids > 5)
					kidsAboveFive++;
				else
					kidsbelowfive++;
				i++;
			}
		} while (i <= numOfKids);
		return kidsAboveFive;
	}

	public int getNumofkidsabovefive() {
		return kidsAboveFive;
	}

	public void anotherSelection(String prefferedCruise) {
		System.out.println(
				"Please press Y if you want to continue with the selection or press any other alphabet to select another cruise");
		String userInput = sc.next();
		if (userInput.equalsIgnoreCase("Y")) {
			getNumOfAdults();
			getNumOfKids();

		} else {
			cruiseOption();
			String nextOption = sc.next();
			cruiseDetails(nextOption);
		}
	}
}
