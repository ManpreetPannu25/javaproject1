package firstpackage;

public class Laptop {
    String brandName;
    String color;
    double screenSizeInInches;
    int ramStorageInGb;
    boolean isMsWordPresent;
     
    
    void sendEmail() {
    	System.out.println("Sending email from"+ brandName);
    }
    void storePictures() {
    	System.out.println("Storing pictures in"+ brandName);
    }
    void makeResumeInMsWord() {
    	System.out.println("Making resume in MS Word using"+ brandName);
    	
    }
}