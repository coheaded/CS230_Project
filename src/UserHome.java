
/**
 * @author smcarik
 *
 */
public class UserHome {
	
	private DBController controller;
	/**
	 * 
	 */
	public UserHome() {
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	public String[] viewSchools(User user)
	{
		String[][] array = controller.getUsernamesWithSavedSchools();
		String[] savedSchools = new String[100];
		int count = 0;
		for(int i=0; i<array.length; i++){
			  if(array[i][0].equals(user.getUsername())){
				  for(int j = 0; j<array[i].length; j++){
					  if(savedSchools[count]==null){
							  savedSchools[count] = array[i][j];
							  count++;
					  }
				  }
			  }
		  }
		return savedSchools;
	}
	
	public void getInfo(User user){
		user.toString();
	}
	
	public int removeSchool(String username, String school){
		return controller.removeSchool(username,school);
	}
	
	public void saveSchool(String user, String school) {
		controller.saveSchool(user, school);
	}
	
	public void editProfile(String firstName, String lastName, String username, String pass, char type, char activated) {
		controller.editUser(firstName, lastName, username, pass, type, activated);
	}
	
	public String[] displaySchool(String school){
		String[][] array = controller.getUniversities();
		String[] retArray = new String[16];
		for(int i = 0; i<array.length; i++ ){
			if(array[i][0].equalsIgnoreCase(school)){
				for(int j = 0; j<array[i].length; j++){
					retArray[j] = array[i][j];
				}
			}
		}
		return retArray;
	}
	
	public String[] findEmphases(String school){

		String[][] emphases = controller.getNamesWithEmphases();
		String[] retArray = new String[5];
		int count = 0;
		for(int i = 0; i<emphases.length; i++){
			
			if(emphases[i][0].equalsIgnoreCase(school)){
				retArray[count] = emphases[i][1];
				count++;
			}
		}
		return retArray;
	}

}
