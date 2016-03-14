/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class University implements Comparator<University>, Comparable<University>{

	
	
	private String name;
	private String state;
	private String location;
	private String control;
	private int studentPop;
	private int femPercent;
	private int satVerbal;
	private int satMath;
	private int expenses;
	private int finAidPercent;
	private int numApps;
	private int admittedPercent;
	private int enrolledPercent;
	private int academicScale;
	private int socialScale;
	private int qualityOfLife;
	private List<String> emphases;
	
	private int matchStrength;
	
	/**
	 * @param name
	 * @param state
	 * @param location
	 * @param control
	 * @param studentPop
	 * @param femPercent
	 * @param satVerbal
	 * @param satMath
	 * @param expenses
	 * @param finAidPercent
	 * @param numApps
	 * @param admittedPercent
	 * @param enrolledPercent
	 * @param academicScale
	 * @param socialScale
	 * @param qualityOfLife
	 * @param emphases
	 */
	public University(String name, String state, String location, String control, int studentPop, int femPercent,
			int satVerbal, int satMath, int expenses, int finAidPercent, int numApps, int admittedPercent,
			int enrolledPercent, int academicScale, int socialScale, int qualityOfLife, List<String> emphases) {
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
	 * 
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
		this.emphases = new ArrayList<String>();
		matchStrength = 0;
	}
	
	@Override
	public int compareTo(University university){
		return this.matchStrength - university.getMatchStrength();
	}
	
	@Override
	public int compare(University u1, University u2){
		return this.matchStrength - university.getMatchStrength();
	}
	
	public boolean equals(Object obj){}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * @return the studentPop
	 */
	public int getStudentPop() {
		return studentPop;
	}
	/**
	 * @param studentPop the studentPop to set
	 */
	public void setStudentPop(int studentPop) {
		this.studentPop = studentPop;
	}
	/**
	 * @return the femPercent
	 */
	public int getFemPercent() {
		return femPercent;
	}
	/**
	 * @param femPercent the femPercent to set
	 */
	public void setFemPercent(int femPercent) {
		this.femPercent = femPercent;
	}
	/**
	 * @return the satVerbal
	 */
	public int getSatVerbal() {
		return satVerbal;
	}
	/**
	 * @param satVerbal the satVerbal to set
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	/**
	 * @return the satMath
	 */
	public int getSatMath() {
		return satMath;
	}
	/**
	 * @param satMath the satMath to set
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	/**
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}
	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	/**
	 * @return the finAidPercent
	 */
	public int getFinAidPercent() {
		return finAidPercent;
	}
	/**
	 * @param finAidPercent the finAidPercent to set
	 */
	public void setFinAidPercent(int finAidPercent) {
		this.finAidPercent = finAidPercent;
	}
	/**
	 * @return the numApps
	 */
	public int getNumApps() {
		return numApps;
	}
	/**
	 * @param numApps the numApps to set
	 */
	public void setNumApps(int numApps) {
		this.numApps = numApps;
	}
	/**
	 * @return the admittedPercent
	 */
	public int getAdmittedPercent() {
		return admittedPercent;
	}
	/**
	 * @param admittedPercent the admittedPercent to set
	 */
	public void setAdmittedPercent(int admittedPercent) {
		this.admittedPercent = admittedPercent;
	}
	/**
	 * @return the enrolledPercent
	 */
	public int getEnrolledPercent() {
		return enrolledPercent;
	}
	/**
	 * @param enrolledPercent the enrolledPercent to set
	 */
	public void setEnrolledPercent(int enrolledPercent) {
		this.enrolledPercent = enrolledPercent;
	}
	/**
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	/**
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * @return the qualityOfLife
	 */
	public int getQualityOfLife() {
		return qualityOfLife;
	}
	/**
	 * @param qualityOfLife the qualityOfLife to set
	 */
	public void setQualityOfLife(int qualityOfLife) {
		this.qualityOfLife = qualityOfLife;
	}
	/**
	 * @return the emphases
	 */
	public List<String> getEmphases() {
		return emphases;
	}
	/**
	 * @param emphases the emphases to set
	 */
	public void setEmphases(List<String> emphases) {
		this.emphases = emphases;
	}
	
	public void addToMatchStrength(int amt){
		this.matchStrength+=amt;
	}
	public void resetMatchStrength(){
		this.matchStrength=0;
	}
	public int getMatchStrength(){
		return this.matchStrength; 
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "University [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", studentPop=" + studentPop + ", femPercent=" + femPercent + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", finAidPercent=" + finAidPercent + ", numApps="
				+ numApps + ", academicScale=" + academicScale + ", admittedPercent=" + admittedPercent
				+ ", enrolledPercent=" + enrolledPercent + ", socialScale=" + socialScale + ", qualityOfLife="
				+ qualityOfLife + ", emphases=" + emphases + "]";
	}

}
