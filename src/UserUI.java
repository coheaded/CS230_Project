import java.util.*;

/**
 * 
 * @author ccnoecker
 * @version 3/15/2016
 * 
 * The UI for users. Contains all functionalities for the user.
 */

public class UserUI {
	
	/**
	 * The user home, used for all user-related methods
	 */
	UserHome home;
	
	/**
	 * The user object.
	 */
	User user;
	
	/**
	 * The login user interface, used to login.
	 */
	LoginUI loginUI;
	
	/**
	 * The university home, used for university-related methods. (Search and relatedSchools)
	 */
	UniversityHome uniHome;
	
	/**
	 * Default constructor that initializes the loginUI, user, home, and uniHome objects
	 * @param username The username of the user that has been logged in
	 */
	
	public UserUI(String username){
		loginUI = new LoginUI();
		user = loginUI.getUser(username);
		home = new UserHome();
		uniHome = new UniversityHome();
	}
	
	/**
	 * 
	 * viewSavedSchools() calls viewSchools on the userHome with the user object as a parameter and returns a String array
	 * containing the user's saved schools
	 * 
	 * @return a String[] containing the user's saved schools. 
	 */
	
	public String[] viewSavedSchools(){
		return home.viewSchools(user);
	}
	
	/**
	 * saveSchool(String school) calls saveSchool on the userHome with the user's username and school's name as parameters,
	 * which saves the given school to the user.
	 * 
	 * @param school The school name that you want to save to the user.
	 */
	public void saveSchool(String school){
		home.saveSchool(user.getUsername(), school);
	}
	
	/**
	 * removeSchool(String school) calls removeSchool on the userHome with the user's username and school's name as parameters,
	 * which removes the given school from the user's list of saved schools.
	 * 
	 * @param school The school name that you want to remove from the user's list of saved schools
	 * @return a positive number if the school was successfully removed or a negative number if it was not.
	 */
	public int removeSchool(String school){
		return home.removeSchool(user.getUsername(),school);
	}
	
	/**
	 * editProfile calls editProfile on the userHome, editing the user's information in the database.
	 * @param firstName the user's (potentially) edited first name.
	 * @param lastName	the user's (potentially) edited last name.
	 * @param pass	the user's (potentially) edited password.
	 */
	public void editProfile(String firstName, String lastName, String pass){
		home.editProfile(firstName, lastName, user.getUsername(), pass, user.getType(), user.getActivated());
	}
	
	/**
	 * displaySchool outputs a string array containing a given school's information that can then be displayed.
	 * 
	 * @param school the name of the school to be displayed
	 * @return a string array containing a given school's information
	 */
	public String[] displaySchool(String school){
		String[] array = new String[21];
		String[] otherArray = home.displaySchool(school);
		for(int i = 0; i<otherArray.length; i++){
			array[i] = otherArray[i];
		}
		
		String[] emphases = home.findEmphases(school);
		for(int i = 0; i<emphases.length; i++){
				array[i+16] = emphases[i];
		}
		return array;
	}
	
	/**
	 * method that rates the schools by how well the schools match the given search material (params)
	 * then returns an arraylist with the correct order of the schools based upon how well they match
	 * @param school for the name of the school
	 * @param state for the state of the school
	 * @param location for the location of the school eg. RURAL, URBAN
	 * @param control for the control of the school eg. PUBLIC, PRIVATE
	 * @param popL for the low end of the desired student population
	 * @param popH for the high end of the desired student population
	 * @param perFemL for the low end of the desired percentage of school that is female
	 * @param perFemH for the high end of the desired percentage of school that is female
	 * @param SATVerbL for the low end of the desired SAT Verbal scores that are accepted
	 * @param SATVerbH for the high end of the desired SAT Verbal scores that are accepted
	 * @param SATMathL for the low end of the desired SAT Math scores that are accepted
	 * @param SATMathH for the high end of the desired SAT Math scores that are accepted
	 * @param expensesL for the low end of the desired expenses of a school for one year
	 * @param expensesH for the high end of the desired expenses of a school for one year
	 * @param finAidL for the low end of the desired percent financial aid the school gives
	 * @param finAidH for the high end of the desired percent financial aid the school gives
	 * @param numAppsL for the low end of the desired number of applicants
	 * @param numAppsH for the high end of the desired number of applicants
	 * @param perAdmL for the low end of the desired percent of applicants admitted
	 * @param perAdmH for the high end of the desired percent of applicants admitted
	 * @param perEnrollL for the low end of the desired percent of admitted that enroll
	 * @param perEnrollH for the high end of the desired percent of admitted that enroll
	 * @param acadScaleL for the low end of the rating of the schools academics (1-5)
	 * @param acadScaleh for the high end of the rating of the schools academics (1-5)
	 * @param socialScaleL for the low end of the rating of the schools social life (1-5)
	 * @param socialScaleH for the high end of the rating of the schools social life (1-5)
	 * @param qualLifeL for the low end of the rating of the schools quality of life (1-5)
	 * @param qualLifeH for the high end of the rating of the schools quality of life (1-5)
	 * @return an ArrayList<University> containing all the universities in their correct order
	 */
	
	public ArrayList<University> search(String school, String state, String location, String control, 
			  int popL, int popH, double perFemL, double perFemH, double SATVerbL, double SATVerbH,
			  double SATMathL, double SATMathH, double expensesL, double expensesH,
			  double finAidL, double finAidH, int numAppsL, int numAppsH, double perAdmL, double perAdmH,
			  double perEnrollL, double perEnrollH, int acadScaleL, int acadScaleH, int socialScaleL, 
			  int socialScaleH, int qualLifeScaleL, int qualLifeScaleH){
		return uniHome.search(school, state, location, control, popL, popH, perFemL, perFemH, SATVerbL, SATVerbH, SATMathL, SATMathH, expensesL, expensesH, finAidL, 
				finAidH, numAppsL, numAppsH, perAdmL, perAdmH, perEnrollL, perEnrollH, acadScaleL, acadScaleH, socialScaleL, socialScaleH, qualLifeScaleL, 
				qualLifeScaleH);
	}
	/**
	   * a method that returns the schools that most closely match the given school
	   * @param the university for which you wish to fine related schools
	   * @return an ArrayList<University> containing the ordered list of the schools that match the given school, from best to worst match
	   */
	public ArrayList<University> relatedSchools(University uni) {
		return uniHome.relatedSchool(uni);
	}
	
}
