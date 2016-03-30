package controller;

import static org.junit.Assert.*;
import controller.*;

import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void testGetUs() {
		fail("Not yet implemented");
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddUniversityFailsForExistingSchool() {
		controller.addUniversity("Brown", "ndfs", "zald", "control", 2304,23, 498, 499, 1234, 44, 4400, 56, 33, 2, 3, 5);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testAddUniversityEmphasisFailsForExistingEmphasis() {
		controller.addUniversityEmphasis("Brown", "BIOLOGY");
	}

	@Test
	public void testRemoveUniversityEmphasis() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmphases() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsernamesWithSavedSchools() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveSchool() {
		fail("Not yet implemented");
	}

}
