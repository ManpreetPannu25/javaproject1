package canadaWonderland;

public class WarehouseJobs extends CanadaWonderlandJobs {

	WarehouseJobs(int age, String status) {
		super(age, status);
	}

	@Override
	void validateAge() {
		if (age >= 18) {
			System.out.println("Your age qualifies to apply for Warehouse jobs at Canada Wonderland\n");
		} else {
			System.out.println("Invalid age to apply for warehouse jobs");
			System.exit(0);
		}
	}

	@Override
	boolean isValidStatus() {
		String status1 = "Canadian Citizen";
		String status2 = "Canadian PR";
		if (status.equalsIgnoreCase(status2) || status.equalsIgnoreCase(status1)) {
			System.out.println("You are eligible to apply for Warehouse jobs at Wonderland\n");
			return true;
		}
		return false;

	}

	void validateQualifications(String licenseLevel) {
		if (licenseLevel.equalsIgnoreCase("G2") || (licenseLevel.equalsIgnoreCase("G"))) {
			System.out.println("You are eligible to to apply for Warehouse jobs at Wonderland with " + licenseLevel
					+ " license\n");
		} else {
			System.out.println("Invalid license type, which is not acceptable to apply for Warehouse jobs\n");
			System.exit(0);
		}

	}

}
