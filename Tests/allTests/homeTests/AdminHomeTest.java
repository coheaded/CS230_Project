package allTests.homeTests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import controller.DBController;
import homes.*;
import java.util.*;

public class AdminHomeTest {

	private AdminHome adHome;
	private DBController controller;
	@Before
	public void setUp() throws Exception {
		adHome = new AdminHome();
		controller = new DBController("cottonhead","cottonhead", "acls4");
	}
	
	@Test
	public void testFindEmphases() {
		String[] expected = {"ENGINEERING", "SOCIAL-SCIENCE", null,  null, null, null, null, null, null, null, null, null, null, null, null};
		String[] test = adHome.findEmphases("TULANE");
		assertTrue("Viewing Emphases for Tulane", Arrays.equals(test, expected));
	}
	

//	@Test
//	public void testAddUniversity() {
//
//		String[] array = {"Math", "Computer Science"};
//		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, array);
//		String[] test = adHome.displaySchool("Gatorade10");
//		String[] expected = {"Gatorade10", "Minnesota", "Urban", "Private", "100", "100", "100", "100", "100", "100", "100", "100", "100", "1", "1", "1"};
//		String[] expected1 = {"Computer Science", "Math", null,  null, null, null, null, null, null, null, null, null, null, null, null};
//		String[] test1 = adHome.findEmphases("Gatorade10");
//		assertTrue("Should be displaying: Gatorade10, Minnesota, Urban, Private, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1,", Arrays.equals(test, expected));
//		assertTrue("Should be displaying: Math, Computer Science", Arrays.equals(test1, expected1));
//	}

	@Test
	public void testEditUniversity() {
		String[] array = {"MATH", "COMPUTER SCIENCE"};
		adHome .editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, array);
		String[] test = adHome.displaySchool("Blargh");
		String[] expected = {"Blargh", "Blargh", "Blargh", "Blargh", "100", "100", "100", "100", "100", "100", "100", "100", "100", "1", "1", "1"};
		String[] testEmph = adHome.findEmphases("Blargh");
		String[] expected1 = {"COMPUTER SCIENCE", "MATH", null,  null, null, null, null, null, null, null, null, null, null, null, null};
		assertTrue("Testing editing Blargh", Arrays.equals(test, expected));
		assertTrue("Making sure emphases changed", Arrays.equals(testEmph, expected1));
	}

	@Test
	public void testDisplaySchool() {
		String[] expected = {"EMORY","GEORGIA","URBAN","PRIVATE","15000","45","550",
				"600","34980","35","5500","35","30","4","4","4"};
		String[] result = adHome.displaySchool("Emory");
		assertTrue("Displaying Emory",Arrays.equals(result,expected));
	}	


}
