package libraryPackage;

import java.util.Scanner;

public class UserDetails {
	private String memberName;
	private String membershipId;
	private String memberPassword;
	private String guestName;
	private String guestEmail;
	
	Scanner sc= new Scanner(System.in);
	
	UserDetails(){
		
	}

	UserDetails(String memberName, String membershipId, String memberPassword) {
		this.memberName=memberName;
		this.membershipId= membershipId;
		this.memberPassword=memberPassword;
	}

	UserDetails(String guestName, String guestEmail) {
		this.guestName= guestName;
		this.guestEmail= guestEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	

}