package loopPackage;

import java.util.Scanner;

public class AccountInformation {
	String savedUserId = "pivotAdmin";
	String savedPassword = "Admin123";
	String enteredUserId;
	String enteredPassword;
	int failAttempts;

	void verifyUserIdAndPassword() {
		while (failAttempts < 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User ID");
			enteredUserId = sc.next();
			System.out.println("Enter Password");
			enteredPassword = sc.next();
			if ((enteredUserId.equals(savedUserId)) && (enteredPassword.equals(savedPassword))) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				System.out.println("Incorrect User Id or password.Try again");

			}
			failAttempts++;

			if (failAttempts == 3) {
				System.out.println("Account locked");
			}
		}
	}
}
