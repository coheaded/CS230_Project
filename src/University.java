/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class University implements Comparable<University>{

	
	
	private String name;
	private String state;
	private String location;
	private String control;
	private	int studentPop;
	private double femPercent;
	private double satVerbal;
	private double satMath;
	private double expenses;
	private double finAidPercent;
	private int numApps;
	private double admittedPercent;
	private double enrolledPercent;
	private int academicScale;
	private int socialScale;
	private int qualityOfLife;
	private String[] emphases;
	
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
		this.emphases = new String[5];
		matchStrength = 0;
	}
	
	
	public int compareTo(University university){
		return -(this.matchStrength - university.getMatchStrength());
		/*if (this.matchStrength > university.getMatchStrength())
		      return -1;
		    else if (this.matchStrength == university.getMatchStrength())
		        return 0;
		    else 
		      return 1;*/
		  
	}
	
	
//	public boolean equals(Object obj){
//		return false;
//	}
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
	public double getFemPercent() {
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
	public double getSatVerbal() {
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
	public double getSatMath() {
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
	public double getExpenses() {
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
	public double getFinAidPercent() {
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
	public double getAdmittedPercent() {
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
	public double getEnrolledPercent() {
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
	public String[] getEmphases() {
		return emphases;
	}
	/**
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String[] emphases) {
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
