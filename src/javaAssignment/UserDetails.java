package javaAssignment;

import java.util.Scanner;

public class UserDetails {
	private String userName;
	private String userPassword;
	private String emailAddress;
	private long phoneNumber;
	private String oldPassword = "12345aaa";

	public String setUserName() {
		return userName;
	}

	public String getUserName() {
		System.out.println("Enter your name:");
		return userName = sc.next();

	}

	public String setUserPassword() {
		return userPassword;
	}

	public String getUserPassword() {
		System.out.println("Enter the password you want to use:");
		return userPassword = sc.next();

	}

	public long setPhoneNoOfUser() {
		return phoneNumber;
	}

	public long getPhoneNoOfUser() {
		System.out.println("Enter your phone number");

		return phoneNumber = sc.nextLong();
	}

	public String setEmail() {
		return emailAddress;
	}

	public String getEmail() {
		System.out.println("Enter your email address:");
		return emailAddress = sc.next();
	}

	Scanner sc = new Scanner(System.in);

	public boolean userRegistration(UserDetails user) {
		boolean loginStatus = false;
		while (loginStatus != true) {
			System.out.println("Please sign up to Book a Service");

			user.getUserName();
			user.userName = setUserName();
			user.getUserPassword();
			user.userPassword = setUserPassword();
			user.getPhoneNoOfUser();
			user.phoneNumber = setPhoneNoOfUser();
			user.getEmail();
			user.emailAddress = setEmail();

			System.out.println("Thank you for Registering!");

			System.out.println("Please sign In Using same Username and password");
			System.out.print("Please enter registered user name: ");
			String enteredUserName = sc.next();
			System.out.print("Please enter registered password: ");
			String enteredPassword = sc.next();

			if (userName.equalsIgnoreCase(enteredUserName) && userPassword.equals(enteredPassword)) {
				loginStatus = true;

				System.out.println("Login Successfull! Please go ahead and choose your services");
				break;
			} else {
				System.out.println("Wrong Information. Please Try again!");
			}
		}
		return loginStatus;
	}

	public void changePersonalInfo() {
		System.out.println("Please enter the information you want to change");
		System.out.println("Press 1 for password\n Press 2 for Phone number \n Press 3 for Email address");
		int choice = sc.nextInt();
		System.out.println("Please enter your Username");
		String userName = sc.next();
		System.out.println("Please enter your old password");
		String password = sc.next();
		int count = 0;
		while (count <= 3) {
			if (password.equals(oldPassword)) {

				switch (choice) {
				case 1:
					System.out.println("Please enter your new password");
					String newPassword = sc.next();
					System.out.println(" Dear " + userName + " Password is successfully changed to: " + newPassword);
					break;
				case 2:
					System.out.println("Please enter your new phoneNumber");
					String newPhoneNum = sc.next();
					System.out
							.println(" Dear " + userName + " Phone Number is successfully changed to: " + newPhoneNum);
					break;
				case 3:
					System.out.println("Please enter your new emailAddress");
					String newEmail = sc.next();
					System.out.println(" Dear " + userName + " Email address is successfully changed to: " + newEmail);
					break;

				default:
					System.out.println("Invalid selection");
					break;
				}

			} else if (!password.equals(oldPassword)) {
				count++;
			}
		}
		System.out.println("3 Unsuccessful attempts. Please try next time");
	}
}
