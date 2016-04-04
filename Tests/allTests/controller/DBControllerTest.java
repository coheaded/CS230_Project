package allTests.controller;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

import controller.DBController;

import org.junit.AfterClass;

public class DBControllerTest {
	
	private DBController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new DBController("cottonhead","cottonhead","acls4");
		
	}


	
	@Test
	public void testLogin() {
		char result;
		char expected = 'n';
		result = controller.login("yay", "Ohno");
		assertTrue("Login should fail for username yay and password Ohno",result==expected);
		result = controller.login("juser", "Ohno");
		assertTrue("Login should fail for username juser and password Ohno",result==expected);
		result = controller.login("yay", "user");
		assertTrue("Login should fail for username yay and password user",result==expected);
		result = controller.login("juser", "Ohno");
		assertTrue("Login should fail for username juser and password Ohno",result==expected);
		result = controller.login("luser", "user");
		assertTrue("Login should fail for username luser and password user",result==expected);
		expected = 'u';
		result = controller.login("lschramel", "Logan");
		assertTrue("Login should successfully login a user for username lschramel and password Logan",result==expected);
		expected = 'a';
		result = controller.login("nadmin", "admin");
		assertTrue("Login should successfully login an admin for username nadmin and password admin",result==expected);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddUserFailsForExistingUser() {
		controller.addUser("Curtis", "Noecker", "luser", "user", 'a');
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddUserFailsWrongType(){
		controller.addUser("Curtis", "Noecker", "sdfh", "aslkdfh", 'e');
	}

	@Test
	public void testAddUser(){
		controller.deleteUser("curtis");
		int test = controller.addUser("Curtis", "Noecker", "curtis", "cnoecker", 'u');
		assertTrue("Testing add user", test==1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddUniversityEmphasisFailsForExistingEmphasis() {
		controller.addUniversityEmphasis("BROWN", "BIOLOGY");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddUniversityEmphasisfailsForSchoolDoesntExist(){
		controller.addUniversityEmphasis("saDF", "FUN");
	}
	
	@Test
	public void testAddUniversityEmphasis(){
		int test = controller.addUniversityEmphasis("ADELPHI", "FUN");
		assertTrue("testing adding emphasis", test==1);
		controller.removeUniversityEmphasis("ADELPHI", "FUN");
	}

	@Test
	public void testRemoveUniversityEmphasis() {
		int test = controller.removeUniversityEmphasis("ADELPHI", "BIOLOGY");
		assertTrue("Testing remove emphasis", test==1);
		controller.addUniversityEmphasis("ADELPHI", "BIOLOGY");
	}
	
	@Test
	public void testRemoveUniversityEmphasisDoesntExist(){
		int test =controller.removeUniversityEmphasis("ADELPHI", "MATH");
		assertTrue("Testing remove emphases doesnt work", test==0);
	}
	
	@Test
	public void testEditUser(){
		int test = controller.editUser("Logan", "Schramel", "luser", "lschramel", 'u', 'Y');
		assertTrue("Testing correct edit user", test==1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testEditUserWrongType(){
	controller.editUser("Logan", "Schramel", "luser", "lschramel", 'j', 'y');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testEditUserWrongActivated(){
	controller.editUser("Logan", "Schramel", "luser", "lschramel", 'u', 't');
	}
	
	@Test
	public void testGetNamesWithEmphases() {
		String[][] test = controller.getNamesWithEmphases();
		String [] expected = {"LIBERAL-ARTS","BIOLOGY","BUSINESS-ADMINISTRATION", "ENGINEERING"};
		String [] expected1 = {"ABILENE CHRISTIAN UNIVERSITY","ADELPHI","ADELPHI", "AMERICAN UNIVERSITY OF BEIRUT"};
		String [] results = new String[4];
		for (int i =0; i <4; i++){
			results[i] = test[i][1];
		}
		String [] results1 = new String[4];
		for (int i =0; i <4; i++){
			results1[i] = test[i][0];
		}
		assertTrue("testing to make sure emphases are correct", Arrays.equals(results,expected));
		assertTrue("Testing to make sure schools are correct", Arrays.equals(results1, expected1));
	}

	@Test
	public void testSaveSchool() {
		controller.removeSchool("juser", "BROWN");
		int test = controller.saveSchool("juser", "BROWN");
		assertTrue("Testing save school", test==1);
	}
	
	@Test
	public void testAlreadySavedSchoolFails(){
		int test = controller.saveSchool("juser", "Seton Hall");
		assertTrue("Testing already saved school", test==-1);
	}

	@Test
	public void testRemoveSchool() {
		int test = controller.removeSchool("juser", "Seton Hall");
		assertTrue("testing remove school", test==1);
		controller.saveSchool("juser", "Seton Hall");
	}
	
	@Test
	public void testGetUsernamesWithSavedSchools() {
		String[][] test = controller.getUsernamesWithSavedSchools();
		String [] expected1 = {"juser","juser","juser", "luser"};
		String [] expected = {"BROWN","Seton Hall","Villanova","Seton Hall"};
		String [] results = new String[4];
		for (int i =0; i <4; i++){
			results[i] = test[i][1];
		}
		String [] results1 = new String[4];
		for (int i =0; i <4; i++){
			results1[i] = test[i][0];
		}
		assertTrue("Testing to make sure usernames are correct", Arrays.equals(results,expected));
		assertTrue("Testing to make sure schools are correct", Arrays.equals(results1, expected1));
	}
}