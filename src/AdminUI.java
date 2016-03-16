import java.util.*;
/**
 * @author a1noack
 * @version 3/15/16
 * @description This class manipulates multiple home controllers to allow the Admin to perform their required functions
 */
public class AdminUI {
	/**
	 * The AdminHome used to modify Persons in the system
	 */
	private AdminHome home;
	/**
	 * The User that is currently logged in
	 */
	private Person user;
	/**
	 * The LoginUI class that is used to login to the system
	 */
	private LoginUI loginUI;
	
	/**
	 * Returns a new AdminUI
	 * @param username the username of the admin logged in
	 */
	public AdminUI(String username){
		loginUI = new LoginUI();
		home = new AdminHome();
	}
	
	/**
	 * This method adds a new Person to the database
	 * @param fname the first name of the new Person
	 * @param lname the last name of the new Person
	 * @param uname the username of the new Person
	 * @param pnord the Password of the new Person
	 * @param type the type of the new Person
	 */
	public void addPerson(String fname, String lname, String uname, String pnord, char type)
	{
		home.addPerson(fname, lname, uname, pnord, type);
	}
	
	/**
	 * This method edits an existing Person in the database
	 * @param fname the new first name of the Person
	 * @param lname the new last name of the Person
	 * @param uname the new username of the Person
	 * @param pnord the new Password of the Person
	 * @param type the new type of the Person
	 */
	public void editPerson(String fname, String lname, String username, String pass, char type, char activated)
	{
		home.editPerson(fname, lname, username, pass, type, activated);
	}
	
	/**
	 * This method sets the Person instance variable to the user with the specified username
	 * @param username the username of the Person to edit
	 */
	public void chooseEdited(String username){
		user = loginUI.getUser(username);
	}
	
	/**
	 * A method that adds a university to the database
	 * @param name for name of school
	 * @param state for state school is in
	 * @param location for location of school eg. RURAL, URBAN
	 * @param control for if the school is private or public
	 * @param studentPop for the student population
	 * @param femPercent for the percentage of the school that is female
	 * @param satVerbal for the minimum SAT Verbal accepted
	 * @param satMath for the minimum SAT Math accepted
	 * @param expenses for the projected expenses of one year
	 * @param finAidPercent for the percent of financial aid the school gives
	 * @param numApps for the number of applicants
	 * @param admittedPercent for the percent of applicants admitted
	 * @param enrolledPercent for the percent of admitted students that enroll
	 * @param academicScale for the quality of academics scale 1-5
	 * @param socialScale for the quality of social life scale 1-5
	 * @param qualityOfLife for the quality of life scale 1-5
	 * @param emphases array containing the emphases of the school
	 */
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			double percFem, double satVerb, double satMath, double expenses, double percFinAid, int numApps, double percAdmitted, 
			double percEnrolled, int acadScale, int socialScale, int qualityOfLife, String[] emphases){
		home.addUniversity(school, state, location, control, studPop, percFem, satVerb, satMath, expenses, percFinAid, numApps, percAdmitted, percEnrolled, acadScale, socialScale, qualityOfLife, emphases);
	}
	
	/**
	 * A method that edits an existing university in the database
	 * @param name for name of school
	 * @param state for state school is in
	 * @param location for location of school eg. RURAL, URBAN
	 * @param control for if the school is private or public
	 * @param studentPop for the student population
	 * @param femPercent for the percentage of the school that is female
	 * @param satVerbal for the minimum SAT Verbal accepted
	 * @param satMath for the minimum SAT Math accepted
	 * @param expenses for the projected expenses of one year
	 * @param finAidPercent for the percent of financial aid the school gives
	 * @param numApps for the number of applicants
	 * @param admittedPercent for the percent of applicants admitted
	 * @param enrolledPercent for the percent of admitted students that enroll
	 * @param academicScale for the quality of academics scale 1-5
	 * @param socialScale for the quality of social life scale 1-5
	 * @param qualityOfLife for the quality of life scale 1-5
	 * @param emphases array containing the emphases of the school
	 */
	public void editUniversity(String school, String state, String location, String control, int numberOfStudents, 
			double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, 
			int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale, String[] emphases){
		  home.editUniversity(school, state, location, control, numberOfStudents, 
				  percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, 
				  numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale, emphases);
	}
	
	/**
	 * This method returns a String array of the attributes associated with the specified school name
	 * @param school the name of the school to display
	 * @return a String representing the University's attributes
	 */
	public String[] displaySchool(String school){
		String[] array = new String[31];
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
	 * Returns an array of String arrays with each Person's attributes listed
	 * @return an array of arrays of Strings representing People
	 */
	public String[][] viewPeople()
	{
		String[][] array = home.viewPeople();
		return array; 
	}
	
	/**
	 * Returns an array of String arrays with each University's attributes listed
	 * @return an array of arrays of Strings representing Universities
	 */
	public String[][] viewSchools()
	{
		String [][] schools = home.viewSchools();
		String[][] ret = new String[225][31];
		for(int i = 0; i< schools.length; i++)
		{
			String[] array = new String[31];
			String[] otherArray = home.displaySchool(schools[i][0]);
			for(int j = 0; j<otherArray.length; j++){
				array[j] = otherArray[j];
			}	
			String[] emphases = home.findEmphases(schools[i][0]);
			for(int j = 0; j<emphases.length; j++){
				array[j+16] = emphases[j];
			}
			for (int j = 0; j < array.length; j++)
			{
				ret[i][j] = array[j];
			}
		}
		return ret;
	}
	
	/**
	 * returns a priorityQueue of all University objects
	 * @return the priorityQueue containing all university objects
	 */
	public PriorityQueue<University> getAllUs()
	{
		return home.getAllUs();
	}
}
