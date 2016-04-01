
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import people.*;

/**
 * 
 */

/**
 * @author smcarik
 *
 */
public class UniversityTest {

	private University uni, uni2, uni3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String[] emp = new String[5];
		emp[0] = "testing";
		uni = new University("Bard", "NEW YORK", "SMALL-CITY", "PRIVATE", 10000, 55, 560, 520, 32239, 80, 4000, 70, 30, 3, 4, 4, emp);
		uni2 = new University("BUTLER", "INDIANA", "URBAN", "PRIVATE", 10000, 60, 500, 530, 28271, 75, 4000, 80, 40, 3, 3, 3, emp);
		uni3 = new University("Blargh", "Blargh", "Blargh", "Blargh", 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, emp);
	}


	/**
	 * Test method for {@link people.University#compareTo(people.University)}.
	 */
	@Test
	public void testCompareTo() {
		uni.addToMatchStrength(20);
		uni2.addToMatchStrength(15);
		assertEquals("uni should be higher than uni2, should return -5", -5, uni.compareTo(uni2));
	}

	/**
	 * Test method for {@link people.University#getName()}.
	 */
	@Test
	public void testGetName() {
		assertEquals("The schools name should be Bard", "Bard", uni.getName());
	}

	/**
	 * Test method for {@link people.University#getState()}.
	 */
	@Test
	public void testGetState() {
		assertEquals("The schools state should be New York", "NEW YORK", uni.getState());
	}

	/**
	 * Test method for {@link people.University#setState(java.lang.String)}.
	 */
	@Test
	public void testSetState() {
		uni3.setState("Blargh2");
		assertEquals("The schools state should be Blargh2", "Blargh2", uni3.getState());
	}

	/**
	 * Test method for {@link people.University#getLocation()}.
	 */
	@Test
	public void testGetLocation() {
		assertEquals("The schools location is SMALL_CITY", "SMALL-CITY", uni.getLocation());
	}

	/**
	 * Test method for {@link people.University#setLocation(java.lang.String)}.
	 */
	@Test
	public void testSetLocation() {
		uni3.setLocation("Blargh2");
		assertEquals("The schools location is Blargh2", "Blargh2", uni3.getLocation());
	}

	/**
	 * Test method for {@link people.University#getControl()}.
	 */
	@Test
	public void testGetControl() {
		assertEquals("the schools control is PRIVATE", "PRIVATE", uni.getControl());
	}

	/**
	 * Test method for {@link people.University#setControl(java.lang.String)}.
	 */
	@Test
	public void testSetControl() {
		uni3.setControl("Blargh2");
		assertEquals("The schools control is Blargh2", "Blargh2", uni3.getControl());
	}

	/**
	 * Test method for {@link people.University#getStudentPop()}.
	 */
	@Test
	public void testGetStudentPop() {
		assertEquals("the schools student population is 10000", 10000, uni.getStudentPop());
	}

	/**
	 * Test method for {@link people.University#setStudentPop(int)}.
	 */
	@Test
	public void testSetStudentPop() {
		uni3.setStudentPop(101);
		assertEquals("The schools student population is 101", 101, uni3.getStudentPop());
	}

	/**
	 * Test method for {@link people.University#getFemPercent()}.
	 */
	@Test
	public void testGetFemPercent() {
		assertEquals("The schools female percentage is 55", (int)55, (int)uni.getFemPercent());
	}

	/**
	 * Test method for {@link people.University#setFemPercent(int)}.
	 */
	@Test
	public void testSetFemPercent() {
		uni3.setFemPercent(50);
		assertEquals("The schools female percentage is 50", (long)50, (long)uni3.getFemPercent());
	}

	/**
	 * Test method for {@link people.University#getSatVerbal()}.
	 */
	@Test
	public void testGetSatVerbal() {
		assertEquals("the schools sat verbal score is 560", (int)560, (int)uni.getSatVerbal());
	}

	/**
	 * Test method for {@link people.University#setSatVerbal(int)}.
	 */
	@Test
	public void testSetSatVerbal() {
		uni3.setSatVerbal(500);
		assertEquals("the schools sat verbal score is 500", (int)500, (int)uni3.getSatVerbal());
	}

	/**
	 * Test method for {@link people.University#getSatMath()}.
	 */
	@Test
	public void testGetSatMath() {
		assertEquals("the schools sat math score is 520", (int)520, (int)uni.getSatMath());
	}

	/**
	 * Test method for {@link people.University#setSatMath(int)}.
	 */
	@Test
	public void testSetSatMath() {
		uni3.setSatMath(500);
		assertEquals("the schools sat math score is 500", (int)500, (int)uni3.getSatMath());
	}

	/**
	 * Test method for {@link people.University#getExpenses()}.
	 */
	@Test
	public void testGetExpenses() {
		assertEquals("The schools expenses are 32239", (int)32239, (int)uni.getExpenses());
	}

	/**
	 * Test method for {@link people.University#setExpenses(int)}.
	 */
	@Test
	public void testSetExpenses() {
		uni3.setExpenses(9001);
		assertEquals("The schools expenses are 9001", (int)9001, (int)uni3.getExpenses());
	}

	/**
	 * Test method for {@link people.University#getFinAidPercent()}.
	 */
	@Test
	public void testGetFinAidPercent() {
		assertEquals("the schools finacial aid percent is 80", (int)80, (int)uni.getFinAidPercent());
	}

	/**
	 * Test method for {@link people.University#setFinAidPercent(int)}.
	 */
	@Test
	public void testSetFinAidPercent() {
		uni3.setFinAidPercent(69);
		assertEquals("the schools finacial aid percentage is 69", (int)69, (int)uni3.getFinAidPercent());
	}

	/**
	 * Test method for {@link people.University#getNumApps()}.
	 */
	@Test
	public void testGetNumApps() {
		assertEquals("The schools number of applicants is 4000", (int) 4000, (int)uni.getNumApps());
	}

	/**
	 * Test method for {@link people.University#setNumApps(int)}.
	 */
	@Test
	public void testSetNumApps() {
		uni3.setNumApps(9001);
		assertEquals("the schools number of applicants is 9001", (int) 9001, (int) uni3.getNumApps());
		
	}

	/**
	 * Test method for {@link people.University#getAdmittedPercent()}.
	 */
	@Test
	public void testGetAdmittedPercent() {
		assertEquals("the schools admitted percent is 70", (int) 70, (int) uni.getAdmittedPercent());
	}

	/**
	 * Test method for {@link people.University#setAdmittedPercent(int)}.
	 */
	@Test
	public void testSetAdmittedPercent() {
		uni3.setAdmittedPercent(69);
		assertEquals("the schools admitted percent is 69", (int) 69, (int) uni3.getAdmittedPercent());
	}

	/**
	 * Test method for {@link people.University#getEnrolledPercent()}.
	 */
	@Test
	public void testGetEnrolledPercent() {
		assertEquals("the schools enrolled percent is 30", (int)30, (int) uni.getEnrolledPercent());
	}

	/**
	 * Test method for {@link people.University#setEnrolledPercent(int)}.
	 */
	@Test
	public void testSetEnrolledPercent() {
		uni3.setEnrolledPercent(69);
		assertEquals("The schools enrolled percent is 69", (int)69, (int)uni3.getEnrolledPercent());
	}

	/**
	 * Test method for {@link people.University#getAcademicScale()}.
	 */
	@Test
	public void testGetAcademicScale() {
		assertEquals("the schools academic scale is 3", 3, uni.getAcademicScale());
	}

	/**
	 * Test method for {@link people.University#setAcademicScale(int)}.
	 */
	@Test
	public void testSetAcademicScale() {
		uni3.setAcademicScale(5);
		assertEquals("The schools academic scale is 5", 5, uni3.getAcademicScale());
	}

	/**
	 * Test method for {@link people.University#getSocialScale()}.
	 */
	@Test
	public void testGetSocialScale() {
		assertEquals("The schools social scale is 4", 4, uni.getSocialScale());
	}

	/**
	 * Test method for {@link people.University#setSocialScale(int)}.
	 */
	@Test
	public void testSetSocialScale() {
		uni3.setSocialScale(5);
		assertEquals("The schools social scale is 5", 5, uni3.getSocialScale());
	}

	/**
	 * Test method for {@link people.University#getQualityOfLife()}.
	 */
	@Test
	public void testGetQualityOfLife() {
		assertEquals("the schools quality of life is 4", 4, uni.getQualityOfLife());
	}

	/**
	 * Test method for {@link people.University#setQualityOfLife(int)}.
	 */
	@Test
	public void testSetQualityOfLife() {
		uni3.setQualityOfLife(5);
		assertEquals("the schools quality of life is 5", 5, uni3.getQualityOfLife());
	}

	/**
	 * Test method for {@link people.University#getEmphases()}.
	 */
	@Test
	public void testGetEmphases() {
		String[] hi = uni.getEmphases();
		assertEquals("The schools emphases is testing", "testing", hi[0]);
	}

	/**
	 * Test method for {@link people.University#setEmphases(java.lang.String[])}.
	 */
	@Test
	public void testSetEmphases() {
		String[] run = new String[5];
		run[0] = "testing2";
		uni3.setEmphases(run);
		String[] run2 = uni3.getEmphases();
		assertEquals("The schools emphases is testing2", "testing2", run2[0]);
	}

	/**
	 * Test method for {@link people.University#addToMatchStrength(int)}.
	 */
	@Test
	public void testAddToMatchStrength() {
		uni3.addToMatchStrength(100);
		assertEquals("The schools match strenght is 100", 100, uni3.getMatchStrength());
	}

	/**
	 * Test method for {@link people.University#resetMatchStrength()}.
	 */
	@Test
	public void testResetMatchStrength() {
		uni3.resetMatchStrength();
		assertEquals("The schools match strenght is 0", 0, uni3.getMatchStrength());
		
	}
}
