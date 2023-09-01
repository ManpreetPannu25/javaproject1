package practicalInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class InterviewQuestions {
	Scanner sc = new Scanner(System.in);

	public void validatePalindromeString() {
		System.out.println("Please enter a string/word to check whether its palindrome or not");
		String input = sc.next();
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println("String after get reversed : " + reverse);
		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("Given word " + input + " is Palindrome in nature");
		} else {
			System.out.println("Given word " + input + " is not a pallindrome");
		}
	}

	public void validatePalindromeString1() { // using character array
		System.out.println("Please enter a string/word to check whether its palindrome or not");
		String input = sc.next();
		String reverse = "";
		char a[] = input.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			reverse = reverse + a[i];
		}
		System.out.println("String after get reversed : " + reverse);
		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("Given word " + input + " is Palindrome in nature");
		} else {
			System.out.println("Given word " + input + " is not a pallindrome");
		}
	}

	public void validatePalindromeNumber() {
		System.out.println("Please enter wholenumbers to check whether its palindrome or not");
		int input = sc.nextInt();
		int originalInput = input;
		int reverse = 0;
		while (input != 0) {
			reverse = reverse * 10 + input % 10; // % gives last digit
			input = input / 10; // / removes last digit
		}
		System.out.println("The given number is :" + reverse);
		if (reverse == originalInput) {
			System.out.println("Given number is pallindrome");
		} else {
			System.out.println("Given number is not pallindrome");
		}
	}

	public void validatePrimeOrNot() {
		System.out.println("Please enter a number to check whether it is prime or not");
		int input = sc.nextInt(); // number that is divided by itself and 1
		int count = 0;
		if (input > 1) {
			for (int i = 1; i <= input; i++) {
				if (input % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Given number is prime");
			} else {
				System.out.println("Given number is not prime");
			}
		} else {
			System.out.println("Given number is not prime");
		}
	}

	public void validateLengthOfString() {
		System.out.println("Please enter a string/word to check the length");
		String input = sc.next();
		System.out.println("the length of a the given string is : " + input.length());
	}

	public void changeCase() {
		System.out.println("Please enter a string/word to change its case");
		String input = sc.next();
		System.out.println("Given input in upper case: " + input.toUpperCase());
		System.out.println("Given input in lower case: " + input.toLowerCase());
	}

	public void substringOfString() {
		String animalName = "Monkey";
		String subString = animalName.substring(1, 3);
		if (animalName.contains(subString)) {
			System.out.println("The given string :" + subString + ": is substring of another string " + animalName);
		} else {
			System.out.println("The given string is not a substring of another string");
		}
	}

	public void findMaxValue() {
		int[] numbers = { 2, 55, 4, 88, 4, 2, 1, 3, 0, 5, 6, 7, 5 };
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("Maximum value is :" + max);
	}

	public void findMinValue() {
		int[] numbers = { 2, 55, 4, 88, 4, 2, 1, 3, 5, 6, 7, 5 };
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}
		System.out.println("Minimum number is: " + min);

	}

	public void replaceTwoNumber() {
		int a = 5;
		int b = 10;
//		int temp=a;         //using third variable
//		a=b;
//		b=temp;
//		System.out.println(a );
//		System.out.println(b );
//	}
		// without using 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("value of a is:" + a);
		System.out.println("value of b is:" + b);

	}

	public void displayFibonocciSeries() { // 0 1 1 2 3 5 8 13 21 34....
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < 12; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;

		}

	}

	public void powerOfNumber() { // 2^5 //2 is base number and 5 is exponent
		int base = 2;
		int exponent = 5;
		int result = 1;
		while (exponent > 0) {
			result = result * base;
			exponent--;
		}
		System.out.println(result);
	}

	public void generateMultipTable() {
		int multiple = 5;
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			result = multiple * i;
			System.out.println(multiple + "*" + i + " = " + result);
		}

	}

	public void findFactorialNumber() { /// 1*2*3*4*5=120
		System.out.println("Please enter a number to check its factorial");
		int num = sc.nextInt();
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("Factorial of " + num + " is: " + result);

	}

	public void armstrongNumber() {
		System.out.println("Please enter a wholenumbers to check whether it is armstrong number or not");
		int input = sc.nextInt(); // lets say=153
		int originalInput = input; // 1*1*1 + 5*5*5 + 3*3*3 = 153
		int finalResult = 0;
		while (input > 0) {
			int result = input % 10;
			finalResult = finalResult + (result * result * result);
			input = input / 10;
		}
		if (originalInput == finalResult) {
			System.out.println("given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}

	}

	public void findFactorOfNum() { // eg =6 , numbers below 6 which are divisible to 6 leaving remainder 0
		System.out.println("Please enter a number to check its factors");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(" " + i + " ");
				count++;
			}
		}
		System.out.println("total factors for the given number are: " + count);
	}

	public void sumOfNaturalNumbers() { // starts from 1 and always positive number
		int num = 10;
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result = result + i;
		}
		System.out.println("Sum of natural number: " + num + " is:" + result);
	}

	public void verifyAlphabet() {
		char input = 'r';
		if (Character.isAlphabetic(input)) {
			System.out.println(input + " character is an alphabet");
		} else {
			System.out.println(input + " character is not an alphabet");

		}

	}

	public void validatePosNegNumber() {
		System.out.println("Please enter a number to check if it is positive or negative");
		double num = sc.nextDouble();
		if (num >= 0.0) {
			System.out.println("Number is positive");
		} else if (num < 0.0) {
			System.out.println("Number is negative");
		}

	}

	public void validateVowelConsonant() { // Alphabets= a-z
		char a = 's'; // consonant = all alphabets except vowels
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("Given alphabet is vowel"); // vowels = a e i o u
		} else {
			System.out.println("given alphabet is consonant");
		}
	}
//	} public void validateMountainArray() {  //length should be greater than  3 not less than 10000

	public void sortAnArray() {
		int[] a = { 2, 6, 7, 66, 4, 23, 6, 88, 2 };
		// approach 1
//		Arrays.parallelSort(a);            //build in method
//		System.out.println("array elements after sorting: " + Arrays.toString(a));
		// approach 2
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	public void arrayInDescending() {
		Integer[] a = { 2, 6, 7, 66, 4, 23, 6, 88, 2 }; // approach 3 sort in descending order
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

	public void rockScissorGame() {
		String[] rps = { "r", "p", "s" };
		String computerInput = rps[new Random().nextInt(rps.length)];
		// System.out.println("Computer input is: "+ computerInput);
		String playerInput;
		while (true) {
			System.out.println("Please enter one input- r/p/s");
			playerInput = sc.next();
			if (playerInput.equalsIgnoreCase("r") || playerInput.equalsIgnoreCase("s")
					|| playerInput.equalsIgnoreCase("p")) {
				break;
			}
			System.out.println("Please enter valid entry- r/p/s");
		}
		System.out.println("Computer input is: " + computerInput);

		if (playerInput.equalsIgnoreCase(computerInput)) {
			System.out.println("The game is tie as your input is same as computer input i.e " + computerInput);
		} else if (playerInput.equalsIgnoreCase("p") || computerInput.equalsIgnoreCase("r")) {
			System.out.println("You win");
		} else if (playerInput.equalsIgnoreCase("s") || computerInput.equalsIgnoreCase("r")) {
			System.out.println("You lose");
		} else if (playerInput.equalsIgnoreCase("r") || computerInput.equalsIgnoreCase("p")) {
			System.out.println("You lose");
		} else if (playerInput.equalsIgnoreCase("s") || computerInput.equalsIgnoreCase("p")) {
			System.out.println("You win");
		} else if (playerInput.equalsIgnoreCase("r") || computerInput.equalsIgnoreCase("s")) {
			System.out.println("You win");
		} else if (playerInput.equalsIgnoreCase("p") || computerInput.equalsIgnoreCase("s")) {
			System.out.println("You lose");
		} else if (playerInput.equalsIgnoreCase("r") || computerInput.equalsIgnoreCase("s")) {
			System.out.println("You win");

		}

	}

//	public void validatePrimeInbetween() {
//		int min = 20;
//		int max = 40;
//		int count = 0;
//		if (min > 1) {
//			for (int i = min; i <= max; i++) {
//				if (min % i == 0)
//					count++;
//			}
//			if (count == 2) {
//				System.out.println("prime numbers between " + min + " to " + max);
//			}
//		} else {
//			System.out.println("Given number is not prime");
//		}
//	}
//
//	public void replaceNumber() {
//		int[] a = { 2, 6, 8, 5, 3, 9, 5, 3, 4 };
//		for (int i = 0; i < a.length; i++) {
//			if (i == 3) {
//				System.out.println(i);
//			}
//
//		}
//
//	}

	// ****************************EXCEPTIONS***************************************//
	public void arthmeticException() {
		int a = 50;
		System.out.println("Program started");
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println("catch block");
		}
		System.out.println("Program ended");

	}

	public void nullPointerException() {
		String s = null;
		System.out.println("Program started");
		System.out.println(s.length());
		System.out.println("Program ended");
	}

	public void numberFormatException() {
		String s = "abcd";
		int x;
		System.out.println("Program started");
		try {
			 x = Integer.parseInt(s);
		} catch (Exception e) {          //instead of name of Exception, we can also write Exception
			System.out.println("catch block");
		}
		System.out.println("Program ended");
	}

	public void arrayOutOfBound() {
		int a[] = new int[5];
		System.out.println("Program started");
		a[10] = 30;
		System.out.println(a[10]);
		System.out.println("Program ended");
	}
}
