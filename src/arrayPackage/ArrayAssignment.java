package arrayPackage;

import java.util.Scanner;

public class ArrayAssignment {

	String[] samsungArray = { "S20", "S21", "Flip3", "Fold3" };
	String[] googleArray = { "Google pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] appleArray = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 13" };

	String brandName1 = "Samsung";
	String brandName2 = "Google";
	String brandName3 = "Apple";
	String enteredBrandName;
	String enteredProduct;
	Scanner sc = new Scanner(System.in);

	void findingProductName() {
		System.out.println(
				"Please type the Brand name(Samsung/Google/Apple) to see the available products in that category");
		enteredBrandName = sc.next();
		if (enteredBrandName.equals(brandName1)) {
			System.out.println("Here is the list of available products under brand Samsung");
			for (int i = 0; i < samsungArray.length; i++) {
				System.out.println(samsungArray[i]);
			}
		} else if (enteredBrandName.equals(brandName2)) {
			System.out.println("Here is the list of available products under brand Google");
			for (int i = 0; i < googleArray.length; i++) {
				System.out.println(googleArray[i]);
			}
		} else if (enteredBrandName.equals(brandName3)) {
			System.out.println("Here is the list of available products under brand Apple");
			for (int i = 0; i < appleArray.length; i++) {
				System.out.println(appleArray[i]);
			}
		} else {
			System.out.println("Invalid entry");
		}
	}

	void verifyEnteredProducts() {

		System.out.println("Please Enter One product Name from the list");
		enteredProduct = sc.next();
		for (int i = 0; i < samsungArray.length; i++) {
			if (enteredProduct.equals(samsungArray[i])) {
				System.out.println("Product selected is " + enteredProduct);
		break;
		}}
		for (int i = 0; i < googleArray.length; i++) {
			if (enteredProduct.equals(googleArray[i])) {
				System.out.println("Product selected is " + enteredProduct);
				break;
			}
		}
		for (int i = 0; i < appleArray.length; i++) {
			if (enteredProduct.equals(appleArray[i])) {
				System.out.println("Product selected is " + enteredProduct);
				break;
			} 
			else {
				System.out.println("Please select a product from the list");
				break;
			}
		}
	}
}
