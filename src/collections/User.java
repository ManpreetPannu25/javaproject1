package collections;

public class User {

	private  String userName;
	private int userId;

	public User(String userName, int userId) {
		this.userName = userName;
		this.userId = userId;

	}
	public String getUserName() {
		return userName;
	}
	public int getUserId() {
		return userId;
	}
	public void playingVideoGame() {
		System.out.println( userName + " with id " + userId + " is playing video game");
	}
	
	
	

	
	

}
