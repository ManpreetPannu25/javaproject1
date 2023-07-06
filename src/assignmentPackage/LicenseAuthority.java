package assignmentPackage;

public class LicenseAuthority {

	int age;
	String level;

	void licenseRequirementWithAgeAndLevel() {
		if (age >= 16) {
			System.out.println("Age is valid to get G1||G2||G license");

			if (level.equals("G1")) {
				System.out.println("Person is eligible for G2 license");
			} else if (level.equals("G2")) {
				System.out.println("Person is eligible for G license");
			} else if (level.equals("G")) {
				System.out.println("Person already have full G license");
			}

			else {
				System.out.println("Invalid license type");
			}

		} else {
			System.out.println("Age is not valid to get license");
		}
	}
}
