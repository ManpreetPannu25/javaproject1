package canadaWonderland;

import java.util.Scanner;

public class CanadaWonderlandJobs {
	public int age;
	public String status;

	String[][][] jobCategory = {
			{ { "accounting" },
					{ "Finance_account receivable_assistant", "Accountant", "Finance-General_Accountant" } },
			{ { "guests" }, { "Finance_account receivable_assistant", "Accountant", "Finance-General_Accountant" } },
			{ { "entertainment" },
					{ "Halloween_haunt_monster", "Halloween_haunt_make-up_artist", "Entertainment_performer" } },
			{ { "tech" }, { "Entertainment_stage_area_supervisor" } },
			{ { "maintenance" }, { "Lightning-audio_technician" } },
			{ { "security" }, { "Security_fraud_Investigator", "Security_retail_investigator" } },
			{ { "warehouse" }, { "Maintenance_Inventory_technician", "Warehouse_Material_Handler" } } };

	CanadaWonderlandJobs(int age, String status) {
		this.age = age;
		this.status = status;

	}

	Scanner sc = new Scanner(System.in);

	void validateAge() {
		if (this.age < 15) {
			System.out.println("You are not eligible to work at Canada Wonderland");
		} else if ((age > 15) && (age <= 18)) {
			System.out.println(
					"A valid work permit is required to work in Canada Wonderland if you are under 18 years of age");
		} else if (age > 18) {
			System.out.println("Applicants must be legally eligible to work at Canada Wonderland");
		} else {
			System.out.println("Invalid age entry");
		}
	}

	boolean isValidStatus() {
		String status1 = "Canadian Citizen";
		String status2 = "Work permit holder";
		String status3 = "Canadian PR";
		System.out.println("Enter your status...Canadian Citizen Or Work permit holder OR Canadian PR");
		if (status.equalsIgnoreCase(status3) || status.equalsIgnoreCase(status2) || status.equalsIgnoreCase(status1)) {
			System.out.println("You are eligible to Work at Wonderland");
			return true;
		}
		return false;

	}

	void validateAccomodation() {
		System.out.println(
				" Canada Wonderland welcomes and encourages applications from people with disabilities. Accommodations are available on request for candidates taking part in all aspects of the selection process");

	}

	void validateJobSearch() {
		System.out.println("Given job catergories have open job positions");
		for (int i = 0; i < jobCategory.length; i++) {
			System.out.println(jobCategory[i][0][0]);
		}
		System.out.println("Please enter 1 job category to view open job positions");
		String jType = sc.next();
		for (int i = 0; i < jobCategory.length; i++) {
			if (jType.equals(jobCategory[i][0][0])) {
				for (int j = 0; j < jobCategory[i][1].length; j++)
					System.out.println(jobCategory[i][1][j]);

			}
		}
	}
}
