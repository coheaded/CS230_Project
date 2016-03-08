/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class User extends Person{
	
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private Boolean activated;
	private String type;
	private Map<String,University> savedUnis;
	
	/**
	 * 
	 */
	public User(String fName, String lName, String uName, String pWord, Boolean activated, String type, Map<String,University> savedUnis) {
		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pWord = pWord;
		this.activated = activated;
		this.type = type;
		this.savedUnis = savedUnis;
	}
	
	public User() {
		fName = "";
		lName = "";
		uName = "";
		pWord = "";
		activated = true;
		type = "";
		savedUnis = new HashMap<String, University>();
		
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * @return the pWord
	 */
	public String getpWord() {
		return pWord;
	}

	/**
	 * @param pWord the pWord to set
	 */
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

	/**
	 * @return the activated
	 */
	public Boolean getActivated() {
		return activated;
	}

	/**
	 * @return the savedUnis
	 */
	public Map<String, University> getSavedUnis() {
		return savedUnis;
	}

	/**
	 * @param savedUnis the savedUnis to set
	 */
	public void setSavedUnis(Map<String, University> savedUnis) {
		this.savedUnis = savedUnis;
	}
	
	public String getType() {
		return type;
	}

}
