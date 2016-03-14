
public class LoginUI {
	DBController controller;
	
	public LoginUI(){
		controller = new DBController("cottonhead","cottonhead","acls4");
	}
	
	public char login(String username, String password){
		if(controller.login(username,password).equals("a")){
			return 'a';
		}
		else if(controller.login(username,password).equals("u")){
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
				User user = new User(array[i][0],array[i][1],array[i][2],array[i][3],array[i][4],array[i][5]);
				return user;
			  }
		  }
		 return null;
	 }
			
	
}