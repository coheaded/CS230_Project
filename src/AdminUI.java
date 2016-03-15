import java.util.*;
public class AdminUI {
	
	AdminHome home;
	Person user;
	LoginUI loginUI;
	
	public AdminUI(String username){
		loginUI = new LoginUI();
		home = new AdminHome();
	}

	public void addPerson(String fname, String lname, String uname, String pnord, char type)
	{
		home.addPerson(fname, lname, uname, pnord, type);
	}
	
	public void editPerson(String fname, String lname, String username, String pass, char type, char activated)
	{
		home.editPerson(fname, lname, username, pass, type, activated);
	}
	
	public void chooseEdited(String username){
		user = loginUI.getUser(username);
	}
	
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			double percFem, double satVerb, double satMath, double expenses, double percFinAid, int numApps, double percAdmitted, 
			double percEnrolled, int acadScale, int socialScale, int qualityOfLife, String[] emphases){
		home.addUniversity(school, state, location, control, studPop, percFem, satVerb, satMath, expenses, percFinAid, numApps, percAdmitted, percEnrolled, acadScale, socialScale, qualityOfLife, emphases);
	}
	
	public void editUniversity(String school, String state, String location, String control, int numberOfStudents, 
			double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, 
			int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale, String[] emphases){
		  home.editUniversity(school, state, location, control, numberOfStudents, 
				  percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, 
				  numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale, emphases);
	}
	
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
	
	public String[][] viewPeople()
	{
		String[][] array = home.viewPeople();
		return array; 
	}
	
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
	
	public PriorityQueue<University> getAllUs() {
		return home.getAllUs();
	}
}
