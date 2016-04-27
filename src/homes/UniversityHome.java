package homes;
/**
 * 
 */
import java.util.*;

import controller.DBController;
import people.University;
/**
 * @author smcarik
 * @version 03/15/2016
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
	 * @throws IllegalArgumentException if popL is below -1
	 * @throws IllegalArgumentException if popH is below -1
	 * @throws IllegalArgumentException if popL is higher than popH
	 * @throws IllegalArgumentException if perFemL is below -1 or above 100
	 * @throws IllegalArgumentException if perFemH is below -1 or above 100
	 * @throws IllegalArgumentException if perFemL is higher than perFemH
	 * @throws IllegalArgumentException if SATVerbL is below -1 or above 800
	 * @throws IllegalArgumentException if SATVerbH is below -1 or above 800
	 * @throws IllegalArgumentException if SATVerbL is higher than SATVerbH
	 * @throws IllegalArgumentException if SATMathL is below -1 or above 800
	 * @throws IllegalArgumentException if SATMathH is below -1 or above 800
	 * @throws IllegalArgumentException if SATMathL is higher than SATMathH
	 * @throws IllegalArgumentException if expensesL or expensesH are below 0
	 * @throws IllegalArgumentException if expensesL is higher than expensesH
	 * @throws IllegalArgumentException if finAidL is below -1 or above 100
	 * @throws IllegalArgumentException if findAidH is below -1 or above 100
	 * @throws IllegalArgumentException if finAidL is higher than finAidH
	 * @throws IllegalArgumentException if numAppsL or numAppsH are below 0
	 * @throws IllegalArgumentException if numAppsL is higher than numAppsH
	 * @throws IllegalArgumentException if perAdmL is below -1 or above 100
	 * @throws IllegalArgumentException if perAdmH is below -1 or above 100
	 * @throws IllegalArgumentException if perAdmL is higher than perAdmH
	 * @throws IllegalArgumentException if perEnrollL is below -1 or above 100
	 * @throws IllegalArgumentException if perEnrollH is below -1 or above 100
	 * @throws IllegalArgumentException if perEnrollL is higher than perEnrollH
	 * @throws IllegalArgumentException if acadScaleL is below -1 or above 5
	 * @throws IllegalArgumentException if acadScaleH is below -1 or above 5
	 * @throws IllegalArgumentException if acadScaleL is higher than acadScaleH
	 * @throws IllegalArgumentException if socialScaleL is below -1 or above 5
	 * @throws IllegalArgumentException if socialScaleH is below -1 or above 5
	 * @throws IllegalArgumentException if socialScaleL is higher than socialScaleH
	 * @throws IllegalArgumentException if qualLifeScaleL is below -1 or above 5
	 * @throws IllegalArgumentException if qualLifeScaleH is below -1 or above 5
	 * @throws IllegalArgumentException if qualLifeScaleL is higher than qualLifeScaleH
	 */
	  public  ArrayList<University> search(String school, String state, String location, String control, 
			  int popL, int popH, double perFemL, double perFemH, double SATVerbL, double SATVerbH,
			  double SATMathL, double SATMathH, double expensesL, double expensesH,
			  double finAidL, double finAidH, int numAppsL, int numAppsH, double perAdmL, double perAdmH,
			  double perEnrollL, double perEnrollH, int acadScaleL, int acadScaleH, int socialScaleL, 
			  int socialScaleH, int qualLifeScaleL, int qualLifeScaleH){
		  ArrayList<University> matches = controller.getUs();
		  if(popL <-1)
			  throw new IllegalArgumentException("Population needs to be greater than 0");
	  	  if (popH <-1)
	  		  throw new IllegalArgumentException("Population needs to be greater than 0");
	  	  if(popL>popH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
	  	  if (perFemL < -1 || perFemL > 100.0)
			  throw new IllegalArgumentException("Percent female needs to be between 0 and 100");
		  if (perFemH < -1 || perFemH > 100.0)
			  throw new IllegalArgumentException("Percent female needs to be between 0 and 100");
		  if(perFemL>perFemH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if (SATVerbL <-1 || SATVerbL >800)
			  throw new IllegalArgumentException("SAT Verbal needs to be between 0 and 800");
		  if (SATVerbH <-1 || SATVerbH >800)
			  throw new IllegalArgumentException("SAT Verbal needs to be between 0 and 800");
		  if(SATVerbL>SATVerbH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if (SATMathL <-1 || SATMathL >800)
			  throw new IllegalArgumentException("SAT Math needs to be between 0 and 800");
		  if (SATMathH <-1 || SATMathH >800)
			  throw new IllegalArgumentException("SAT Math needs to be between 0 and 800");
		  if(SATMathL>SATMathH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if (expensesL <-1 || expensesH <0)
			  throw new IllegalArgumentException("Expenses cannot be below 0");
		  if(expensesL>expensesH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(finAidL <-1 || finAidL > 100)
			  throw new IllegalArgumentException("percent financial aid needs to be between 0 and 100");
		  if(finAidH <-1 || finAidH > 100)
			  throw new IllegalArgumentException("percent financial aid needs to be between 0 and 100");
		  if(finAidL>finAidH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(numAppsL<-1 || numAppsH<0)
			  throw new IllegalArgumentException("Number of applicants cannot be below 0");
		  if(numAppsL>numAppsH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(perAdmL<-1||perAdmL>100)
			  throw new IllegalArgumentException("percent admitted needs to be between 0 and 100");
		  if(perAdmH<-1||perAdmH>100)
			  throw new IllegalArgumentException("percent admitted needs to be between 0 and 100");
		  if(perAdmL>perAdmH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(perEnrollL<-1||perEnrollL>100)
			  throw new IllegalArgumentException("percent enrolled needs to be between 0 and 100");
		  if(perEnrollH<-1||perEnrollH>100)
			  throw new IllegalArgumentException("percent enrolled needs to be between 0 and 100");
		  if(perEnrollL>perEnrollH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(acadScaleL<-1||acadScaleL>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(acadScaleH<-1||acadScaleH>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(acadScaleL>acadScaleH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(socialScaleL<-1||socialScaleL>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(socialScaleH<-1||socialScaleH>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(socialScaleL>socialScaleH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  if(qualLifeScaleL<-1||qualLifeScaleL>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(qualLifeScaleH<-1||qualLifeScaleH>5)
			  throw new IllegalArgumentException("scale must be between 0 and 5");
		  if(qualLifeScaleL>qualLifeScaleH)
			  throw new IllegalArgumentException("Lower bound is higher than upper bound");
		  for(University u: matches){
			  if(u.getName().equalsIgnoreCase(school))
				  u.addToMatchStrength(10);
			  else if(u.getName().toLowerCase().contains(school.toLowerCase()))
				  u.addToMatchStrength(5);
			  if(u.getState().equalsIgnoreCase(state))
				  u.addToMatchStrength(3);
			  if(u.getLocation().equalsIgnoreCase(location))
				  u.addToMatchStrength(2);
			  if(u.getControl().equalsIgnoreCase(control))
				  u.addToMatchStrength(3);
			  if(u.getStudentPop()>=popL && u.getStudentPop()<=popH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getFemPercent()>=perFemL && u.getFemPercent()<=perFemH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getSatVerbal()>=SATVerbL && u.getSatVerbal()<=SATVerbH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getSatMath()>=SATMathL && u.getSatMath()<=SATMathH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getExpenses()>=expensesL && u.getExpenses()<=expensesH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getFinAidPercent()>=finAidL && u.getFinAidPercent()<=finAidH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getNumApps()>=numAppsL && u.getNumApps()<=numAppsH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getAdmittedPercent()>=perAdmL && u.getAdmittedPercent()<=perAdmH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getEnrolledPercent()>=perEnrollL && u.getEnrolledPercent()<=perEnrollH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getAcademicScale()>=acadScaleL && u.getAcademicScale()<=acadScaleH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getSocialScale()>=socialScaleL && u.getSocialScale()<=socialScaleH){
				  
				  u.addToMatchStrength(1);
			  }
			  if(u.getQualityOfLife()>=qualLifeScaleL && u.getQualityOfLife()<=qualLifeScaleH){
				  
				  u.addToMatchStrength(1);
			  }
		  }

		  /*ArrayList<University> matches2 = new ArrayList<University>();
		  University univ;
		  while(!matches.isEmpty()){
			  univ = matches.poll();
			  matches2.add(univ);
		  }
		  return matches2;*/
		  return matches;
	  }
	  
	  /**
	   * a method that returns the schools that most closely match the given school
	   * @param the university for which you wish to fine related schools
	   * @return an ArrayList<University> containing the ordered list of the schools that match the given school, from best to worst match
	   */
	  public ArrayList<University> relatedSchool(University uni)
	  {	
		  int studpop, numapps, academicscale, socialscale,qualityoflife;
		  double femperc, satverb, satmath, expenses, finaidperc, admittedperc, enrolledperc;
		  if(uni.getStudentPop()== -1)
			  studpop = 0;
		  else
			  studpop = uni.getStudentPop();
		  if(uni.getNumApps() ==-1)
			  numapps = 0;
		  else
			  numapps = uni.getNumApps();
		  if(uni.getAcademicScale()==-1)
			  academicscale = 0;
		  else
			  academicscale = uni.getAcademicScale();
		  if(uni.getSocialScale() == -1)
			  socialscale = 0;
		  else
			  socialscale = uni.getSocialScale();
		  if(uni.getQualityOfLife()==-1)
			  qualityoflife = 0;
		  else
			  qualityoflife = uni.getQualityOfLife();
		  if(uni.getFemPercent() == -1)
			  femperc = 0;
		  else if(uni.getFemPercent()>86)
			  femperc = 86.95652173913043478261;
		  else
			  femperc = uni.getFemPercent();
		  if(uni.getSatVerbal()==-1)
			  satverb = 0;
		  else if(uni.getSatVerbal()>695)
			  satverb = 800/1.15;
		  else
			  satverb = uni.getSatVerbal();
		  if(uni.getSatMath() == -1)
			  satmath = 0;
		  else if(uni.getSatMath() > 695)
			  satmath = 800/1.15;
		  else
			  satmath = uni.getSatMath();
		  if(uni.getExpenses() == -1)
			  expenses = 0;
		  else
			  expenses = uni.getExpenses();
		  if(uni.getFinAidPercent() == -1)
			  finaidperc = 0;
		  else if(uni.getFinAidPercent() > 86)
			  finaidperc = 86.95652173913043478261;
		  else
			  finaidperc = uni.getFinAidPercent();
		  if(uni.getAdmittedPercent() == -1)
			  admittedperc = 0;
		  else if(uni.getAdmittedPercent() > 86)
			  admittedperc = 86.95652173913043478261;
		  else
			  admittedperc = uni.getAdmittedPercent();
		  if(uni.getEnrolledPercent() == -1)
			  enrolledperc = 0;
		  else if(uni.getEnrolledPercent() > 86)
			  enrolledperc = 86.95652173913043478261;
		  else
			  enrolledperc = uni.getEnrolledPercent();
		  
			  
		  ArrayList<University> out = search("n/a", uni.getState(), uni.getLocation(), uni.getControl(),
				  (int)(studpop*.85), (int)(studpop*1.15), femperc*.85, femperc*1.15,
				  satmath*.85, satmath*1.15, satmath*.85, satmath*1.15,
				  expenses*.85, expenses*1.15, finaidperc*.85, finaidperc*1.15,
				  (int)(numapps*.85), (int)(numapps*1.15), admittedperc*.85, admittedperc*1.15,
				  enrolledperc*.85, enrolledperc*1.15, (int)(academicscale*.85), (int)(academicscale*1.15),
				  (int)(socialscale*.85), (int)(socialscale*1.15), (int)(qualityoflife*.85), (int)(qualityoflife*1.15));
		  Collections.sort(out);
		  return out;
	  }
	  
}
