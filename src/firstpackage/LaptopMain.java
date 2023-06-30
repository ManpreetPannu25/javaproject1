package firstpackage;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Laptop hp = new Laptop();
     hp.brandName = "hp";
     hp.color = "Silver";
     hp.screenSizeInInches = 15.1;
     hp.ramStorageInGb = 8;
     hp.isMsWordPresent = true;
     //invoking the method using object hp
     hp.sendEmail();
     hp.storePictures();
     hp.makeResumeInMsWord();
      System.out.println("-----------------------------------");
	
      
     //Instantiating a class
    
     Laptop dell = new Laptop();
     dell.brandName = "dell";
     dell.color = "black";
     dell.screenSizeInInches = 15.2;
     dell.ramStorageInGb = 6;
     dell.isMsWordPresent = true;
     //invoking the method using dell
     
     dell.sendEmail();
     dell.storePictures();
     dell.makeResumeInMsWord();
     
} 
     
      
	

}
