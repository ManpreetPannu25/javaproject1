package assignmentPackage;

public class DiscountCalculation {

	double originalPrice, discountedPrice;
	double discountInPercentage = 0.5;
	String promoCode;
	double finalPrice1;

	void discountCalculated() {
		discountedPrice = (originalPrice * discountInPercentage);
		System.out.println("The discounted price of an item is " + discountedPrice);

		if (promoCode.equals("promoCode5")) {
			finalPrice1 = (discountedPrice - (discountedPrice * 0.05));
			System.out.println("Final discounted price of this item with additional promo code5 is " + finalPrice1);
		} else if (promoCode.equals("promoCode10")) {
			finalPrice1 = (discountedPrice - (discountedPrice * 0.10));
			System.out.println("Final discounted price of this item with additional promo code10 is " + finalPrice1);
		} else if (promoCode.equals("promoCode20")) {
			finalPrice1 = (discountedPrice - (discountedPrice * 0.20));
			System.out.println("Final discounted price of this item with additional promo code20 is " + finalPrice1);
		} else {
			System.out.println("Final discounted price of this item with no promo Code remains same as discounted price " + discountedPrice);

		}
	}
}