package loopPackage;

public class WaterTankMain {

	public static void main(String[] args) {
		WaterTank capacity = new WaterTank();

		capacity.waterLevel = 0;
		capacity.tankFinalCapacity = 100;
		capacity.tankFillingMechanism();

	}

}
