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
		String[] schools = uhome.viewSchools("juser");
		assertEquals("The first saved school is Seton Hall", "Seton Hall", schools[0]);
		assertEquals("The second saved school is Villanova", "Villanova", schools[1]);
		
		
	}

	/**
	 * Test method for {@link homes.UserHome#displaySchool(java.lang.String)}.
	 */
	@Test
	public void testDisplaySchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link homes.UserHome#findEmphases(java.lang.String)}.
	 */
	@Test
	public void testFindEmphases() {
		fail("Not yet implemented");
	}

}
