/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class AdminHome {

	private DBController controller;
	/**
	 * 
	 */
	public AdminHome() {
		// TODO Auto-generated constructor stub
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	public void addPerson(String fname, String lname, String uname, String pnord, char type)
	{
		controller.addUser(fname, lname, uname, pnord, type);
	}
	
	
	public void changeActivated(Person person)
	{
		//person.setActivated();
		if(person.getActivated() == 'y' || person.getActivated() == 'Y')
			controller.editUser(person.getfName(), person.getlName(), person.getuName(), person.getpWord(), person.getType(), 'N');
		else
			controller.editUser(person.getfName(), person.getlName(), person.getuName(), person.getpWord(), person.getType(), 'Y');
	}
	
	public String[][] viewPeople()
	{
		String[][] array = controller.getUsers();
		return array; 
	}
	
	public void editPerson(String fname, String lname, String uname, String pword, char type, char status)
	{
		controller.editUser(fname, lname, uname, pword, type, status);
		
	}
	

	
	
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
	
	public String[][] viewSchools()
	{
		String [][] shit = controller.getUniversities();
		return shit;
	}
	  
	
}
