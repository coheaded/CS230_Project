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
	

	@Test
	public void testAddUniversity() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
		String[] test = adHome.displaySchool("Gatorade10");
		String[] expected = {"Gatorade10", "Minnesota", "Urban", "Private", "100", "50", "100", "100", "100", "50", "100", "50", "50", "1", "1", "1"};
		String[] expected1 = {"Computer Science", "Math", null,  null, null, null, null, null, null, null, null, null, null, null, null};
		String[] test1 = adHome.findEmphases("Gatorade10");
		assertTrue("Should be displaying: Gatorade10, Minnesota, Urban, Private, 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1,", Arrays.equals(test, expected));
		assertTrue("Should be displaying: Math, Computer Science", Arrays.equals(test1, expected1));
	}
	
	@Test
	public void testAddUniversity_AllFieldsNegative1pass()
	{
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, array);
		String[] test = adHome.displaySchool("Gatorade10");
		String[] expected = {"Gatorade10", "Minnesota", "Urban", "Private", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"};
		String[] expected1 = {"Computer Science", "Math", null,  null, null, null, null, null, null, null, null, null, null, null, null};
		String[] test1 = adHome.findEmphases("Gatorade10");
		assertTrue("Should be displaying: Gatorade10, Minnesota, Urban, Private, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,", Arrays.equals(test, expected));
		assertTrue("Should be displaying: Math, Computer Science", Arrays.equals(test1, expected1));
	}
	
	@Test
	public void testAddUniversity_AllFieldsMaxAllowedValue() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 1000000000, 100, 800, 800, 52000, 100, 500000, 100, 100, 5, 5, 5, array);
		String[] test = adHome.displaySchool("Gatorade10");
		String[] expected = {"Gatorade10", "Minnesota", "Urban", "Private", "1000000000", "100", "800", "800", "52000", "100", "500000", "100", "100", "5", "5", "5"};
		String[] expected1 = {"Computer Science", "Math", null,  null, null, null, null, null, null, null, null, null, null, null, null};
		String[] test1 = adHome.findEmphases("Gatorade10");
		assertTrue("Should be displaying: Gatorade10, Minnesota, Urban, Private, 1000000000, 100, 800, 800, 52000, 100, 500000, 100, 100, 5, 5, 5,", Arrays.equals(test, expected));
		assertTrue("Should be displaying: Math, Computer Science", Arrays.equals(test1, expected1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_studPopFails()
	{
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", -2, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_studPopFails2()
	{
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", -10, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FemPercentFails()
	{
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, -2, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FemPercentFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, -10, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FemPercentFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 101, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FemPercentFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 110, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATVerbalFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, -2, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATVerbalFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, -10, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATVerbalFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 801, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATVerbalFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 810, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATMathFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, -2, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATMathFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, -10, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATMathFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 801, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SATMathFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 810, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_ExpensesFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, -2, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_ExpensesFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, -10, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FinacialAidPercFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, -2, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FinacialAidPercFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, -10, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FinacialAidPercFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 101, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_FinacialAidPercFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 110, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_numAppsFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, -2, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_numAppsFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, -10, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_PercentAdmittedFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, -2, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_PercentAdmittedFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, -10, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_PercentAdmittedFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 101, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_PercentAdmittedFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 110, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_EnrolledPercFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, -2, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_EnrolledPercFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, -10, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_EnrolledPercFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 101, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_EnrolledPercFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 110, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_AcadScaleFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, -2, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_AcadScaleFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, -10, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_AcadScaleFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 6, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_AcadScaleFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 10, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SocialScaleFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, -2, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SocialScaleFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, -10, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SocialScaleFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 6, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_SocialScaleFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 10, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_QualityOfLifeFails() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, -2, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_QualityOfLifeFails2() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, -10, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_QualityOfLifeFails3() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 6, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddUniversity_QualityOfLifeFails4() {
		controller.removeUniversityEmphasis("Gatorade10", "Computer Science");
		controller.removeUniversityEmphasis("Gatorade10", "Math");
		controller.deleteUniversity("Gatorade10");
		String[] array = {"Math", "Computer Science"};
		adHome.addUniversity("Gatorade10", "Minnesota", "Urban", "Private", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 10, array);
	}
	

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
	public void testeditUniversity_AllFieldsNegative1pass()
	{
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, array);
	}
	
	@Test
	public void testeditUniversity_AllFieldsMaxAllowedValue() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 1000000000, 100, 800, 800, 52000, 100, 500000, 100, 100, 5, 5, 5, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_studPopFails()
	{
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", -2, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_studPopFails2()
	{
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", -10, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FemPercentFails()
	{
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, -2, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FemPercentFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, -10, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FemPercentFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 101, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FemPercentFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 110, 100, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}	
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATVerbalFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, -2, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATVerbalFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, -10, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATVerbalFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 801, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATVerbalFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 810, 100, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATMathFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, -2, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATMathFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, -10, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATMathFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 801, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SATMathFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 810, 100, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_ExpensesFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, -2, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_ExpensesFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, -10, 50, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FinacialAidPercFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, -2, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FinacialAidPercFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, -10, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FinacialAidPercFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 101, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_FinacialAidPercFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 110, 100, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_numAppsFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, -2, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_numAppsFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, -10, 50, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_PercentAdmittedFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, -2, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_PercentAdmittedFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, -10, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_PercentAdmittedFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 101, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_PercentAdmittedFails4() {

		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 110, 50, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_EnrolledPercFails() {

		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, -2, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_EnrolledPercFails2() {

		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, -10, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_EnrolledPercFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 101, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_EnrolledPercFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 110, 1, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_AcadScaleFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, -2, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_AcadScaleFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, -10, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_AcadScaleFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 6, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_AcadScaleFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 10, 1, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SocialScaleFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, -2, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SocialScaleFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, -10, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SocialScaleFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 6, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_SocialScaleFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 10, 1, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_QualityOfLifeFails() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, -2, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_QualityOfLifeFails2() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, -10, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_QualityOfLifeFails3() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 6, array);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testeditUniversity_QualityOfLifeFails4() {
		String[] array = {"Math", "Computer Science"};
		adHome.editUniversity("Blargh", "Blargh", "Blargh", "Blargh", 100, 50, 100, 100, 100, 50, 100, 50, 50, 1, 1, 10, array);
	}

	@Test
	public void testDisplaySchool() {
		String[] expected = {"EMORY","GEORGIA","URBAN","PRIVATE","15000","45","550",
				"600","34980","35","5500","35","30","4","4","4"};
		String[] result = adHome.displaySchool("Emory");
		assertTrue("Displaying Emory",Arrays.equals(result,expected));
	}	


}
