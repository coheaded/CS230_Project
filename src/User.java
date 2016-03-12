/**
 * 
 */
import java.util.*;
/**
 * This class defines the attributes associated with and creates an instance of a User for the CMC System
 * @author smcarik, Adam Noack, Curtis Noecker, Logan Schramel
 * @version March 11, 2016
 */
public class User extends Person{
	/**
	 * The first name of this Admin
	 */
	private String fName;
	/**
	 * The last name of this Admin
	 */
	private String lName;
	/**
	 * The username of this Admin
	 */
	private String uName;
	/**
	 * The password for this Admin
	 */
	private String pWord;
	/**
	 * The activation status of this Admin
	 */
	private char activated;
	/**
	 * The type of this Person 
	 */
	private char type;
	/**
	 * The Universities that this student has saved
	 */
	private HashMap<String,University> savedUnis;
	
	/**
	 * Creates a new Admin with specified parameters
	 * @param fName the first name of this Admin
	 * @param lName the last name of this Admin
	 * @param uName the username of this Admin
	 * @param pWord the passwrod for this Admin
	 * @param activated the activation status for this Admin
	 * @param type the type of this Person
	 * @param savedUnis a map containing this User's saved Universities
	 */
	public User(String fName, String lName, String uName, String pWord, char activated, char type, HashMap<String,University> savedUnis) {
		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pWord = pWord;
		this.activated = activated;
		this.type = type;
		this.savedUnis = savedUnis;
	}
	/**
	 * Creates a new, active User with blank attributes
	 */
	public User() {
		fName = "";
		lName = "";
		uName = "";
		pWord = "";
		activated = 'y';
		type = '\u0000';
		savedUnis = new HashMap<String, University>();	
	}

	/**
	 * Returns first name of this User
	 * @return the fName of this User
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Sets this User's first name to fName
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Returns last name of this User
	 * @return the lName of this User
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * Sets this User's last name to the parameter
	 * @param lName the last name to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * Returns the username of this User
	 * @return the uName of this User
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * Returns the password of this User
	 * @return the pWord of this User
	 */
	public String getpWord() {
		return pWord;
	}

	/**
	 * Sets the password of this User to pWord
	 * @param pWord the password to set for this User
	 */
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

	/**
	 * Returns the activation status of this User
	 * @return the activation status of this User
	 */
	public char getActivated() {
		return activated;
	}

	/**
	 * Returns a map with this User's saved schools 
	 * @return the savedUnis of this User
	 */
	public HashMap<String, University> getSavedUnis() {
		return savedUnis;
	}

	/**
	 * Adds the specified University to the savedUnis map
	 * @param uni the Univeristy to add to the savedUnis map
	 */
	public void saveUni(University uni) {
		if(!savedUnis.containsKey(uni))
			this.savedUnis.put(uni.getName(), uni);
		else
			System.out.println("Uni already saved!");
	}
	
	/**
	 * Removes the University with the specified name from this User's savedUnis map
	 * @param uni the name of the University to remove from this User's savedUnis map
	 */
	public void removeUni(String uni){
		savedUnis.remove(uni);
	}
	/**
	 * Returns the type of this User
	 * @return type the String representation of this User's type
	 */
	public char getType() {
		return type;
	}
	
	/**
	 * Toggles this User's activation status
	 */
	public void setActivated(){
		super.setActivated();
	}
	
	/**
	 * Converts this User to an Admin
	 */
	public void setType(){
		super.setType();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pWord=" + pWord + ", activated="
				+ activated + ", type=" + type + ", savedUnis=" + savedUnis + "]";
	}
	
}
