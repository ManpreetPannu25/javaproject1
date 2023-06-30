package learnOperations;

public class ArithmeticOperators {
	 int num1;
	 int num2;
	 double num3;
	 int num4;
	 
	 
	 void addTwoNumbers() {
		 int sum= num1+num2;
		 System.out.println("Sum of "+num1+" and "+num2+" is "+ sum);
		 
				 
	 }
     void addFourNumbers() {
    	 double sum1 = num1+num2+num3+num4;
    	 System.out.println("Sum of "+num1+" and "+num2+" and "+num3+" and "+num4+" is " +sum1);
    	 
    	  
     }
     void subtractTwoNumbers() {
    	 double difference = num3-num4;
    	 System.out.println("difference of "+num3+" and "+num4+" is " +difference );
    	 
     }
     void subtractOtherTwoNumbers() {
    	 int difference1 = num1-num4;
    	 System.out.println("difference of "+num1+" and "+num4+" is " +difference1 );
    	 
}
      void mutiplyTwoNumbers() {
    	  int product= num1*num2;
    	  System.out.println("Product of "+num1+" and "+num2+" is " +product);
 }
      void divideTwoNumbers() {
    	  double quotient = num1/num3;
    	  double remainder= num1%num3;
    	  double quotient1 = num1/num2;
    	  double remainder1= num1%num2;
    	  System.out.println(" Quotient of "+num1+" and "+num3+" is " +quotient);
    	  System.out.println("Remainder of "+num1+" and "+num3+" is " +remainder);
      System.out.println(" Quotient1 of "+num1+" and "+num2+" is " +quotient1);
	  System.out.println("Remainder1 of "+num1+" and "+num2+" is " +remainder1);
  }
 }
 
