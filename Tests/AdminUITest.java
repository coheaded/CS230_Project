import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import uis.*;

public class AdminUITest {
	AdminUI admin;

	@Before
	public void setUp() throws Exception {
		admin = new AdminUI("juser");
	}

	@Test
	public void testDisplaySchool() {
		String[] expected = {"EMORY","GEORGIA","URBAN","PRIVATE","15000","45","550",
				"600","34980","35","5500","35","30","4","4","4"};
		String[] result = admin.displaySchool("Emory");
		assertTrue("Displaying Emory",result.equals(expected));
	}

	@Test
	public void testViewSchools() {
		String[][] array = admin.viewSchools();
		String[] expected = {"ABILENE CHRISTIAN UNIVERSITY","TEXAS","SUBURBAN","PRIVATE","10000","50","-1","-1","12088","70","4000","90","80","2","3","3",
				"LIBERAL-ARTS"};
		assertTrue("Viewing Abilene Christian University",array[0].equals(expected));
		
	}


}
