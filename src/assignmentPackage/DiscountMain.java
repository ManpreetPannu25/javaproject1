package assignmentPackage;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculation product = new DiscountCalculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original price of an item");

		product.originalPrice = sc.nextDouble();

		System.out.println("Enter the promo code apply to this item (if any)");

		product.promoCode = sc.next();
		product.discountCalculated();
	}
}