package collections;

public class Hotel {

	double price;
	String hotelName;
	String location;
	String specialFeature;

	public Hotel(double price, String hotelName, String location, String specialFeature) {
		this.price = price;
		this.hotelName = hotelName;
		this.location = location;
		this.specialFeature = specialFeature;

	}

	public void validateFiveStarHotel() {
		if (specialFeature.contains("helipad")) {
			System.out.println(hotelName + " Hotel is five star on the basis of presence of Helipad");
		} else {
			System.out.println(hotelName + " Hotel is not five Star");
		}

	}

	public void hotelDetails() {
		System.out.println(
				hotelName + " hotel is located in " + location + " with over-night price of  $ " + price + " /night");
	}
}