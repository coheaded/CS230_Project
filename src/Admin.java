import java.util.*;
/**
 * This class defines the attributes associated with and creates an instance of an Admin for the CMC System
 * @author smcarik, Adam Noack, Curtis Noecker, Logan Schramel
 * @version March 11, 2016
 */
public class Admin extends Person {
	
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
	 * Creates a new Admin with specified parameters
	 * @param fName the first name of this Admin
	 * @param lName the last name of this Admin
	 * @param uName the username of this Admin
	 * @param pWord the passwrod for this Admin
	 * @param activated the activation status for this Admin
	 * @param type the type of this Person
	 */
	public Admin(String fName, String lName, String uName, String pWord, char activated, char type) {
		super(fName, lName, uName, pWord, activated, type);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Creates a new, active Admin with blank attributes
	 */
	public Admin(){
		super();
	}

	/* (non-Javadoc)
	 * @see Person#getfName()
	 */
	@Override
	public String getfName() {
		// TODO Auto-generated method stub
		return super.getfName();
	}

	/* (non-Javadoc)
	 * @see Person#setfName(java.lang.String)
	 */
	@Override
	public void setfName(String fName) {
		// TODO Auto-generated method stub
		super.setfName(fName);
	}

	/* (non-Javadoc)
	 * @see Person#getlName()
	 */
	@Override
	public String getlName() {
		// TODO Auto-generated method stub
		return super.getlName();
	}

	/* (non-Javadoc)
	 * @see Person#setlName(java.lang.String)
	 */
	@Override
	public void setlName(String lName) {
		// TODO Auto-generated method stub
		super.setlName(lName);
	}

	/* (non-Javadoc)
	 * @see Person#getuName()
	 */
	@Override
	public String getuName() {
		// TODO Auto-generated method stub
		return super.getuName();
	}

	/* (non-Javadoc)
	 * @see Person#getpWord()
	 */
	@Override
	public String getpWord() {
		// TODO Auto-generated method stub
		return super.getpWord();
	}

	/* (non-Javadoc)
	 * @see Person#setpWord(java.lang.String)
	 */
	@Override
	public void setpWord(String pWord) {
		// TODO Auto-generated method stub
		super.setpWord(pWord);
	}

	/* (non-Javadoc)
	 * @see Person#getActivated()
	 */
	@Override
	public char getActivated() {
		// TODO Auto-generated method stub
		return super.getActivated();
	}

	/* (non-Javadoc)
	 * @see Person#getType()
	 */
	@Override
	public char getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	/**
	 * Toggles the activation status for this Admin
	 */
	public void setActivated() {
		super.setActivated();
	}
	
	/**
	 * Converts this Admin to a User
	 */
	public void setType() {
		super.setType();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pWord=" + pWord + ", activated="
				+ activated + ", type=" + type + "]";
	}

}
