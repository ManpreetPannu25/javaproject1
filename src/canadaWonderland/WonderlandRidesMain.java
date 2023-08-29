package canadaWonderland;

import java.util.Scanner;

public class WonderlandRidesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String option = "";
		System.out.println("Enter 1 for job search or 2 for rides or Q to quit: ");
		option = sc.next();
		while (!option.equals("Q") && (!option.equals(""))) {
			if (option.equals("1")) {
				CanadaWonderlandJobs job = new WarehouseMaterialHandler(0, null, null);
				job.validateJobSearch(); //....................................................// select only warehouse material handler job to continue
				System.out.println("Here is the requirement for WAREHOUSE JOB TYPE only");
				System.out.println("Please enter your current Ontario's driver license level..-G2/G");
				String licenseLevel = sc.next();
				WarehouseJobs warehouse = new WarehouseJobs(0, licenseLevel);
				warehouse.validateQualifications(licenseLevel);
				System.out.print("Please enter your age to check your elegibility: ");
				int age = sc.nextInt();
				System.out.print("Enter your status...Canadian Citizen OR Canadian PR: ");
				String status = sc.next();
				// CanadaWonderlandJobs job = new WarehouseMaterialHandler(0, null, null);
				System.out.println("Please enter your warehouse experience in years: ");
				int experienceInYears = sc1.nextInt();
				WarehouseMaterialHandler wJob = new WarehouseMaterialHandler(age, status, licenseLevel);
				wJob.expectedSalary(experienceInYears);
				wJob.expectedSalary(experienceInYears, age);
				wJob.jobPerksAndBenefits();
				wJob.jobResponsibilities();

			} else if (option.equals("2")) {
				System.out.println("Please enter  height to check suitable rides for you");
				int height = sc.nextInt();
				WonderlandRides rides = new WonderlandRides(0);
				String msg = rides.validateHeightCheck(height);
				System.out.println(msg);
				if (msg.equalsIgnoreCase("Not eligible for rides"))
					continue;
				WonderlandRides ridesB = new RideBehemoth(height);
				WonderlandRides ridesL = new RideLeviathan(height);
				WonderlandRides ridesLj = new RideLumberjack(height);
				WonderlandRides ridesF = new RideFlightDeck(height);

				String[] erides = { ridesB.validateHeightCheck(height), ridesL.validateHeightCheck(height),
						ridesLj.validateHeightCheck(height), ridesF.validateHeightCheck(height) };
				for (String eligibleRide : erides)
					if (!eligibleRide.equals(""))
						System.out.println(eligibleRide);
				System.out.println("Please choose one ride from above to see the details");
				String choice = sc.next();
				switch (choice) {
				case "Behemoth":
					RideBehemoth behemoth = new RideBehemoth(height);
					behemoth.durationOfRideBehemoth();
					behemoth.specialOffer();
					break;

				case "Lumberjack":
					RideLumberjack lumberjack = new RideLumberjack(height);
					lumberjack.durationOfRideLumberjack();
					lumberjack.validatePhysicalHealth();
					break;

				case "Leviathan":
					RideLeviathan leviathan = new RideLeviathan(height);
					leviathan.durationOfRideLeviathan();
					leviathan.specialOffer();

					break;

				case "Flightdeck":
					RideFlightDeck flightdeck = new RideFlightDeck(height);
					flightdeck.durationOfRideFlightDeck();

					break;
				default:
					System.out.println("Please enter valid ride name");
					break;
				}
				System.out.println("........................");
				rides.priceOfLaneCard();
				rides.rideSafetyRegulations();

			}

			System.out.println("Enter 1 for job search or 2 for rides or Q to quit: \n");
			option = sc1.next();
		}
		System.out.println("Thanks for your time!!");
	}

}
