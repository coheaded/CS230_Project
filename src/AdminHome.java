/**
 * 
 */
import java.util.*;

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
	public void changeActivated(Person person)
	{
		//person.setActivated();
		if(person.getActivated() == 'y' || person.getActivated() == 'Y')
			controller.editUser(person.getfName(), person.getlName(), person.getuName(), person.getpWord(), person.getType(), 'N');
		else
			controller.editUser(person.getfName(), person.getlName(), person.getuName(), person.getpWord(), person.getType(), 'Y');
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
	 */
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			double percFem, double satVerb, double satMath, double expenses, double percFinAid, int numApps, double percAdmitted, 
			double percEnrolled, int acadScale, int socialScale, int qualityOfLife, String[] emphases)
	{
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
	 */
	public void editUniversity(String school, String state, String location, String control, int numberOfStudents, 
			double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, 
			int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale, String[] emphases){
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
	 * @return shit the 2-D of the schools and their information
	 */
	public String[][] viewSchools()
	{
		String [][] shit = controller.getUniversities();
		return shit;
	}
	
	/**
	 * returns a priorityQueue of all University objects
	 * @return the priorityQueue containing all university objects
	 */
	public PriorityQueue<University> getAllUs() {
		return controller.getUs();
	}
	  
}
