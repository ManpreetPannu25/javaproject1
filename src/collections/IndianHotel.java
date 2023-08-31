package collections;

public class IndianHotel extends Hotel {

	public IndianHotel(double price, String hotelName, String location, String specialFeature) {
		super(price, hotelName, location, specialFeature);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validateFiveStarHotel() {
		if (specialFeature.contains("helipad")) {
			System.out.println(hotelName + " Hotel is five star");
		} else {
			System.out.println(hotelName + " Hotel is not five Star");
		}
	}
}
