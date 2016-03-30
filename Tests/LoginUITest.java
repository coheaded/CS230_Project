import static org.junit.Assert.*;
import uis.*;
import people.*;
import homes.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author a1noack
 *
 */
public class LoginUITest {
	private LoginUI lui;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		lui = new LoginUI();
	}

	/**
	 * Test method for {@link uis.LoginUI#login(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testLogin() {
		assertTrue("Type of user is incorrect.", lui.login("juser", "user")=='u');
	}

	/**
	 * Test method for {@link uis.LoginUI#getUser(java.lang.String)}.
	 */
	@Test
	public void testGetUser() {
		User u = lui.getUser("juser");
		assertTrue("firstname", u.getfName().equals("John"));
		assertTrue("lastname", u.getlName().equals("theUser"));
		assertTrue("username", u.getuName().equals("juser"));
		
		assertTrue("type", u.getType()=='u');
		assertTrue("activated", u.getActivated()=='y');
	}

	/**
	 * Test method for {@link uis.LoginUI#getAdmin(java.lang.String)}.
	 */
	@Test
	public void testGetAdmin() {
		fail("Not yet implemented");
	}

}
