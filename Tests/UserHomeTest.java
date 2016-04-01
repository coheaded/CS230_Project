
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import homes.UserHome;
import people.User;

/**
 * 
 */

/**
 * @author smcarik
 *
 */
public class UserHomeTest {

	private UserHome uhome;
	private User user;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		uhome = new UserHome();
		user  = new User("John","theUser", "juser", "user", 'u', 'Y');
	}

	/**
	 * Test method for {@link homes.UserHome#viewSchools(people.User)}.
	 */
	@Test
	public void testViewSchools() {
		String[] schools = uhome.viewSchools(user);
		assertEquals("The first saved school is Seton Hall", "Seton Hall", schools[1]);
		assertEquals("The second saved school is Villanova", "Villanova", schools[3]);
	}

	/**
	 * Test method for {@link homes.UserHome#displaySchool(java.lang.String)}.
	 */
	@Test
	public void testDisplaySchool() {
		String[] school = uhome.displaySchool("Rice");
		assertEquals("the schools name is Rice", "RICE", school[0]);
		assertEquals("the schools state is Texas", "TEXAS", school[1]);
		assertEquals("the schools location is SUBURBAN","SUBURBAN", school[2]);
		assertEquals("the schools control is PRIVATE", "PRIVATE", school[3]);
		assertEquals("the schools studentPop is 10000", "10000", school[4]);
		assertEquals("the schools femPercent is 33", "33", school[5]);
		assertEquals("Theschools satVerbal is 621", "621", school[6]);
		assertEquals("the schools sat Math is 671", "671", school[7]);
		assertEquals("the schools expenses is 18718", "18718", school[8]);
		assertEquals("the schools finAidPercent is 80", "80", school[9]);
		assertEquals("the schools numApps is 4000", "4000", school[10]);
		assertEquals("the schools admittedPercent is 35", "35", school[11]);
		assertEquals("the schools enrolledPercent 55", "55", school[12]);
		assertEquals("the schools academicScale is 5", "5", school[13]);
		assertEquals("the schools socialScale is 2", "2", school[14]);
		assertEquals("the schools qualityOfLife is 3", "3", school[15]);
	}

	/**
	 * Test method for {@link homes.UserHome#findEmphases(java.lang.String)}.
	 */
	@Test
	public void testFindEmphases() {
		String[] emphs = uhome.findEmphases("Rice");
		assertEquals("The schools emphasis is ARCHITECTURE, ENGINEERING, HUMANITIES", "ARCHITECTUREENGINEERINGHUMANITIES",emphs[0]+emphs[1]+emphs[2]);
	}

}
