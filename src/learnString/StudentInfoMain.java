package learnString;

public class StudentInfoMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentInformation name = new StudentInformation();
        name.studentName = "Guntaas Pannu";
        name.studentFatherName= "Pawandeep Pannu";
        name.studentMotherName= "Manpreet Pannu";
        
        name.displayStudentName();
        name.displayStudentFatherName();
        name.displayStudentMotherName();
	}

}
