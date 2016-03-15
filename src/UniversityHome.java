/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class UniversityHome {


	private DBController controller;
	/**
	 * 
	 */
	public UniversityHome() {
		controller = new DBController("cottonhead","cottonhead", "acls4");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * possibly dont need this here, i think this gets taken care of in Admin home class
	 */
	public void addUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  controller.addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		  
	  }
	  
	  public void editUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  controller.editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	  }
	  
	  public PriorityQueue<University> search(String school, String state, String location, String control, 
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
		  University univ;
		  while(!matches.isEmpty()){
			  univ = matches.poll();
			  matches2.add(univ);
		  }
		  return matches2;
		  
	  }

}
