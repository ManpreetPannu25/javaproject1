package loopPackage;

public class ChocolatesClass {

	int chocolates = 27;

	void adding5Chocolates() {
		while (chocolates <= 63) {
			if (chocolates == 63) {
				break;
			}
			System.out.println("Number of chocolates in a box " + chocolates);
			chocolates += 5;

		}
	}
}