package loopPackage;

import java.util.Scanner;

public class AccountInformationMain {

	public static void main(String[] args) {
		AccountInformation person = new AccountInformation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID");
		person.enteredUserId = sc.next();
		System.out.println("Enter Password");
		person.enteredPassword = sc.next();
		person.verifyUserPassword();

	}

}
