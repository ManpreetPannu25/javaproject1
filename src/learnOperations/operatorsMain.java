package learnOperations;

public class operatorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArithmeticOperators ao= new ArithmeticOperators();
     
     ao.num1= 5;
     ao.num2= 10;
     ao.addTwoNumbers();
      System.out.println("........................");
      ao.num3= 3.5;
      ao.num4= 4;
      //invoking the method
      
      ao.subtractTwoNumbers();
      
      //reassigning the values to the variables
      ao.num1= 20;
      ao.num4= 10;
      //invoking the method
      ao.subtractOtherTwoNumbers();
      // num1=20 (reassigned value),num2 =10)
      ao.mutiplyTwoNumbers();
       //reassigning the value of num1
      ao.num1= 5;
      
    
    //reassigning the value of num2
      ao.num2= 2;
      ao.divideTwoNumbers();
      
      //Instantiating a class (using different object ao1)
      ArithmeticOperators ao1 = new ArithmeticOperators();
      ao1.num1= 5;
      ao1.num2= 10;
      ao1.addTwoNumbers();
      
      
      
      //instantiating a class.. creating an object of assignment operator
      AssignmentOperator ao2 =new AssignmentOperator();
      ao2.age =30;
      ao2.ageAfter10Years();
      //reassigning the age value
      ao2.age = 60;

      ao2.ageBefore10Years();
      // 60-10= 50 age (latest)
      ao2.multiplyAgeWith2();
      //50*2=100 age
      
      
      ao2.divideAgeWith2ToGetQuotient();
      //100/2= 50 age
      ao2.divideAgeWith2ToGetRemainder();
      // 50/2= 25
     }

}
