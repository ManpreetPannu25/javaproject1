package ConditionPackage;

import java.util.Scanner;

public class cassinoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   cassinoEntry customerAge = new cassinoEntry();
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter your age");
   
   customerAge.age = sc.nextInt();
   
    customerAge.entryRequirement();
    
   
	}

}
