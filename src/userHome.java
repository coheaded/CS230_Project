/**
 * 
 */
import java.util.*;
/**
 * @author smcarik
 *
 */
public class userHome {
	
	
	/**
	 * 
	 */
	public userHome() {
		// TODO Auto-generated constructor stub
	}
	
	public Map<String,University> viewSchools(User user)
	{
		return user.getSavedUnis();
	}
	
	public void getInfo(User user){
		user.toString();
	}
	
	public void removeUni(String uni,User user){
		user.removeUni(uni);
	}
	
	public void saveUni(University uni, User user)
}
