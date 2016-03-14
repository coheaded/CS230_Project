
/**
 * @author smcarik
 *
 */
public class UserHome {
	
	private User user;
	private DBController controller;
	/**
	 * 
	 */
	public UserHome(User user) {
		this.user = user;
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	public String[] viewSchools(User user)
	{
		String[][] array = controller.getUsernamesWithSavedSchools();
		String[] savedSchools = new String[100];
		for(int i=0; i<array.length; i++){
			  if(array[i][0].equals(user.getUsername())){
				  for(int j = 0; j<array[i].length; j++){
					  if(savedSchools[j]==null){
							  savedSchools[j] = array[i][j];
					  }
				  
				  }
			  }
		  }
		return savedSchools;
	}
	
	public void getInfo(User user){
		user.toString();
	}
	
	/*public void removeUni(String uni){
		user.removeUni(uni);
	}*/
	
	public void saveSchool(String user, String school) {
		controller.saveSchool(user, school);
	}
	
	public void editProfile(String fname, String lname, String pWord) {
		user.setfName(fname);
		user.setlName(lname);
		user.setpWord(pWord);
	}
	

}
