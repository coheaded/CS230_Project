package allTests.homeTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import homes.UniversityHome;
import people.*;
import java.util.*;

public class UniversityHomeTest {
	
	private UniversityHome uHome;
	private University uni;
	@Before
	public void setUp() throws Exception {
		uHome = new UniversityHome();
	}

	@Test
	public void testSearch() {
		ArrayList<University> array = uHome.search("BARNARD","NEW YORK", "URBAN", "PRIVATE", 9999,10001, 99,100,629,631,609,611,31008,31010,59,61,3999,4001,59,61,19,21,3,5,2,4,3,5);
		Collections.sort(array);
		uni = array.get(0);
		int test = uni.getMatchStrength();
		assertTrue("testing perfect match",test==30);
		
		
		
		
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
