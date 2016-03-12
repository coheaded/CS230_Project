/**
 * 
 */

/**
 * @author smcarik
 *
 */
public class UniversityHome {

	private University uni;
	private DBController controller;
	/**
	 * 
	 */
	public UniversityHome(University uni) {
		this.uni = uni;
		controller = new DBController("cottenhead","cottenhead", "acls4");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * possibly dont need this here, i think this gets taken care of in Admin home class
	 */
	public void addUniversity(){
		//Add code here
		//Not sure if we want to accept parameters, then use those to call addUni from dbcontrller
		//or if we have this method accept input from user, then call method from dbcontroller.
		
		//controller.editUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	
	public void editUniversity(){
		//Same predicament as addUniversity
		
		//controller.addUniversity(school, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}

}
