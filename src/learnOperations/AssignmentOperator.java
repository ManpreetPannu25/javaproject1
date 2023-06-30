package learnOperations;

public class AssignmentOperator {
	 int age = 30;
	 
	 void ageAfter10Years() {
		 // add equal to assignment operator +=
		 age += 10;
		 System.out.println("Age after 10 years = " +age);
	 }
     void ageBefore10Years() {
      //minus equal to operator -=
    	 age -= 10;
    	 System.out.println("Age before 10 years = " +age);
     }
    	 
    	 void multiplyAgeWith2 () {
    		 // *= operator
    		 age *= 2;
    		 System.out.println("Age after multiplying with 2 = " +age);
    		 
    	 }
    	  void divideAgeWith2ToGetQuotient () {
    		 // /= operator
    		 age /= 2;
    	
    		System.out.println("quotient after dividing age with 2 = " +age);
    		
    	  }
    		
    		
    		 void divideAgeWith2ToGetRemainder () {
        		 // %= operator
        		 age %= 2;
        System.out.println("remainder after dividing with age 2 = " +age);
}
      
}