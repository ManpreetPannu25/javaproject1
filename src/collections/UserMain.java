package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		// ----------------------------PART 1-----------------------------------//

//		//**********declaration of ArrayList
		ArrayList<String> students = new ArrayList<>();
		students.add("Manpreet");
		students.add("Pawandeep");
		students.add("Guntaas");
		students.add("Arzoie");

		System.out.println("Number of students in the list are :" + students.size());
//		//*********print all the student names
		System.out.println("Students in the list are: " + students);

//		//*********print particular name and character
		System.out.println(students.get(0).charAt(0));

//		//*********print the list using for each  loop
		System.out.println("Students in the list are: ");
		for (String studentName : students) {
			System.out.println(studentName);
		}

//		//********print the using for loop
		System.out.println("Students in the list are: ");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		// --------------------------------PART 2----------------------------------//

		// creating objects of Class User
		User harpreet = new User("Harry", 101);
		User inderjit = new User("Inder", 102);
		User Simranjit = new User("Simran", 103);

		// ******to declare array of class User
		User[] allUsersForArray = { harpreet, inderjit, Simranjit };

//        //*to declare ArrayList of class User and fetching data using for loop
		ArrayList<User> allUsersForList = new ArrayList<>();
		allUsersForList.add(Simranjit);
		allUsersForList.add(inderjit);
		allUsersForList.add(harpreet);
		for (int i = 0; i < allUsersForList.size(); i++) {
			allUsersForList.get(i).playingVideoGame();
		}

		// *******fetching data using for each
		for (User user : allUsersForList) {
			System.out.println(user.getUserName() + " " + user.getUserId());

		}
		// ******for loop with condition
		for (int i = 0; i < allUsersForList.size(); i++) {
			if (allUsersForList.get(i).getUserId() == 101) {
				allUsersForList.get(i).playingVideoGame();
			}
		}

//		}
		// ***********************calling methods************//
		usersPlayingVideoGame(allUsersForList);
		toPassClassListAsAnArgument(Simranjit);
		toPassClassArrayAsAnArgument(allUsersForArray);
		gettingValueFromScanner();
	}

	// ********passing arrayList/list as an method argument
	public static void usersPlayingVideoGame(List<User> listUser) {
		for (int i = 0; i < listUser.size(); i++) {
			if (listUser.get(i).getUserName().equalsIgnoreCase("Inder")) {
				listUser.get(i).playingVideoGame();
			}
		}
	}

	// ******* passing class as an argument
	public static void toPassClassListAsAnArgument(User user) {
		if (user.getUserName().endsWith("er")) {
			user.playingVideoGame();
		} else {
			System.out.println("User whose name ends with letter: er does not exists ");
		}
	}

	// **********passing array as an argument in a method
	public static void toPassClassArrayAsAnArgument(User[] arrayUser) {
		for (User user : arrayUser) {
			if (user.getUserName().equalsIgnoreCase("Simran")) {
				user.playingVideoGame();
			}
		}
	}

	// *****getting value from scanner
	public static void gettingValueFromScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name to get addded");
		String name1 = sc.next();
		System.out.println("Enter your name to get addded");
		String name2 = sc.next();
		ArrayList<String> names = new ArrayList<>();
		names.add(name1);
		names.add(name2);
		System.out.println("Names in the list are: " + names);
		System.out.println("Enter your name to verify");
		String enteredName = sc.next();
		for (String defaultName : names) {
			if (enteredName.equalsIgnoreCase(defaultName)) {
				System.out.println("Name is present in the list");
			} else {
				System.out.println("Name is not present in the list");
			}
		}

	}
}
