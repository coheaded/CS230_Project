
public class UserUI {
	
	UserHome home;
	User user;
	LoginUI loginUI;
	
	public UserUI(String username){
		loginUI = new LoginUI();
		user = loginUI.getUser(username);
		home = new UserHome(user);
	}
	
	public String[] viewSavedSchools(){
		return home.viewSchools(user);
	}
	
	public void saveSchool(String school){
		home.saveSchool(user.getUsername(), school);
	}
	
}
