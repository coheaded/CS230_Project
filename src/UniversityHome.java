/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 * A controller that class that contains the appropriate methods to edit, add, or search the Universities
 */
public class UniversityHome {

	/**
	 * variable for the dbcontroller class that contains all of the universities and their info as well as users and their info.
	 */
	private DBController controller;
	/**
	 * default constructor that creates the controller variable with the appropriate info
	 */
	public UniversityHome() {
		controller = new DBController("cottonhead","cottonhead", "acls4");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * method that rates the schools by how well the schools match the given search material (params)
	 * then returns an arraylist with the correct order of the schools based upon how well they match
	 * @param school for the name of the school
	 * @param state for the state of the school
	 * @param location for the location of the school eg. RURAL, URBAN
	 * @param control for the control of the school eg. PUBLIC, PRIVATE
	 * @param popL for the low end of the desired student population
	 * @param popH for the high end of the desired student population
	 * @param perFemL for the low end of the desired percentage of school that is female
	 * @param perFemH for the high end of the desired percentage of school that is female
	 * @param SATVerbL for the low end of the desired SAT Verbal scores that are accepted
	 * @param SATVerbH for the high end of the desired SAT Verbal scores that are accepted
	 * @param SATMathL for the low end of the desired SAT Math scores that are accepted
	 * @param SATMathH for the high end of the desired SAT Math scores that are accepted
	 * @param expensesL for the low end of the desired expenses of a school for one year
	 * @param expensesH for the high end of the desired expenses of a school for one year
	 * @param finAidL for the low end of the desired percent financial aid the school gives
	 * @param finAidH for the high end of the desired percent financial aid the school gives
	 * @param numAppsL for the low end of the desired number of applicants
	 * @param numAppsH for the high end of the desired number of applicants
	 * @param perAdmL for the low end of the desired percent of applicants admitted
	 * @param perAdmH for the high end of the desired percent of applicants admitted
	 * @param perEnrollL for the low end of the desired percent of admitted that enroll
	 * @param perEnrollH for the high end of the desired percent of admitted that enroll
	 * @param acadScaleL for the low end of the rating of the schools academics (1-5)
	 * @param acadScaleh for the high end of the rating of the schools academics (1-5)
	 * @param socialScaleL for the low end of the rating of the schools social life (1-5)
	 * @param socialScaleH for the high end of the rating of the schools social life (1-5)
	 * @param qualLifeL for the low end of the rating of the schools quality of life (1-5)
	 * @param qualLifeH for the high end of the rating of the schools quality of life (1-5)
	 * @return an ArrayList<University> containing all the universities in their correct order
	 */
	  public  ArrayList<University> search(String school, String state, String location, String control, 
			  int popL, int popH, double perFemL, double perFemH, double SATVerbL, double SATVerbH,
			  double SATMathL, double SATMathH, double expensesL, double expensesH,
			  double finAidL, double finAidH, int numAppsL, int numAppsH, double perAdmL, double perAdmH,
			  double perEnrollL, double perEnrollH, int acadScaleL, int acadScaleH, int socialScaleL, 
			  int socialScaleH, int qualLifeScaleL, int qualLifeScaleH){
		  PriorityQueue<University> matches = controller.getUs();
		  for(University u: matches){
			  if(u.getName().equalsIgnoreCase(school))
				  u.addToMatchStrength(10);
			  else if(u.getName().contains(school))
				  u.addToMatchStrength(5);
			  if(u.getState().equalsIgnoreCase(state))
				  u.addToMatchStrength(3);
			  if(u.getLocation().equalsIgnoreCase(location))
				  u.addToMatchStrength(2);
			  if(u.getControl().equalsIgnoreCase(control))
				  u.addToMatchStrength(3);
			  if(u.getStudentPop()>=popL && u.getStudentPop()<=popH)
				  u.addToMatchStrength(1);
			  if(u.getFemPercent()>=perFemL && u.getFemPercent()<=perFemH)
				  u.addToMatchStrength(1);
			  if(u.getSatVerbal()>=SATVerbL && u.getSatVerbal()<=SATVerbH)
				  u.addToMatchStrength(1);
			  if(u.getSatMath()>=SATMathL && u.getSatMath()<=SATMathH)
				  u.addToMatchStrength(1);
			  if(u.getExpenses()>=expensesL && u.getExpenses()<=expensesH)
				  u.addToMatchStrength(1);
			  if(u.getFinAidPercent()>=finAidL && u.getFinAidPercent()<=finAidH)
				  u.addToMatchStrength(1);
			  if(u.getNumApps()>=numAppsL && u.getNumApps()<=numAppsH)
				  u.addToMatchStrength(1);
			  if(u.getAdmittedPercent()>=perAdmL && u.getAdmittedPercent()<=perAdmH)
				  u.addToMatchStrength(1);
			  if(u.getEnrolledPercent()>=perEnrollL && u.getEnrolledPercent()<=perEnrollH)
				  u.addToMatchStrength(1);
			  if(u.getAcademicScale()>=acadScaleL && u.getAcademicScale()<=acadScaleH)
				  u.addToMatchStrength(1);
			  if(u.getSocialScale()>=socialScaleL && u.getSocialScale()<=socialScaleH)
				  u.addToMatchStrength(1);
			  if(u.getQualityOfLife()>=qualLifeScaleL && u.getQualityOfLife()<=qualLifeScaleH)
				  u.addToMatchStrength(1);
		  }
		  PriorityQueue<University> matches2 = new PriorityQueue<University>();
		  ArrayList<University> matches3 = new ArrayList<University>();
		  University univ;
		  while(!matches.isEmpty()){
			  univ = matches.poll();
			  matches2.add(univ);
			  matches3.add(univ);
		  }
		  return matches3;
		  
	  }
	  
	  /**
	   * a method that returns the schools that most closely match the given school
	   * @param the university for which you wish to fine related schools
	   * @return an ArrayList<University> containing the ordered list of the schools that match the given school, from best to worst match
	   */
	  public ArrayList<University> relatedSchool(University uni)
	  {
		  ArrayList<University> out = search("n/a", uni.getState(), uni.getLocation(), uni.getControl(),
				  (int)(uni.getStudentPop()*.85), (int)(uni.getStudentPop()*1.15), uni.getFemPercent()*.85, uni.getFemPercent()*1.15,
				  uni.getSatVerbal()*.85, uni.getSatVerbal()*1.15, uni.getSatMath()*.85, uni.getSatMath()*1.15,
				  uni.getExpenses()*.85, uni.getExpenses()*1.15, uni.getFinAidPercent()*.85, uni.getFinAidPercent()*1.15,
				  (int)(uni.getNumApps()*.85), (int)(uni.getNumApps()*1.15), uni.getAdmittedPercent()*.85, uni.getAdmittedPercent()*1.15,
				  uni.getEnrolledPercent()*.85, uni.getEnrolledPercent()*1.15, (int)(uni.getAcademicScale()*.85), (int)(uni.getAcademicScale()*1.15),
				  (int)(uni.getSocialScale()*.85), (int)(uni.getSocialScale()*1.15), (int)(uni.getQualityOfLife()*.85), (int)(uni.getQualityOfLife()*1.15));
		  return out;
	  }
	  
}
