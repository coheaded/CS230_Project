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
	private String activated;
	private String type;
	private HashMap<String,University> savedUnis;
	
	/**
	 * 
	 */
	public User(String fName, String lName, String uName, String pWord, String activated, String type, HashMap<String,University> savedUnis) {
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
		activated = "";
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
	public String getActivated() {
		return activated;
	}

	/**
	 * @return the savedUnis
	 */
	public HashMap<String, University> getSavedUnis() {
		return savedUnis;
	}

	/**
	 * @param savedUnis the savedUnis to set
	 */
	public void saveUni(University uni) {
		if(!savedUnis.containsKey(uni))
			this.savedUnis.put(uni.getName(), uni);
		else
			System.out.println("Uni already saved!");
	}
	
	public void removeUni(String uni){
		savedUnis.remove(uni);
	}
	
	public String getType() {
		return type;
	}
	
	public void setActivated(){
		super.setActivated();
	}
	
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
