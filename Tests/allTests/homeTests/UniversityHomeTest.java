package allTests.homeTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import homes.UniversityHome;

public class UniversityHomeTest {
	
	private UniversityHome uHome;
	@Before
	public void setUp() throws Exception {
		uHome = new UniversityHome();
	}

	@Test
	public void testSearch() {
		uHome.search("n/a","NEW YORK", "n/a", "PRIVATE", 2000,10000, 25,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
	}

	
	//Test studentPop low is -10, -2, -1, 1000
	//Test studentPop high is -10, -2, -1, 10000
	//Test student pop low > student pop high.  10000>1000
	
	//Test percFem low is -10, -2, -1, 50, 100, 110
	//Test percFem high is -10, -2, -1, 50 100, 110
	//Test percFem low > percFem high. 100>50
	
	
	@Test
	public void testRelatedSchool() {
		fail("Not yet implemented");
	}

}
