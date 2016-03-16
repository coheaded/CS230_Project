/**
 * @author smcarik
 * @version 03/15/2016
 * class that checks DBController for username and password and returns appropriate char for opening of an interface
 */
public class LoginUI {
	/**
	 * database controller object
	 */
	private DBController controller;
	
	/**
	 * default constructor that creates the DBController variable
	 */
	public LoginUI(){
		controller = new DBController("cottonhead","cottonhead","acls4");
	}
	
	/**
	 * method that returns a char based upon if the person trying to login is a user, admin, or not in the system/not activated
	 * @param username
	 * @param password
	 * @return char a for admin, char u for user, char n if user not found
	 */
	public char login(String username, String password){
		if(controller.login(username,password)=='a'){
			return 'a';
		}
		else if(controller.login(username,password)=='u'){
			return 'u';
		}
		else{
			return 'n';
		}
	}
	
	/**
	 * method that returns a user object with the info found by its username
	 * @param username of the person you are searching for
	 * @return user object with information based upon username
	 */
	 public User getUser(String username)
	 {
		 
		 String[][] array = controller.getUsers();
		 for(int i=0; i<array.length; i++){
			  if(array[i][2].equals(username)){
				User user = new User(array[i][0],array[i][1],array[i][2],array[i][3],array[i][4].charAt(0),array[i][5].charAt(0));
				return user;
			  }
		  }
		 return null;
	 }
	 
	 /**
	  * method that returns a admin object with the info found by its username
	  * @param username of the admin you are searching for
	  * @return admin object with information based upon username
	  */
	 public Admin getAdmin(String username)
	 {
		 
		 String[][] array = controller.getUsers();
		 for(int i=0; i<array.length; i++){
			  if(array[i][2].equals(username)){
				Admin user = new Admin(array[i][0],array[i][1],array[i][2],array[i][3],array[i][4].charAt(0),array[i][5].charAt(0));
				return user;
			  }
		  }
		 return null;
	 }
}
