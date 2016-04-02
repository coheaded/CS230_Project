package homes;
/**
 * 
 */
import java.util.*;
import controller.DBController;
import people.Person;
import people.University;

/**
 * @author smcarik, ldschramel, ccnoecker, a1noack
 * @version 3.15.16
 * Class that contains all methods that an admin can perform, most via accessing a dbcontroller
 */
public class AdminHome {

	/**
	 * database controller object
	 */
	private DBController controller;
	
	/**
	 * constructor that creates admin home object and gives a value to to controller thats used to access the database
	 */
	public AdminHome() {
		// TODO Auto-generated constructor stub
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	/**
	 * adds a new user to the database via controller 
	 * @param fname person first name
	 * @param lname person last name
	 * @param uname person user name
	 * @param pnord person pass word
	 * @param type person type
	 */
	public void addPerson(String fname, String lname, String uname, String pnord, char type)
	{
		controller.addUser(fname, lname, uname, pnord, type);
	}
	
	/**
	 * changes the activation of the person specified, if Y -> N if N -> Y
	 * @param person
	 */
	public void changeActivated(String user)
	{
		String[][] users = controller.getUsers();
		for(int i = 0; i<users.length;i++){
			if(users[i][2].equals(user)){
				if(users[i][5].equalsIgnoreCase("y"))
					controller.editUser(users[i][0], users[i][1], users[i][2], users[i][3], users[i][4].charAt(0), 'N');
				else
					controller.editUser(users[i][0], users[i][1], users[i][2], users[i][3], users[i][4].charAt(0), 'Y');
			}
		}
		
		//person.setActivated();
	}
	
	/**
	 * gets a 2-D array of all users from the database via the controller
	 * @return The 2-D array of all users
	 */
	public String[][] viewPeople()
	{
		String[][] array = controller.getUsers();
		return array; 
	}
	
	/**
	 * edits the info for a specific person and updates the database with that information
	 * @param fname persons first name
	 * @param lname persons last name
	 * @param uname persons user name
	 * @param pword persons pass word
	 * @param type  persons type
	 * @param status persons activation status
	 */
	public void editPerson(String fname, String lname, String uname, String pword, char type, char status)
	{
		controller.editUser(fname, lname, uname, pword, type, status);
		
	}
	

	/**
	 * creates a new university and adds it to the database via the database controller
	 * @param school  Universities name
	 * @param state universities state
	 * @param location universities location
	 * @param control universities control (private or public)
	 * @param studPop universities student population
	 * @param percFem universities female percentage
	 * @param satVerb universities sat verbal scores
	 * @param satMath universities sat math scores
	 * @param expenses universities expenses
	 * @param percFinAid universities percentage of students with financial aid
	 * @param numApps universities universities number of applicants
	 * @param percAdmitted universities percent of students admitted
	 * @param percEnrolled universities percent of admitted students enrolled
	 * @param acadScale universities academic scale
	 * @param socialScale universities social life scale
	 * @param qualityOfLife universities quality of life scale
	 * @param emphases universities main academic focuses
	 * @throws IllegalArgumentException  if studPop is below -1
	 * @throws IllegalArgumentException if percFem is below -1 or above 100
	 * @throws IllegalArgumentException if satVerb is below -1 or above 800
	 * @throws IllegalArgumentException if satMath is below -1 or above 800
	 * @throws IllegalArgumentException if expenses is below -1
	 * @throws IllegalArgumentException if percFinAid is below -1 or above 100
	 * @throws IllegalArgumentException if numApps is below -1
	 * @throws IllegalArgumentException if percAdmitted is below -1 or above 100
	 * @throws IllegalArgumentException if acadScale is below -1 or above 5
	 * @throws IllegalArgumentException if socialScale is below -1 or above 5
	 * @throws IllegalArgumentException if qualityOfLife is below -1 or above 5
	 */
	
	
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			double percFem, double satVerb, double satMath, double expenses, double percFinAid, int numApps, double percAdmitted, 
			double percEnrolled, int acadScale, int socialScale, int qualityOfLife, String[] emphases)
	{
		if(studPop<-1)
			throw new IllegalArgumentException("Must have a positive student population");
		if(percFem<-1 || percFem>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(satVerb<-1 || satVerb>800)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(satMath<-1 || satMath>800)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(expenses<-1)
			throw new IllegalArgumentException("Must have a positive expense");
		if(percFinAid<-1 || percFinAid>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(numApps<-1)
			throw new IllegalArgumentException("Must have a positive number of applicants");
		if(percAdmitted<-1 || percAdmitted>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(percEnrolled<-1 || percEnrolled>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(acadScale<-1 || acadScale>5)
			throw new IllegalArgumentException("Academic scale must be between 0 and 5");
		if(socialScale<-1 || socialScale>5)
			throw new IllegalArgumentException("Social scale must be between 0 and 5");
		if(qualityOfLife<-1 || qualityOfLife>5)
			throw new IllegalArgumentException("Quality of life scale must be between 0 and 5");
		
		controller.addUniversity(school, state, location, control, studPop, 
				percFem, satVerb, satMath, expenses, percFinAid, numApps, percAdmitted, 
				 percEnrolled, acadScale, socialScale, qualityOfLife);
		for(int i = 0; i<emphases.length; i++){
			controller.addUniversityEmphasis(school, emphases[i]);
		}
	}
	
	/**
	 * edits a new university and adds the changes to the database via the database controller
	 * @param school  Universities name
	 * @param state universities state
	 * @param location universities location
	 * @param control universities control (private or public)
	 * @param studPop universities student population
	 * @param percFem universities female percentage
	 * @param satVerb universities sat verbal scores
	 * @param satMath universities sat math scores
	 * @param expenses universities expenses
	 * @param percFinAid universities percentage of students with financial aid
	 * @param numApps universities universities number of applicants
	 * @param percAdmitted universities percent of students admitted
	 * @param percEnrolled universities percent of admitted students enrolled
	 * @param acadScale universities academic scale
	 * @param socialScale universities social life scale
	 * @param qualityOfLife universities quality of life scale
	 * @param emphases universities main academic focuses
	 * @throws IllegalArgumentException if numberOfStudents is below -1
	 * @throws IllegalArgumentException if percentFemales is below -1 or above 100
	 * @throws IllegalArgumentException if SATVerbal is below -1 or above 800
	 * @throws IllegalArgumentException if SATMath is below -1 or above 800
	 * @throws IllegalArgumentException if expenses is below -1
	 * @throws IllegalArgumentException if percentFinancialAid is below -1 or above 100
	 * @throws IllegalArgumentException if numberOfApplicants is below -1
	 * @throws IllegalArgumentException if percentAdmitted is below -1 or above 100
	 * @throws IllegalArgumentException if academicsScale is below -1 or above 5
	 * @throws IllegalArgumentException if socialScale is below -1 or above 5
	 * @throws IllegalArgumentException if qualityOfLifeScale is below -1 or above 5
	 */
	public void editUniversity(String school, String state, String location, String control, int numberOfStudents, 
			double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, 
			int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale, String[] emphases){
		if(numberOfStudents<-1)
			throw new IllegalArgumentException("Must have a positive student population");
		if(percentFemales<-1 || percentFemales>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(SATVerbal<-1 || SATVerbal>800)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(SATMath<-1 || SATMath>800)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(expenses<-1)
			throw new IllegalArgumentException("Must have a positive expense");
		if(percentFinancialAid<-1 || percentFinancialAid>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(numberOfApplicants<-1)
			throw new IllegalArgumentException("Must have a positive number of applicants");
		if(percentAdmitted<-1 || percentAdmitted>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(percentEnrolled<-1 || percentEnrolled>100)
			throw new IllegalArgumentException("Must have a percentage between 0 and 100");
		if(academicsScale<-1 || academicsScale>5)
			throw new IllegalArgumentException("Academic scale must be between 0 and 5");
		if(socialScale<-1 || socialScale>5)
			throw new IllegalArgumentException("Social scale must be between 0 and 5");
		if(qualityOfLifeScale<-1 || qualityOfLifeScale>5)
			throw new IllegalArgumentException("Quality of life scale must be between 0 and 5");  
		
		controller.editUniversity(school, state, location, control, numberOfStudents, 
				  percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, 
				  numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		  
		  String[][] emphasis = controller.getNamesWithEmphases();
		  
		  for(int i = 0; i<emphasis.length; i++){
			  if(emphasis[i][0].equalsIgnoreCase(school)){
				  controller.removeUniversityEmphasis(school,emphasis[i][1]);
			  }
		  }
		  
		  for(int i = 0; i < emphases.length; i++){
			  controller.addUniversityEmphasis(school, emphases[i]);
		  }
		  
		  
	}
	
	/**
	 * this method takes in a school as a param and then returns an array containing all information of the school
	 * @param school the school that will have its info displayed
	 * @return retArray the array containing the schools info
	 */
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
	
	/**
	 * accesses the database via the controller and gets the emphases for the specified school
	 * @param school school to get the emphases of
	 * @return retArray the array containing the schools emphases
	 */
	public String[] findEmphases(String school){

		String[][] emphases = controller.getNamesWithEmphases();
		String[] retArray = new String[15];
		int count = 0;
		for(int i = 0; i<emphases.length; i++){
			
			if(emphases[i][0].equalsIgnoreCase(school)){
				retArray[count] = emphases[i][1];
				count++;
			}
		}
		return retArray;
	}
	
	/**
	 * gets all the schools in the database and returns an 2-D array of the information
	 * @return schools the 2-D of the schools and their information
	 */
	public String[][] viewSchools()
	{
		String [][] schools = controller.getUniversities();
		return schools;
	}
	
	/**
	 * returns a priorityQueue of all University objects
	 * @return the priorityQueue containing all university objects
	 */
	public PriorityQueue<University> getAllUs() {
		return controller.getUs();
	}
	  
}
