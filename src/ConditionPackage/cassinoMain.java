package conditionPackage;

import java.util.Scanner;

public class CassinoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   CassinoEntry customerAge = new CassinoEntry();
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter your age");
   
   customerAge.age = sc.nextInt();
   
    customerAge.entryRequirement();
    
   
	}

}
