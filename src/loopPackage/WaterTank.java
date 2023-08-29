package loopPackage;

public class WaterTank {
	int tankTotalCapacity = 100;
	double waterLevel = 50;
	int bucketCapacity = 10;
	double tankMaxCapacity = 95;// assumed max water capacity for the tank to avoid overflow
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
				System.out.println(
						"Water tank is already at its max capacity of " + waterLevel + " litres, avoid overflow...");
				break;
			}

			System.out.println("Tank water level is " + waterLevel + " litres ");
			waterLevel += bucketCapacity;
		}
		System.out.println("Tank water level is " + waterLevel + " litres ");
	}
}
