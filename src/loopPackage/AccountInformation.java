package loopPackage;

import java.util.Scanner;

public class AccountInformation {
	String savedUserId = "pivotAdmin";
	String savedPassword = "Admin123";
	String enteredUserId;
	String enteredPassword;
	int failAttempts;

	void verifyUserPassword() {
		while (failAttempts <= 3) {
			if ((enteredUserId.equals(savedUserId)) && (enteredPassword.equals(savedPassword))) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				System.out.println("Incorrect User Id or password.Try again");

				failAttempts++;

				if (failAttempts > 3) {
					System.out.println("Account locked");
				}

			}
		}
	}
}