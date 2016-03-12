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
	}
	
	public void addPerson(String fname, String lname, String uname, String pnord, String type)
	{
		if(type.equalsIgnoreCase("a"))
		{
			if(!admins.containsKey(uname) || !users.containsKey(uname))
			{
				Admin ad = new Admin(fname, lname, uname, pnord, "y", type);
				admins.put(uname, ad);
			}
			else
				System.out.println("username already taken");
		}
		else if(type.equalsIgnoreCase("u"))
		{
			if(!admins.containsKey(uname) || !users.containsKey(uname))
			{
				User us = new User(fname, lname, uname, pnord, "y", type, null);
				users.put(uname, us);
			}
			else
				System.out.println("Username already taken");
		}
		else
			System.out.println("not appropriate type, change type to a -admin or u -user");
	}
	
	public void changeActivated(Person person)
	{
		person.setActivated();
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
	
	public void editPerson(String fname, String lname, String uname, String pword, String type, String status)
	{
		if(users.containsKey(uname))
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
		}
	}
	
	public void addUniversity(String school, String state, String location, String control, int studPop, 
			int percFem, int satVerb, int satMath, int expenses,int percFinAid, int numApps, int percAdmitted, 
			int percEnrolled, int acadScale, int qualityOfLife, ArrayList<String> emphases)
	{
		controller.addUniversity(school, state, location, control, studPop, 
				percFem, satVerb, satMath, expenses, percFinAid, numApps, percAdmitted, 
				 percEnrolled, acadScale, qualityOfLife, emphases);
	}
}