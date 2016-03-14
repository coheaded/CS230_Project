/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class AdminHome {

	private Admin admin;
	private HashMap<String, Person> admins;
	private HashMap<String, Person> users;
	private DBController controller;
	/**
	 * 
	 */
	public AdminHome(Admin admin) {
		// TODO Auto-generated constructor stub
		this.admin = admin;
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	public void addPerson(String fname, String lname, String uname, String pword, char type)
	{
		controller.addUser(fname, lname, uname,  pword, type);
		/**if(Character.toLowerCase(type) =='a')
		{
			if(!admins.containsKey(uname) || !users.containsKey(uname))
			{
				Admin ad = new Admin(fname, lname, uname, pnord, 'y', type);
				admins.put(uname, ad);
			}
			else
				System.out.println("username already taken");
		}
		else if(Character.toLowerCase(type)== 'u')
		{
			if(!admins.containsKey(uname) || !users.containsKey(uname))
			{
				User us = new User(fname, lname, uname, pnord, 'y', type, null);
				users.put(uname, us);
			}
			else
				System.out.println("Username already taken");
		}
		else
			System.out.println("not appropriate type, change type to a -admin or u -user");
			**/
	}
	
	
	public void changeActivated(Person person)
	{
		//person.setActivated();
		controller.editUser(fname, lname, uname, pword, type, status);
	}
	
	public ArrayList<Person> viewPeople()
	{
		ArrayList<Person> peeps = new ArrayList<Person>();
		for(String k:users.keySet())
		{
			peeps.add(users.get(k));
		}
		for(String k:admins.keySet())
		{
			peeps.add(admins.get(k));
		}
		return peeps;
	}
	
	public void editPerson(String fname, String lname, String uname, String pword, char type, char status)
	{
		controller.editUser(fname, lname, uname, pword, type, status);
		/**if(users.containsKey(uname))
		{
			Person us = users.get(uname);
			us.setfName(fname);
			us.setlName(lname);
			us.setpWord(pword);
			us.setType(type);
			us.setActivated(status);
			users.put(uname, us);
		}
		else {
			Person ad = admins.get(uname);
			ad.setfName(fname);
			ad.setlName(lname);
			ad.setpWord(pword);
			ad.setType(type);
			ad.setActivated(status);
			users.put(uname, ad);
		}**/
	}
	
//	public void editPerson(String fname, String lname, String uname, String pword, char type, char status)
//	{
//		controller.editUser(fname, lname, uname, pword, type, status);
//	}
	
	
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			double percFem, double satVerb, double satMath, double expenses, double percFinAid, int numApps, double percAdmitted, 
			double percEnrolled, int acadScale, int socialScale, int qualityOfLife)
	{
		controller.addUniversity(school, state, location, control, studPop, 
				percFem, satVerb, satMath, expenses, percFinAid, numApps, percAdmitted, 
				 percEnrolled, acadScale, socialScale, qualityOfLife);
	}
	
	public void editUniversity(String school, String state, String location, String control, int numberOfStudents, 
			double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, 
			int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale){
		  univDBlib.university_editUniversity(school, state, location, control, numberOfStudents, 
				  percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, 
				  numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	  
}
