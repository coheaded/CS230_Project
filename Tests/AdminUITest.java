
import static org.junit.Assert.*;
import java.util.*;

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
				"600","34980","35","5500","35","30","4","4","4","BIOLOGY","BUSINESS-ADMINISTRATION","COMPUTER-SCIENCE",
				"LAW","LIBERAL-ARTS","MEDICAL-SCIENCES","SOCIAL-SCIENCE",null,null,null,null,null,null,null,null};
		String[] result = admin.displaySchool("Emory");
		assertTrue("Displaying Emory",Arrays.equals(result,expected));
	}

	@Test
	public void testViewSchools() {
		String[][] array = admin.viewSchools();
		String[] expected = {"ABILENE CHRISTIAN UNIVERSITY","TEXAS","SUBURBAN","PRIVATE","10000","50","-1","-1","12088","70","4000","90","80","2","3","3",
				"LIBERAL-ARTS",null,null,null,null,null,null,null,null,null,null,null,null,null,null};
		assertTrue("Viewing Abilene Christian University",Arrays.equals(array[0],expected));
		String[] expected2 = {"CORNELL","NEW YORK","SMALL-CITY","PRIVATE","25000","45","600","650","42037","50","17000","30","50","5","3","2","AGRICULTURE",
				"ARCHITECTURE","ARTS-AND-SCIENCES","ENGINEERING","HOTEL-ADMINISTRATION","HUMAN-ECOLOGY","INDUSTRIAL:LABOR-RELATIONS",null,null,null,null,null,null,null,null};
		assertTrue("Viewing Cornell",Arrays.equals(array[35],expected2));
	}
}
