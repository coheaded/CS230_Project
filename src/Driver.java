
public class Driver {
	
	//AdminUI adminUI;
	private static UserUI userUI;
	
	public static void main(String[] args){
		
		//Testing LoginUI
		
		LoginUI login = new LoginUI();
		
		if(login.login("juser", "user")=='a'){
			//adminUI = new AdminUI();
			System.out.println("Created new AdminUI");
		}
		
		else if(login.login("juser", "user")=='u'){
			userUI = new UserUI("juser");
			System.out.println("Created new UserUI");
		}
		
		else{
			System.out.println("Invalid username or password");
		}
		
		login = new LoginUI();
		
		if(login.login("nadmin", "admin")=='a'){
			//adminUI = new AdminUI();
			System.out.println("Created new AdminUI");
		}
		
		else if(login.login("nadmin", "admin")=='u'){
			userUI = new UserUI("nadmin");
			System.out.println("Created new UserUI");
		}
		
		else{
			System.out.println("Invalid username or password");
		}

		login = new LoginUI();
		
		if(login.login("junk", "morJunk")=='a'){
			//adminUI = new AdminUI();
			System.out.println("Created new AdminUI");
		}
		
		else if(login.login("junk", "morJunk")=='u'){
			userUI = new UserUI("junk");
			System.out.println("Created new UserUI");
		}
		
		else{
			System.out.println("Invalid username or password");
		}
		//Testing Save School
		
		userUI.saveSchool("Brown");
		userUI.saveSchool("Villanova");
		
		//Testing ViewSavedSchools
		
		String[] array1 = userUI.viewSavedSchools();
		for(int i = 0;i<array1.length;i++){
			if(array1[i]!=null)
				System.out.println(array1[i]);
			
		}
		
		
	}
}
