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
		assertTrue("Error on user branch", lui.login("juser", "user")=='u');
		assertTrue("Error on admin branch", lui.login("nadmin", "admin")=='a');
		assertTrue("Wrong username or password", lui.login("hehe", "user")=='n');
	}

	/**
	 * Test method for {@link uis.LoginUI#getUser(java.lang.String)}.
	 */
	@Test
	public void testGetUser() {

		assertTrue("toString", lui.getUser("juser").toString().equals("User [fName=John, lName=theUser, uName=juser, pWord=user, activated=Y, type=u]"));
//		assertTrue("firstname", u.getfName().equals("John"));
//		assertTrue("lastname", u.getlName().equals("theUser"));
//		assertTrue("username", u.getuName().equals("juser"));
//		assertTrue("type", u.getType()=='u');
//		assertTrue("activated", u.getActivated()=='y');
	}

	/**
	 * Test method for {@link uis.LoginUI#getAdmin(java.lang.String)}.
	 */
	@Test
	public void testGetAdmin() {
		assertTrue("toString", lui.getAdmin("nadmin").toString().equals("Admin [fName=Noreen, lName=Admin, uName=nadmin, pWord=admin, activated=Y, type=a]"));
	}

}
