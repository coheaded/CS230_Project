/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class Person {
	
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private Boolean activated;
	private Map<String,University> savedUnis;
	
	/**
	 * 
	 */
	public Person(String fName, String lName, String uName, String pWord, Boolean activated, Map<String,University> savedUnis) {
		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pWord = pWord;
		this.activated = activated;
		this.savedUnis = savedUnis;
	}
	
	public Person() {
		fName = "";
		lName = "";
		uName = "";
		pWord = "";
		activated = true;
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
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
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
	 * @param activated the activated to set
	 */
	public void setActivated(Boolean activated) {
		this.activated = activated;
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

}
