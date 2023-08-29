package canadaWonderland;

public class WarehouseMaterialHandler extends WarehouseJobs {

	WarehouseMaterialHandler(int age, String status, String licenseLevel) {
		super(age, status);
		if (age != 0) {
			super.isValidStatus();
			super.validateAge();
			super.validateAccomodation();
			// super.validateQualifications(licenseLevel);

		}
	}

	void expectedSalary(int experienceInYears) {
		if (experienceInYears == 0) {
			System.out.println(
					"Expected salary for a beginner as a Warehouse merchandise at Canada Wonderland is $18.75\n");
		} else if ((experienceInYears > 0) && (experienceInYears < 2)) {
			System.out.println(
					"Expected salary with experience as a Warehouse merchandise at Canada Wonderland is $19.75\n");
		}
	}

	void expectedSalary(int experienceInYears, int age) {
		if ((experienceInYears >= 2) && (age >= 25)) {
			System.out.println(
					"Expected salary having more than 2 years of experience as a Warehouse merchandise at Canada Wonderland is $20.75\n");
		}
	}

	void jobPerksAndBenefits() {
		System.out.println(
				"Enjoy...20% discount on Merchandise and at select Food locations; employee cafeteria with discounted food.");
		System.out.println("Earn promotional tickets for friends & family!\n");
	}

	void jobResponsibilities() {
		System.out.println("Pick product orders and execute delivery to retail locations.");
		System.out.println("Ensure proper maintenance of the warehouse facility and equipment.\n");
	}

}
