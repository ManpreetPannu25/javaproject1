package arrayPackage;

import java.util.Scanner;

public class MobileBrandMain {

	public static void main(String[] args) {
		MobileBrandAssignment phones = new MobileBrandAssignment();
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Please type the Brand name(Samsung/Google/Apple) to see the available products in that category");
		phones.enteredBrandName = sc.next();
		phones.verifySelectedBrandAndItsProducts();

	}
}