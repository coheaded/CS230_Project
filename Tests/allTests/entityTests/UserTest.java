package allTests.entityTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import people.*;

public class UserTest {

	private User user;
	@Before
	public void setUp() throws Exception {
		user = new User("Adam", "Noack", "adnoack", "adam", 'u', 'y');
	}

	@Test
	public void testGetfName() {
		assertEquals("first name should be Adam", user.getfName(),"Adam");
	}

	@Test
	public void testSetfName() {
		user.setfName("Steven");
		assertTrue("First name should be Adam", user.getfName().equals("Steven"));
	}

	@Test
	public void testGetlName() {
		assertTrue("Last name should be Noack", user.getlName().equals("Noack"));
	}

	@Test
	public void testSetlName() {
		user.setlName("Carik");
		assertTrue("Last name should be Noack", user.getlName().equals("Carik"));
	}

	@Test
	public void testGetuName() {
		assertTrue("user name should be adnoack", user.getUsername().equals("adnoack"));
	}

	@Test
	public void testGetpWord() {
		assertTrue("password should be adam", user.getpWord().equals("adam"));
	}

	@Test
	public void testSetpWord() {
		user.setpWord("steven");
		assertTrue("password should be adam", user.getpWord().equals("steven"));
	}

	@Test
	public void testGetActivated() {
		assertTrue("activated should be y", user.getActivated()=='y');
	}

	@Test
	public void testGetType() {
		assertTrue("type should be u", user.getType()=='u');
	}

	@Test
	public void testSetActivated() {
		user.setActivated();
		assertTrue("activation should be n", user.getActivated()=='n');
	}

	@Test
	public void testSetType() {
		user.setType();
		assertTrue("type should be a", user.getType()=='a');
	}

	@Test
	public void testToString() {
		assertTrue("output should read User [fName=Adam, lName=Noack, uName=adnoack, pWord=adam, activated=y, type=u]",
				user.toString().equals("User [fName=Adam, lName=Noack, uName=adnoack, pWord=adam, activated=y, type=u]"));
	}

}
