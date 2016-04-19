package controller;
import dblibrary.project.csci230.UniversityDBLibrary;
import people.Admin;
import people.Person;
import people.University;
import people.User;

import java.util.*;

/**
 * class that communicates with the database library and contains methods to  ease controller functions
 * @author ldschramel, smcarik, a1noack, ccnoecker
 * @version 03/15/2016
 *
 */
public class DBController {
	/**
	 * database object
	 */
	private UniversityDBLibrary univDBlib = new UniversityDBLibrary("cottonhead", "cottonhead","acls4");
	private boolean loggedin = false;
	private Person user;
	/**
	 * constructor that creates a database object
	 * @param db database name
	 * @param username username of database
	 * @param password password for database
	 */
	  public DBController(String db, String username, String password){
	    univDBlib = new UniversityDBLibrary(db,username,password);
	  }
	  /**
	   * default constructor
	   */
	  public DBController(){}
	  
	  /**
	   * method that returns an instance of this class
	   * @return
	   */
	  public UniversityDBLibrary getUnivDBlib(){
	    return univDBlib;
	  }
	  
	  /**
	   * method that returns a list of all users and thier information
	   * @return users a 2-D array of strings with each user and their information
	   */
	  public String[][] getUsers(){
		  String[][] users = univDBlib.user_getUsers();
		  return users;
	  }
	  
	 /**
	  * method that checks the database for login material provided and passes along a char if the person is a user, admin, or not part of the system/not activated
	  * @param username username of person logging in
	  * @param pass password of person loggin in
	  * @return char u if person is user and activated, char a if person is admin and activated, char n if not in system or not activated
	  */
	  public char login(String username, String pass){
		  String[][] array = univDBlib.user_getUsers();
		  for(int i=0; i<array.length; i++){

			  if(array[i][2].equals(username) && array[i][3].equals(pass)){
				  if(array[i][4].equals("u") && array[i][5].equalsIgnoreCase("y")){
					  return 'u';
				  }
				  else if(array[i][4].equals("a") && array[i][5].equalsIgnoreCase("y")){
					  return 'a';
				  }
			  }
		  }
		  return 'n';
	  }
	  
	  public int login2(String username, String pass) {
		  int status = -4;
		  String[][] array = univDBlib.user_getUsers();
		  for(int i = 0; i< array.length; i++) {
			  status = -1;
			  if(array[i][2].equals(username)) {
				  if(array[i][3].equals(pass)) {
					  if(array[i][4].equalsIgnoreCase("u")){
						  if(array[i][5].equalsIgnoreCase("y")) {
							  status = 1;
							  user = new User(array[i][0],array[i][1],array[i][2],array[i][3],array[i][4].charAt(0),array[i][5].charAt(0));
							  loggedin = true;
							  return status;
						  }
						  else{
							  status = -3;
							  return status;
						  }
					  }
					  else if(array[i][4].equalsIgnoreCase("a")){ 
						  if(array[i][5].equalsIgnoreCase("y")) {
							  status = 2;
							  user = new Admin(array[i][0],array[i][1],array[i][2],array[i][3],array[i][4].charAt(0),array[i][5].charAt(0));
							  loggedin = true;
							  return status;
						  }
						  else{
							  status = -3;
							  return status;
						  }
					  }
				  }
				  else {
					  status = -2;
					  return status;
				  }
			  }
		  }
		  return status;
	  }
	  
	  public void logOut()
	  {
		  user = null;
		  loggedin = false; 
	  }
	  
	  /**
	   * method that gets the currently logged in user
	   * @return the currently logged in user
	   */
	  public Person getCurrentUser(){
		  return user;
	  }
	  
	  /**
	   * gets whether a user is logged in or not
	   * @return true if user is logged in, otherwise false
	   */
	  public boolean getloggedin() {
		  return loggedin;
	  }
	  
	  /**
	   * sets user to the currently logged in user
	   * @param user the user that is loggin in
	   */
	  public void setCurrentUser(Person user) {
		  this.user=user;
	  }
	  
	  /**
	   * sets the status of logged in to givin parameter
	   * @param status new status of logged in
	   */
	  public void setLoggedIn(boolean status) {
		  loggedin = status;
	  }
	  
	  /**
	   * adds a new user with the given params as their info
	   * @param firstName firstname of person
	   * @param lastName lastname of person
	   * @param username username for person
	   * @param pass password for person
	   * @param type the type of person eg. 'a' for admin, 'u' for user
	   */
	  public int addUser(String firstName, String lastName, String username, String pass, char type){
		  if(type!='u' && type!= 'U' && type!='a' && type!='A')
			  throw new IllegalArgumentException("Type must either be u, U, a, or A");
		  int check = univDBlib.user_addUser(firstName, lastName, username, pass, type);
		  if(check<0)
			  throw new IllegalArgumentException("Username taken");
		  return check;
	  }
	  
	  /**
	   * method that returns a priority queue of universities objects
	   * @return uniList PriorityQueue<University> priority queue of all university objects
	   */
	  public PriorityQueue<University> getUs(){
		  PriorityQueue<University> unisList = new PriorityQueue<University>();
		  University toAdd;
		  String[][] unisData = getUniversities();
		  String[][] emphases = univDBlib.university_getNamesWithEmphases();
		  
		  
		  for(int i=0; i<unisData.length; i++){
			  String school = unisData[i][0];
			  String[] emphasis = new String[25];
			  int count = 0;
			  //while(emphases[count][0].equalsIgnoreCase(school)){
			  for(int j = 0; j < emphases.length; j++){

				  if(emphases[j][0].equalsIgnoreCase(school)){
					  emphasis[count] = emphases[j][1];
					  count++;
				  }
				  
			  }
			 toAdd = new University(unisData[i][0], unisData[i][1], unisData[i][2], unisData[i][3], Integer.parseInt(unisData[i][4]), Integer.parseInt(unisData[i][5]), Integer.parseInt(unisData[i][6]),
					 Integer.parseInt(unisData[i][7]), Integer.parseInt(unisData[i][8]), Integer.parseInt(unisData[i][9]), Integer.parseInt(unisData[i][10]), Integer.parseInt(unisData[i][11]), 
					 Integer.parseInt(unisData[i][12]), Integer.parseInt(unisData[i][13]), Integer.parseInt(unisData[i][14]), Integer.parseInt(unisData[i][15]),emphasis); 
			 unisList.add(toAdd);
		  }
		  return unisList;
	  }
	  
	  /**
	   * method that edits a user with the given username
	   * @param firstName firstname you wish to change to
	   * @param lastName lastname you wish to change to
	   * @param username username of person to be edited
	   * @param pass password you wish to change to
	   * @param type type you wish to change to
	   * @param activated activation you wish to change to
	   */
	  public int editUser( String firstName, String lastName, String username,  String pass, char type, char activated){
		  if(type!='u' && type!= 'U' && type!='a' && type!='A')
			  throw new IllegalArgumentException("Type must either be u, U, a, or A");
		  if(activated!='y' && activated!='Y' && activated!= 'n' && activated!= 'N')
			  throw new IllegalArgumentException("Activation must either y, Y, n, N");
		  return univDBlib.user_editUser(username, firstName, lastName,  pass, type, activated);
	  }
	  
	  /**
	   * method that returns all universities and their information
	   * @return a 2-D array of strings that contain all the information for each university
	   */
	  public String[][] getUniversities(){
		  return univDBlib.university_getUniversities();
	  }
	  
	/**
	 * method that adds a university with its information as the params
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
	  public int addUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  int check = univDBlib.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		  if(check<0)
			  	throw new IllegalArgumentException("School already exists in database");
		  return check;
	  }
	  
	  /**
	   * method to edit a university with to the given information based upon its name
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
	  public int editUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  return univDBlib.university_editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	  }
	  
	  /**
	   * method that gets each school and their emphases
	   * @return a 2-D array of strings that contain the university name and their emphases
	   */
	  public String[][] getNamesWithEmphases(){
		  return univDBlib.university_getNamesWithEmphases();
	  }
	  
	  /**
	   * method that adds an emphasis to a university with the given school name
	   * @param school the name of the school you wish to add emphasis to
	   * @param emphasis the name of the emphasis you with to add
	   */
	  public int addUniversityEmphasis(String school, String emphasis){
		 int check = univDBlib.university_addUniversityEmphasis(school, emphasis);
		 if(check<0)
			 throw new IllegalArgumentException("School already has given emphasis");
		 return check;
	  }
	  
	  /**
	   * method that removes an emphasis from a university with the given school name
	   * @param school the name of the school you wish to remove an emphasis from
	   * @param emphasis the name of the emphasis you wish to remove
	   */
	  public int removeUniversityEmphasis(String school, String emphasis){
		  return univDBlib.university_removeUniversityEmphasis(school, emphasis);
	  }
	  
	  /**
	   * method that gets all the emphases
	   * @return a 2-D array of string of all the emphases
	   */
	  public String[][] getEmphases(){
		  return univDBlib.university_getEmphases();
	  }
	  
	  /**
	   * method that returns the name of the user and their saved schools
	   * @return a 2-D array of strings containing the username of a user and their saved schools
	   */
	  public String[][] getUsernamesWithSavedSchools(){
		  return univDBlib.user_getUsernamesWithSavedSchools();
	  }
	  
	  /**
	   * method that saves a school to a given user
	   * @param user the username you wish to save a university to
	   * @param school the name of the school
	   */
	  public int saveSchool(String user, String school){
		  return univDBlib.user_saveSchool(user, school);
	  }
	  
	  /**
	   * removes a saved school from the given user
	   * @param user the username of the person you wish to remove a school from
	   * @param school the name of the school you wish to remove
	   * @return -1 if the remove failed, or 1 if the remove worked
	   */
	  public int removeSchool(String user, String school){
		  return univDBlib.user_removeSchool(user, school);
	  }
	  
	  /**
	   * deletes a school from the database,  not a functional requirement, only used in testing
	   * @param school the school to be deleted
	   * @return 1 for true deletion, -1 for false deletion
	   */
	  public int deleteUniversity(String school) {
		  return univDBlib.university_deleteUniversity(school);
	  }
	  
	  /**
	   * deletes a user from the database, not a functional requirement, only used in testing
	   * @param user the user to be delete
	   * @return 1 for true deletion, -1 for false deletion
	   */
	  public int deleteUser(String user) {
		  return univDBlib.user_deleteUser(user);
	  }
}
