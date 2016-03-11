import java.util.Map;

/**
 * 
 */

/**
 * @author smcarik
 *
 */
public class Admin extends Person {

	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private String activated;
	private String type;
	
	/**
	 * @param fName
	 * @param lName
	 * @param uName
	 * @param pWord
	 * @param activated
	 * @param type
	 */
	public Admin(String fName, String lName, String uName, String pWord, String activated, String type) {
		super(fName, lName, uName, pWord, activated, type);
		// TODO Auto-generated constructor stub
	}
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
	public String getActivated() {
		// TODO Auto-generated method stub
		return super.getActivated();
	}

	/* (non-Javadoc)
	 * @see Person#getType()
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	/**
	 * @param activated the activated to set
	 */
	public void setActivated() {
		super.setActivated();
	}
	
	/**
	 * @param type the type to set
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
