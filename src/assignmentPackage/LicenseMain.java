package assignmentPackage;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseAuthority person = new LicenseAuthority();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");

		person.age = sc.nextInt();
		System.out.println("Enter your license level");

		person.level = sc.next();

		person.licenseRequirementWithAgeAndLevel();
	}
}