
public class LoginUI {
	DBController controller;
	
	public LoginUI(){
		controller = new DBController("cottonhead","cottonhead","acls4");
	}
	
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
