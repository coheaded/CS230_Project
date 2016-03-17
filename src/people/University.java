package people;

/**
 * @author smcarik
 * @version 03/15/2016
 *Class that creates a university object with its given variables
 */
public class University implements Comparable<University>{

	
	/**
	 * variable for the name of the university
	 */
	private String name;
	
	/**
	 * variable for the state the school is in
	 */
	private String state;
	
	/**
	 * variable for the location of the school eg. Rural, Urban
	 */
	private String location;
	
	/**
	 * variable for if the school is private or public
	 */
	private String control;
	
	/**
	 * variable for the student population at the school
	 */
	private	int studentPop;
	
	/**
	 * variable for the percent of the school that is female
	 */
	private double femPercent;
	
	/**
	 * variable for the minimum SAT Verbal score the school takes
	 */
	private double satVerbal;
	
	/**
	 * variable for the minimum SAT Math score the school takes
	 */
	private double satMath;
	
	/**
	 * variable for the expected expenses of one year
	 */
	private double expenses;
	
	/**
	 * variable for the average percent of financial aid given to students
	 */
	private double finAidPercent;
	
	/**
	 * variable for the number of applicants
	 */
	private int numApps;
	
	/**
	 * variable for the percent of applicants admitted
	 */
	private double admittedPercent;
	
	/**
	 * variable for the percent of students who enroll
	 */
	private double enrolledPercent;
	
	/**
	 * rating of the schools quality of academics from 1-5
	 */
	private int academicScale;
	
	/**
	 * rating of the schools quality of social life from 1-5
	 */
	private int socialScale;
	
	/**
	 * rating of the schools quality of life from 1-5
	 */
	private int qualityOfLife;
	
	/**
	 * array variable that holds the emphases of the school
	 */
	private String[] emphases;
	
	/**
	 * variable used for search method to determine how closely the school matches the search criteria
	 */
	private int matchStrength;
	
	/**
	 * A constructor that creates a university object with the given params
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
	public University(String name, String state, String location, String control, int studentPop, double femPercent,
			double satVerbal, double satMath, double expenses, double finAidPercent, int numApps, double admittedPercent,
			double enrolledPercent, int academicScale, int socialScale, int qualityOfLife, String[] emphases) {
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.studentPop = studentPop;
		this.femPercent = femPercent;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.finAidPercent = finAidPercent;
		this.numApps = numApps;
		this.admittedPercent = admittedPercent;
		this.enrolledPercent = enrolledPercent;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLife = qualityOfLife;
		this.emphases = emphases;
		
		matchStrength = 0;
		
	}
	
	/**
	 * A constructor that creates a university object with the given params, this one does not include emphases
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
	 */
	public University(String name, String state, String location, String control, int studentPop, double femPercent,
			double satVerbal, double satMath, double expenses, double finAidPercent, int numApps, double admittedPercent,
			double enrolledPercent, int academicScale, int socialScale, int qualityOfLife) {
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.studentPop = studentPop;
		this.femPercent = femPercent;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.finAidPercent = finAidPercent;
		this.numApps = numApps;
		this.admittedPercent = admittedPercent;
		this.enrolledPercent = enrolledPercent;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLife = qualityOfLife;
		
		matchStrength = 0;
		
	}
	/**
	 * a default constructor that creates a University object
	 */
	public University() {
		this.name = "";
		this.state = "";
		this.location = "";
		this.control = "";
		this.studentPop = 0;
		this.femPercent = 0;
		this.satVerbal = 0;
		this.satMath = 0;
		this.expenses = 0;
		this.finAidPercent = 0;
		this.numApps = 0;
		this.admittedPercent = 0;
		this.enrolledPercent = 0;
		this.academicScale = 0;
		this.socialScale = 0;
		this.qualityOfLife = 0;
		this.emphases = new String[25];
		matchStrength = 0;
	}
	
	/**
	 * method that makes the schools compared by their match strength for the PriorityQueue for search method
	 * @return int for the comparison of the schools
	 */
	public int compareTo(University university){
		return -(this.matchStrength - university.getMatchStrength());  
	}
	
	
	/**
	 * method that gets the name of the school
	 * @return the name of the school
	 */
	public String getName() {
		return name;
	}
	/**
	 * method that sets the name of the school
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * method that gets the state the school is in
	 * @return the state the school is in
	 */
	public String getState() {
		return state;
	}
	/**
	 * method that sets the state of the school
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * method that returns the location of the school
	 * @return the location of the school
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * method that sets the location of the school eg. RURAL, URBAN
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * method that gets the control of the school
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	/**
	 * method that sets the control of the school eg. PRIVATE, PUBLIC
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * method that returns the student population
	 * @return the student population
	 */
	public int getStudentPop() {
		return studentPop;
	}
	/**
	 * method that sets the student population
	 * @param studentPop the studentPop to set
	 */
	public void setStudentPop(int studentPop) {
		this.studentPop = studentPop;
	}
	/**
	 * method that returns the percentage of the school that is female
	 * @return the femPercent
	 */
	public double getFemPercent() {
		return femPercent;
	}
	/**
	 * method that sets the percent of the school that is female
	 * @param femPercent the femPercent to set
	 */
	public void setFemPercent(int femPercent) {
		this.femPercent = femPercent;
	}
	/**
	 * method that gets the SAT Verbal
	 * @return the satVerbal
	 */
	public double getSatVerbal() {
		return satVerbal;
	}
	/**
	 * method that sets the SAT Verbal
	 * @param satVerbal the satVerbal to set
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	/**
	 * method that gets the SAT Math
	 * @return the satMath
	 */
	public double getSatMath() {
		return satMath;
	}
	/**
	 * method that sets the SAT Math
	 * @param satMath the satMath to set
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	/**
	 * method that returns the expenses for one year
	 * @return the expenses
	 */
	public double getExpenses() {
		return expenses;
	}
	/**
	 * method that sets the expenses for a school for one year
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	/**
	 * method that returns the percentage of financial aid the school gives
	 * @return the finAidPercent
	 */
	public double getFinAidPercent() {
		return finAidPercent;
	}
	/**
	 * method that sets the percentage of financial aid the school gives
	 * @param finAidPercent the finAidPercent to set
	 */
	public void setFinAidPercent(int finAidPercent) {
		this.finAidPercent = finAidPercent;
	}
	/**
	 * method that returns the number of applicants
	 * @return the numApps
	 */
	public int getNumApps() {
		return numApps;
	}
	/**
	 * method that sets the number of applicants
	 * @param numApps the numApps to set
	 */
	public void setNumApps(int numApps) {
		this.numApps = numApps;
	}
	/**
	 * method that returns the percent of applicants accepted
	 * @return the admittedPercent
	 */
	public double getAdmittedPercent() {
		return admittedPercent;
	}
	/**
	 * method that sets the percent of applicants accepted
	 * @param admittedPercent the admittedPercent to set
	 */
	public void setAdmittedPercent(int admittedPercent) {
		this.admittedPercent = admittedPercent;
	}
	/**
	 * method that returns the number of admitted that enroll
	 * @return the enrolledPercent
	 */
	public double getEnrolledPercent() {
		return enrolledPercent;
	}
	/**
	 * method that sets the number of admitted that enroll
	 * @param enrolledPercent the enrolledPercent to set
	 */
	public void setEnrolledPercent(int enrolledPercent) {
		this.enrolledPercent = enrolledPercent;
	}
	/**
	 * method that returns the academic measurement of the school
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	/**
	 * method that sets the academic quality of the school (1-5)
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	/**
	 * method that returns the social life rating of the school
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	/**
	 * method that sets the social life rating of the school (1-5)
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * method that returns the quality of life rating of the school
	 * @return the qualityOfLife
	 */
	public int getQualityOfLife() {
		return qualityOfLife;
	}
	/**
	 * method that sets the quality of life rating of the school (1-5)
	 * @param qualityOfLife the qualityOfLife to set
	 */
	public void setQualityOfLife(int qualityOfLife) {
		this.qualityOfLife = qualityOfLife;
	}
	/**
	 * method that returns an array containing the emphases of the school
	 * @return the emphases
	 */
	public String[] getEmphases() {
		return emphases;
	}
	/**
	 * method that sets the emphases of the school
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String[] emphases) {
		this.emphases = emphases;
	}
	
	/**
	 * method that adds to a school match strength
	 * @param amt for the amount to add
	 */
	public void addToMatchStrength(int amt){
		this.matchStrength+=amt;
	}
	
	/**
	 * method that resets the schools match strength to 0
	 */
	public void resetMatchStrength(){
		this.matchStrength=0;
	}
	
	/**
	 * method that returns the schools match strength
	 * @return matchstrength
	 */
	public int getMatchStrength(){
		return this.matchStrength; 
	}
	/**
	 * method that returns a string of all the variables for a school
	 * @return the list of all variables
	 */
	@Override
	public String toString() {
		String emphasis = "";
		for(int i = 0; i < emphases.length; i++){
			if(emphases[i]!=null)
				emphasis = emphasis + ", " + emphases[i];
		}
		return matchStrength + "  [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", studentPop=" + studentPop + ", femPercent=" + femPercent + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", finAidPercent=" + finAidPercent + ", numApps="
				+ numApps + ", academicScale=" + academicScale + ", admittedPercent=" + admittedPercent
				+ ", enrolledPercent=" + enrolledPercent + ", socialScale=" + socialScale + ", qualityOfLife="
				+ qualityOfLife + ", emphases=" + emphasis + "]";
	}
	
	

}
