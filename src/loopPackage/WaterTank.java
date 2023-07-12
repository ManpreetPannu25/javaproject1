package loopPackage;

public class WaterTank {
	int tankTotalCapacity = 100;
	double waterLevel = 15;
	int bucketCapacity = 10;
	double tankMaxCapacity = 91;// assumed max water capacity for the tank to avoid overflow
	double requiredWater; // (water required at the end to fill the tank at its exact Max capacity,despite
							// bucket capacity)

	void tankFillingMechanism() {
		while (waterLevel <= tankTotalCapacity) {
			if (waterLevel > tankMaxCapacity) {
				requiredWater = (bucketCapacity - (waterLevel - tankMaxCapacity));
				System.out.println("Add only " + requiredWater
						+ " litres water on top of it,to fill the tank at its max water Level");
				break;
			} else if (waterLevel == tankMaxCapacity) {
				System.out.println("Water tank is already at its max capacity,avoid overflow...");

			}
			System.out.println("Tank water level is " + waterLevel + " litres ");
			waterLevel += bucketCapacity;
		}
	}
}
