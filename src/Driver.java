import java.util.*;
public class Driver {

	//AdminUI adminUI;
	private static UserUI userUI;
	private static AdminUI adminUI;
	public static void main(String[] args){

		//Testing LoginUI

		LoginUI login = new LoginUI();

		if(login.login("juser", "user")=='a'){
			adminUI = new AdminUI("juser");
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
			adminUI = new AdminUI("nadmin");
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
			adminUI = new AdminUI("junk");
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
		userUI.saveSchool("Seton Hall");

		//Testing ViewSavedSchools

		String[] array1 = userUI.viewSavedSchools();
		for(int i = 0;i<array1.length;i++){
			if(array1[i]!=null)
				System.out.println(array1[i]);
		}

		//Testing RemoveSchool

		int check = userUI.removeSchool("Brown");
		if(check>0){
			System.out.println("School removed");
		}
		array1 = userUI.viewSavedSchools();
		for(int i = 0;i<array1.length;i++){
			if(array1[i]!=null)
				System.out.println(array1[i]);
		}

		//Testing editProfile

		userUI.editProfile("John", "theUser", "user");
		System.out.println(login.getUser("juser").toString());

		//Testing displaySchool

		String[] schoolInfo = userUI.displaySchool("Barnard");
		String school = schoolInfo[0];
		String state = schoolInfo[1];
		String location = schoolInfo[2];
		String control = schoolInfo[3];
		String numStudents = schoolInfo[4];
		String percentFemale = schoolInfo[5];
		String satVerbal = schoolInfo[6];
		String satMath = schoolInfo[7];
		String expenses = schoolInfo[8];
		String percentFinanAid = schoolInfo[9];
		String numApplicants = schoolInfo[10];
		String percentAdmitted = schoolInfo[11];
		String percentEnrolled = schoolInfo[12];
		String academicScale = schoolInfo[13];
		String socialScale = schoolInfo[14];
		String qualityOfLife = schoolInfo[15];

		System.out.println("School: " + school +", State: " + state + ", Location: " + location +
				", Control: " + control + ", NumStudents: " + numStudents + ", Percent Female: " + percentFemale +
				", SAT Verbal: " + satVerbal + ", SAT Math: " + satMath);
		System.out.println("Expenses: " + expenses + ", Percent Financial Aid: " + percentFinanAid
				+ ", Number of Applicants: " + numApplicants + ", Percent Admitted: " + percentAdmitted +
				", Percent Enrolled: " +percentEnrolled);
		System.out.println("Academic Scale(1-5): " + academicScale + ", Social Scale(1-5): " 
				+ socialScale + ", Quality of Life(1-5): " + qualityOfLife);
		System.out.print("Emphases: ");
		for(int i = 16; i<schoolInfo.length; i++){
			if(schoolInfo[i]!=null){
				System.out.print(schoolInfo[i]+ ", ");
			}
		}
		System.out.println();
		System.out.println();

		// Testing adding user, it works just dont wanna have to add new user everytime
		//adminUI.addPerson("Logan", "Schramel", "lschramel", "Logan", 'u');
		//System.out.println(login.getUser("lschramel").toString());

		//Testing editing user
		adminUI.editPerson("Logan", "Schramel", "lschramel", "Logan", 'u', 'Y');
		System.out.println(login.getUser("lschramel").toString());
		System.out.println();

		//Testing add university
		/*String[] emphases = {"Liberal Arts","Computer Science"};
		adminUI.addUniversity("BlarghUS", "Minnesota", "Collegeville", "PRIVATE", 2000, 0, 600, 790, 50000, 60, 9000, 70, 20, 3, 4, 5, emphases);
		String[] schoolInfo1 = userUI.displaySchool("BlarghUS");
		String school1 = schoolInfo1[0];
		String state1 = schoolInfo1[1];
		String location1 = schoolInfo1[2];
		String control1 = schoolInfo1[3];
		String numStudents1 = schoolInfo1[4];
		String percentFemale1 = schoolInfo1[5];
		String satVerbal1 = schoolInfo1[6];
		String satMath1 = schoolInfo1[7];
		String expenses1 = schoolInfo1[8];
		String percentFinanAid1 = schoolInfo1[9];
		String numApplicants1 = schoolInfo1[10];
		String percentAdmitted1 = schoolInfo1[11];
		String percentEnrolled1 = schoolInfo1[12];
		String academicScale1 = schoolInfo1[13];
		String socialScale1 = schoolInfo1[14];
		String qualityOfLife1 = schoolInfo1[15];

		System.out.println("School: " + school1 +", State: " + state1 + ", Location: " + location1 +
				", Control: " + control1 + ", NumStudents: " + numStudents1 + ", Percent Female: " + percentFemale1 +
				", SAT Verbal: " + satVerbal1 + ", SAT Math: " + satMath1);
		System.out.println("Expenses: " + expenses1 + ", Percent Financial Aid: " + percentFinanAid1
				+ ", Number of Applicants: " + numApplicants1 + ", Percent Admitted: " + percentAdmitted1 +
				", Percent Enrolled: " +percentEnrolled1);
		System.out.println("Academic Scale(1-5): " + academicScale1 + ", Social Scale(1-5): " 
				+ socialScale1 + ", Quality of Life(1-5): " + qualityOfLife1);
		System.out.print("Emphases: ");
		for(int i = 16; i<schoolInfo1.length; i++){
			if(schoolInfo1[i]!=null){
				System.out.print(schoolInfo1[i]+ ", ");
			}
		}*/

		//Testing search method
		PriorityQueue<University> matches = userUI.search("BARNARD", "MINNESOTA", "RURAL", "PRIVATE", 2000, 5000, 25, 50, 300, 600, 500, 750, 15000, 20000, 35, 50, 6000, 15000, 
				15, 25, 5, 35, 1, 3, 4, 5, 3, 5);

		Iterator<University> iter = matches.iterator();
		for(int i = 0; i < 10; i++){
			System.out.println(iter.next().toString());
		}

		System.out.println();
		System.out.println();

		matches = userUI.search("n/a","NEW YORK", "n/a", "PRIVATE", 2000,10000, 25,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		iter = matches.iterator();
		for(int i = 0; i < 10; i++){
			System.out.println(iter.next().toString());
		}

		System.out.println();
		System.out.println();

		//Testing edit university

		String[] emphases1 = {"Yo Mama", "Parties"};
		adminUI.editUniversity("BlarghU", "NEW YORK", "RURAL", "PUBLIC", 5000, 53, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, emphases1);
		String[] schoolInfo2 = adminUI.displaySchool("BlarghU");
		String school2 = schoolInfo2[0];
		String state2 = schoolInfo2[1];
		String location2 = schoolInfo2[2];
		String control2 = schoolInfo2[3];
		String numStudents2 = schoolInfo2[4];
		String percentFemale2 = schoolInfo2[5];
		String satVerbal2 = schoolInfo2[6];
		String satMath2 = schoolInfo2[7];
		String expenses2 = schoolInfo2[8];
		String percentFinanAid2 = schoolInfo2[9];
		String numApplicants2 = schoolInfo2[10];
		String percentAdmitted2 = schoolInfo2[11];
		String percentEnrolled2 = schoolInfo2[12];
		String academicScale2 = schoolInfo2[13];
		String socialScale2 = schoolInfo2[14];
		String qualityOfLife2 = schoolInfo2[15];

		System.out.println("School: " + school2 +", State: " + state2 + ", Location: " + location2 +
				", Control: " + control2 + ", NumStudents: " + numStudents2 + ", Percent Female: " + percentFemale2 +
				", SAT Verbal: " + satVerbal2 + ", SAT Math: " + satMath2);
		System.out.println("Expenses: " + expenses2 + ", Percent Financial Aid: " + percentFinanAid2
				+ ", Number of Applicants: " + numApplicants2 + ", Percent Admitted: " + percentAdmitted2 +
				", Percent Enrolled: " +percentEnrolled2);
		System.out.println("Academic Scale(1-5): " + academicScale2 + ", Social Scale(1-5): " 
				+ socialScale2 + ", Quality of Life(1-5): " + qualityOfLife2);
		System.out.print("Emphases: ");
		for(int i = 16; i<schoolInfo2.length; i++){
			if(schoolInfo2[i]!=null){
				System.out.print(schoolInfo2[i]+ ", ");
			}
		}

		System.out.println("\n*****************************view all users*****************************\n");
		String [][] peeps = adminUI.viewPeople();
		for(int i = 0; i < peeps.length; i++) {
			System.out.println("First Name: " + peeps[i][0] + ", Last Name: " + peeps[i][1] + ", User Name: " + peeps[i][2] +
					", Password: " + peeps[i][3] + ", Type: " + peeps[i][4] + ", Activate: " + peeps[i][5]);

		}


		System.out.println("\n*****************************view all universities*****************************\n");
		String[][] stuff = adminUI.viewSchools();
		for(int i  = 0; i < stuff.length; i++){
			String school3 = stuff[i][0];
			String state3 = stuff[i][1];
			String location3 = stuff[i][2];
			String control3 = stuff[i][3];
			String numStudents3 = stuff[i][4];
			String percentFemale3 = stuff[i][5];
			String satVerbal3 = stuff[i][6];
			String satMath3 = stuff[i][7];
			String expenses3 = stuff[i][8];
			String percentFinanAid3 = stuff[i][9];
			String numApplicants3 = stuff[i][10];
			String percentAdmitted3 = stuff[i][11];
			String percentEnrolled3 = stuff[i][12];
			String academicScale3 = stuff[i][13];
			String socialScale3 = stuff[i][14];
			String qualityOfLife3 = stuff[i][15];
			if(school3 != null){
				System.out.println("School: " + school3 +", State: " + state3 + ", Location: " + location3 +
						", Control: " + control3 + ", NumStudents: " + numStudents3 + ", Percent Female: " + percentFemale3 +
						", SAT Verbal: " + satVerbal3 + ", SAT Math: " + satMath3);
				System.out.println("Expenses: " + expenses3 + ", Percent Financial Aid: " + percentFinanAid3
						+ ", Number of Applicants: " + numApplicants3 + ", Percent Admitted: " + percentAdmitted3 +
						", Percent Enrolled: " +percentEnrolled3);
				System.out.println("Academic Scale(1-5): " + academicScale3 + ", Social Scale(1-5): " 
						+ socialScale3 + ", Quality of Life(1-5): " + qualityOfLife3);
				System.out.print("Emphases: ");
				for(int j = 16; j<stuff[i].length; j++){
					if(stuff[i][j]!=null){
						System.out.print(stuff[i][j]+ ", ");
					}//end if
				}//end for
			}//end if
		}//end for
		
		System.out.println("\n*****************************view related universities*****************************\n");
		PriorityQueue<University> listAllSchools = adminUI.getAllUs();
		University test = listAllSchools.poll();
		System.out.println("THE SCHOOL USED TO FIND RELATED SCHOOLS");
		System.out.println(test.toString() +"\n");
		System.out.println(" The Related Schools \n---------------------");
		PriorityQueue<University> related = userUI.relatedSchools(test);
		Iterator<University> iter2 = related.iterator();
		iter2.next();
		for(int i = 0; i < 5; i++){
			System.out.println(iter2.next().toString());
		}//end for
		
		System.out.println("\n*****************************view*****************************\n");
	}//end main
	
}

