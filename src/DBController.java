import dblibrary.project.csci230.UniversityDBLibrary;
import java.util.*;

public class DBController {
	private UniversityDBLibrary univDBlib;
	  
	  public  DBController(String db, String username, String password){
	    univDBlib = new UniversityDBLibrary(db,username,password);
	  }
	  
	  public UniversityDBLibrary getUnivDBlib(){
	    return univDBlib;
	  }
	  
	  public String[][] getUsers(){
		  String[][] users = univDBlib.user_getUsers();
		  return users;
	  }
	  
	  public String login(String username, String pass){
		  String[][] array = univDBlib.user_getUsers();
		  for(int i=0; i<array.length; i++){
			  if(array[i][2].equals(username) && array[i][3].equals(pass)){
				  if(array[i][4].equals("u")){
					  return "u";
				  }
				  else{
					  return "a";
				  }
			  }
		  }
		  return "n";
	  }
	  
	  
	  public void addUser(String firstName, String lastName, String username, String pass, char type){
		  int check = univDBlib.user_addUser(firstName, lastName, username, pass, type);
		  if(check<0)
			  throw new IllegalArgumentException("Username taken");
	  }
	  
	  public void editUser(String firstName, String lastName, String username, String pass, char type, char activated){
		  univDBlib.user_editUser(firstName, lastName, username, pass, type, activated);
	  }
	  
	  public String[][] getUniversities(){
		  return univDBlib.university_getUniversities();
	  }
	  
	  public PriorityQueue<University> getUs(){
		  PriorityQueue<University> unisList = new PriorityQueue<University>();
		  University toAdd;
		  String[][] unisData = getUniversities();
		  for(int i=0; i<unisData.length; i++){
			 toAdd = new University(unisData[i][0], unisData[i][1], unisData[i][2], unisData[i][3], Integer.parseInt(unisData[i][4]), Integer.parseInt(unisData[i][5]), Integer.parseInt(unisData[i][6]),
					 Integer.parseInt(unisData[i][7]), Integer.parseInt(unisData[i][8]), Integer.parseInt(unisData[i][9]), Integer.parseInt(unisData[i][10]), Integer.parseInt(unisData[i][11]), 
					 Integer.parseInt(unisData[i][12]), Integer.parseInt(unisData[i][13]), Integer.parseInt(unisData[i][14]), Integer.parseInt(unisData[i][15])); 
			 unisList.add(toAdd);
		  }
		  return unisList;
	  }
	  
//	  String name, String state, String location, String control, int studentPop, int femPercent,
//		int satVerbal, int satMath, int expenses, int finAidPercent, int numApps, int admittedPercent,
//		int enrolledPercent, int academicScale, int socialScale, int qualityOfLife, List<String> emphases
	  
	  public int addUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  int check = univDBlib.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
//		  if(check<0)
//			  	throw new IllegalArgumentException("School already exists in database");
		  return check;
	  }
	  
	  public void editUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  univDBlib.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	  }
	  
	  public String[][] getNamesWithEmphases(){
		  return univDBlib.university_getNamesWithEmphases();
	  }
	  
	  public void addUniversityEmphasis(String school, String emphasis){
		 int check = univDBlib.university_addUniversityEmphasis(school, emphasis);
		 if(check<0)
			 throw new IllegalArgumentException("School already has given emphasis");
	  }
	  
	  public void removeUniversityEmphasis(String school, String emphasis){
		  univDBlib.university_removeUniversityEmphasis(school, emphasis);
	  }
	  
	  public String[][] getEmphases(){
		  return univDBlib.university_getEmphases();
	  }
	  
	  public String[][] getUsernamesWithSavedSchools(){
		  return univDBlib.user_getUsernamesWithSavedSchools();
	  }
	  
	  public void saveSchool(String user, String school){
		  univDBlib.user_saveSchool(user, school);
	  }
	  
	  public void removeSchool(String user, String school){
		  univDBlib.user_removeSchool(user, school);
	  }
}
