package javaAssignment;

public class Meals {

	static double mealPriceForAdultCruise = 20.99;
	static double mealPriceForKidCruise = 4.99;
	static double mealPriceForKidBelow5 = 0.00;

	public static double getMealPriceForAdultCruise() {
		return mealPriceForAdultCruise;
	}

	public static double getMealPriceForKidCruise() {
		Cruise trip = new Cruise();
		if (trip.ageOfKids < 5) {
			return mealPriceForKidBelow5;
		}
		return mealPriceForKidCruise;
	}

	public static double getMealPriceForKidBelow5() {
		return mealPriceForKidBelow5;
	}

}
