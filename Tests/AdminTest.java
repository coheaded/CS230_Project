import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import people.*;

public class AdminTest {

	private Admin admin;
	@Before
	public void setUp() throws Exception {
		admin = new Admin("Steven", "Carik", "smcarik", "steven", 'y', 'a');
	}

	@Test
	public void testGetfName() {
		assertEquals("first name should be Steven", admin.getfName(),"Steven");
	}

	@Test
	public void testSetfName() {
		admin.setfName("Adam");
		assertTrue("First name should be Adam", admin.getfName().equals("Adam"));
	}

	@Test
	public void testGetlName() {
		assertTrue("Last name should be Carik", admin.getlName().equals("Carik"));
	}

	@Test
	public void testSetlName() {
		admin.setlName("Noack");
		assertTrue("Last name should be Noack", admin.getlName().equals("Noack"));
	}

	@Test
	public void testGetuName() {
		assertTrue("admin name should be smcarik", admin.getuName().equals("smcarik"));
	}

	@Test
	public void testGetpWord() {
		assertTrue("password should be steven", admin.getpWord().equals("steven"));
	}

	@Test
	public void testSetpWord() {
		admin.setpWord("adam");
		assertTrue("password should be adam", admin.getpWord().equals("adam"));
	}

	@Test
	public void testGetActivated() {
		assertTrue("activated should be y", admin.getActivated()=='y');
	}

	@Test
	public void testGetType() {
		assertTrue("type should be u", admin.getType()=='a');
	}

	@Test
	public void testSetActivated() {
		admin.setActivated();
		assertTrue("activation should be n", admin.getActivated()=='n');
	}

	@Test
	public void testSetType() {
		admin.setType();
		assertTrue("type should be a", admin.getType()=='u');
	}

	@Test
	public void testToString() {
		assertTrue("output should read Admin [fName=Steven, lName=Carik, uName=smcarik, pWord=steven, activated=y, type=a]",
				admin.toString().equals("Admin [fName=Steven, lName=Carik, uName=smcarik, pWord=steven, activated=y, type=a]"));
	}

}
