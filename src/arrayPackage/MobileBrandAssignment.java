package arrayPackage;

import java.util.Scanner;

public class MobileBrandAssignment {

	String[] samsungArray = { "S20", "S21", "Flip3", "Fold3" };
	String[] googleArray = { "Google pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] appleArray = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 13" };

	String brandName1 = "Samsung";
	String brandName2 = "Google";
	String brandName3 = "Apple";
	String enteredBrandName;
	String enteredProduct;
	Scanner sc = new Scanner(System.in);

	void verifySamsungProducts() {

		System.out.println("Here is the list of available products under brand Samsung");
		for (int i = 0; i < samsungArray.length; i++) {
			System.out.println(samsungArray[i]);
		}
		System.out.println("Please Enter One product Name from the list");
		enteredProduct = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < samsungArray.length; i++) {
			if (enteredProduct.equals(samsungArray[i])) {
				flag = true;
			}
		}
		if (flag)
			System.out.println("Product selected is " + enteredProduct);
		else
			System.out.println("Please select a product from the list");

	}

	void verifyGoogleProducts() {
		System.out.println("Here is the list of available products under brand Google");
		for (int i = 0; i < googleArray.length; i++) {
			System.out.println(googleArray[i]);
		}
		System.out.println("Please Enter One product Name from the list");
		enteredProduct = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < googleArray.length; i++) {
			if (enteredProduct.equals(googleArray[i])) {
				flag = true;
			}
		}
		if (flag)
			System.out.println("Product selected is " + enteredProduct);
		else
			System.out.println("Please select a product from the list");

	}

	void verifyAppleProducts() {
		System.out.println("Here is the list of available products under brand Apple");
		for (int i = 0; i < appleArray.length; i++) {
			System.out.println(appleArray[i]);
		}
		System.out.println("Please Enter One product Name from the list");
		enteredProduct = sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < appleArray.length; i++) {
			if (enteredProduct.equals(appleArray[i])) {
				flag = true;
			}
		}
		if (flag)
			System.out.println("Product selected is " + enteredProduct);
		else
			System.out.println("Please select a product from the list");

	}

	void verifySelectedBrandAndItsProducts() {

		switch (enteredBrandName) {
		case "Samsung":
			verifySamsungProducts();
			break;
		case "Google":
			verifyGoogleProducts();
			break;
		case "Apple":
			verifyAppleProducts();
			break;
		default:
			System.out.println("Please enter available Brand name including Samsung/Google/Apple only");
			break;
		}

	}
}