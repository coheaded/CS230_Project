import java.util.PriorityQueue;

public class UserUI {
	
	UserHome home;
	User user;
	LoginUI loginUI;
	UniversityHome uniHome;
	
	public UserUI(String username){
		loginUI = new LoginUI();
		user = loginUI.getUser(username);
		home = new UserHome();
		uniHome = new UniversityHome();
	}
	
	public String[] viewSavedSchools(){
		return home.viewSchools(user);
	}
	
	public void saveSchool(String school){
		home.saveSchool(user.getUsername(), school);
	}
	
	public int removeSchool(String school){
		return home.removeSchool(user.getUsername(),school);
	}
	
	public void editProfile(String firstName, String lastName, String pass){
		home.editProfile(firstName, lastName, user.getUsername(), pass, user.getType(), user.getActivated());
	}
	
	public String[] displaySchool(String school){
		String[] array = new String[21];
		String[] otherArray = home.displaySchool(school);
		for(int i = 0; i<otherArray.length; i++){
			array[i] = otherArray[i];
		}
		
		String[] emphases = home.findEmphases(school);
		for(int i = 0; i<emphases.length; i++){
				array[i+16] = emphases[i];
		}
		return array;
	}
	
	public PriorityQueue<University> search(String school, String state, String location, String control, 
			  int popL, int popH, double perFemL, double perFemH, double SATVerbL, double SATVerbH,
			  double SATMathL, double SATMathH, double expensesL, double expensesH,
			  double finAidL, double finAidH, int numAppsL, int numAppsH, double perAdmL, double perAdmH,
			  double perEnrollL, double perEnrollH, int acadScaleL, int acadScaleH, int socialScaleL, 
			  int socialScaleH, int qualLifeScaleL, int qualLifeScaleH){
		return uniHome.search(school, state, location, control, popL, popH, perFemL, perFemH, SATVerbL, SATVerbH, SATMathL, SATMathH, expensesL, expensesH, finAidL, 
				finAidH, numAppsL, numAppsH, perAdmL, perAdmH, perEnrollL, perEnrollH, acadScaleL, acadScaleH, socialScaleL, socialScaleH, qualLifeScaleL, 
				qualLifeScaleH);
	}
	
}
