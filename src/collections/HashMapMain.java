package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class HashMapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Hotel sheraton = new CanadaHotels(200, "Sheraton", "Toronto", "Indoor pool");
		Hotel radisson = new CanadaHotels(300, "Radisson", "Vancouver", "helipad");
		Hotel hyatt = new CanadaHotels(400, "Hyatt", "Scarborough", "helipad");

		List<Hotel> canadaHotelList = new ArrayList<>();
		canadaHotelList.add(sheraton);
		canadaHotelList.add(radisson);
		canadaHotelList.add(hyatt);

		Hotel seaHouse = new IndianHotel(100, "SeaHouse", "Punjab", "free meal");
		Hotel hotelBay = new IndianHotel(150, "HotelBay", "Punjab", "pets friendly");

		List<Hotel> IndianHotel = new ArrayList<>();
		IndianHotel.add(hotelBay);
		IndianHotel.add(seaHouse);

		HashMap<Integer, List<Hotel>> hm = new HashMap<>();
		hm.put(101, canadaHotelList);
		hm.put(102, IndianHotel);

		for (Map.Entry<Integer, List<Hotel>> entry : hm.entrySet()) {
			if (entry.getKey() == 101) {
				List<Hotel> val = entry.getValue();
				for (Hotel hotel : val) {
					hotel.hotelDetails();
					hotel.validateFiveStarHotel();

				}
			}

		}

		// ---------------Revision--------------//
		// *****declaration of HashMap
//		HashMap<Integer, String> employee = new HashMap<>();
//		employee.put(11, "Anaayat");
//		employee.put(22, "Mehar");
//		employee.put(33, "Guntaas");
//		employee.put(null, "Rehat");
//
//		// *******using different methods
////		System.out.println(employee.get(11));
////		System.out.println(employee.containsValue("Mehar"));
////		System.out.println(employee.isEmpty());
//
//		// **** forMap loop
//		for (Map.Entry<Integer, String> entry : employee.entrySet()) {
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			System.out.println("Please enter a key to verify if already exists or not");
//			Integer enteredKey = sc.nextInt();
//			if (enteredKey == key) {
//				System.out.println("Key " + enteredKey + " is already present");
//			} else {
//				employee.put(enteredKey, "Harman");
//			}
//
//		}
//		System.out.println(employee);

	}

}
