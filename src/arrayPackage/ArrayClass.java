package arrayPackage;

import java.util.Scanner;

public class ArrayClass {
//
//	int[] evenNumbers = { 2, 4, 6, 8, 10 };
	// int[]studentNumber= new int [30];

//
//	void addValuesToArray() {
//		oddNumbers[0] = 1;
//		oddNumbers[1] = 3;
//		oddNumbers[2] = 5;
//		oddNumbers[3] = 7;
//		oddNumbers[4] = 9;
//	}
//
//	void populateStudentNumberArray() {
//
//		for (int i = 0; i < 30; i++) {
//			studentNumber[i] = i + 2;
//
//		}
//	}
//

	String[] studentName = new String[5];

	void addStudentNameArray() {
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name");
			studentName[i] = sc.next();

		}

	}
}
