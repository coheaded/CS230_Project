
/**
 * @author ccnoecker
 * @version 3/15/2016
 * 
 *	The university home accesses the DBController for functionalities related to the user.
 */
public class UserHome {
	
	/**
	 * variable for the dbcontroller class that contains all of the universities and their info as well as users and their info.
	 */
	private DBController controller;
	
	/**
	 * Constructor initializing the DBController
	 */
	public UserHome() {
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	/**
	 * viewSchools enters the name (String) of each saved school for the user into a String array
	 * @param user	the User that is logged in
	 * @return	a String array containing the name of each of the user's saved schools.
	 */
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
	
	/**
	 * Gets the information related to a given user
	 * @param user The user who's information is being returned as a String
	 * @return A String containing the user's information
	 */
	public String getInfo(User user){
		return user.toString();
	}
	
	/**
	 * removeSchool calls removeSchool on the userHome with the user's username and school's name as parameters,
	 * which removes the given school from the user's list of saved schools.
	 * 
	 * @param school The school name that you want to remove from the user's list of saved schools
	 * @param username The user's username
	 * @return a positive number if the school was successfully removed or a negative number if it was not.
	 */
	public int removeSchool(String username, String school){
		return controller.removeSchool(username,school);
	}
	
	/**
	 * saveSchool(String school) calls saveSchool on the userHome with the user's username and school's name as parameters,
	 * which saves the given school to the user.
	 * 
	 * @param school The school name that you want to save to the user.
	 * @param user
	 */
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
