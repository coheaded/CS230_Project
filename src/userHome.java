/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class userHome {
	
	private User user;
	/**
	 * 
	 */
	public userHome(User user) {
		this.user = user;
	}
	
	public Map<String,University> viewSchools(User user)
	{
		return user.getSavedUnis();
	}
	
	public void getInfo(User user){
		user.toString();
	}
	
	public void removeUni(String uni){
		user.removeUni(uni);
	}
	
	public void saveUni(University uni){
		user.saveUni(uni);
	}
	
	public void editProfile(String fname, String lname, String pWord) {
		user.setfName(fname);
		user.setlName(lname);
		user.setpWord(pWord);
	}
	
}