package loopPackage;

public class ChocolatesClass {

	int chocolates;
	int finalNumberOfChocolates;

	void adding5Chocolates() {
		while (chocolates <= finalNumberOfChocolates) {
//			if (chocolates==finalNumberOfChocolates) {
//				break;
		}
			System.out.println("Number of chocolates in a box " + chocolates);
			chocolates += 5;

		}
	}
