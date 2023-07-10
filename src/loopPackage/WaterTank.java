package loopPackage;

public class WaterTank {
	int tankFinalCapacity;

	void tankFillingMechanism() {
		while (tankFinalCapacity <= 100) {
			System.out.println("Tank capacity " + tankFinalCapacity);

			if (tankFinalCapacity == 100) {
				System.out.println("Water capacity has reached to maximum of 100 litres...Stop adding more water");
				break;
			}
			tankFinalCapacity += 10;
		}
	}
}