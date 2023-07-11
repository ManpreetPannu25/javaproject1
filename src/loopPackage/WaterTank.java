package loopPackage;

public class WaterTank {
	int tankFinalCapacity;
	int waterLevel;

	void tankFillingMechanism() {
		while (waterLevel <= tankFinalCapacity) {

			if (waterLevel == tankFinalCapacity) {
				System.out.println("Water capacity has reached to its maximum...Stop adding more water");
				break;
			}
			System.out.println("Tank water level is " + waterLevel + "litres");
			waterLevel += 10;
		}
	}
}
