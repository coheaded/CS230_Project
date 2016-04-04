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
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePopLFails(){
		uHome.search("00", "00", "00", "00", -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePopHFails(){
		uHome.search("00", "00", "00", "00", 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPopLGreaterThanPopHFails(){
		uHome.search("00", "00", "00", "00", 100, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerFemLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerFemLOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerFemHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerFemHOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerFemLGreaterThanPerFemHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 55, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSATVerbLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATVerbLOver800Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 815, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSATVerbHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATVerbHOver800Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 815, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATVerbLGreaterThanSATVerbHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 640, 400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSATMathLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATMathLOver800Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 815, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSATMathHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATMathHOver800Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 815, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSATMathLGreaterThanSATMathHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 640, 400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeExpensesLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, -40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeExpensesHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, -40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchExpensesLGreaterThanExpensesHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 1000, 500, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeFinAidLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchFinAidLOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeFinAidHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchFinAidHOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchFinAidLGreaterThanFinAidHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}

	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeNumAppsLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeNumAppsHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNumAppsLGreaterThanNumAppsHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerAdmLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerAdmLOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerAdmHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerAdmHOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerAdmLGreaterThanPerAdmHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 40, 0, 0, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerEnrollLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerEnrollLOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativePerEnrollHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerEnrollHOver100Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 105, 0, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchPerEnrollLGreaterThanPerEnrollHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 40, 0, 0, 0, 0, 0, 0);
	}
	
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeAcadScaleLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchAcadScaleLOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeAcadScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchAcadScaleHOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchAcadScaleLGreaterThanAcadScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0);
	}
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSocialScaleLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSocialScaleLOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeSocialScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSocialScaleHOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchSocialScaleLGreaterThanSocialScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 0);
	}
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeQualLifeScaleLFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchQualLifeScaleLOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchNegativeQualLifeScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchQualLifeScaleHOver5Fails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSearchQualLifeScaleLGreaterThanQualLifeScaleHFails(){
		uHome.search("00", "00", "00", "00", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 2);
	}
	
	
	
	
	@Test
	public void testSearchNeverAddToMatchStrength(){
		ArrayList<University> array = uHome.search("00", "00", "00", "00", 1, 1, 34.355, 34.355, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Collections.sort(array);
		
		for(int i = 0; i<array.size();i++){
			uni = array.get(i);
			assertTrue("School match strength is 0",uni.getMatchStrength()==0);
		}
		
	}
	
	
	@Test
	public void testSearchMatchIsPerfect() {
		ArrayList<University> array = uHome.search("BARNARD","NEW YORK", "URBAN", "PRIVATE", 9999,10001, 99,100,629,631,609,611,31008,31010,59,61,3999,4001,59,61,19,21,3,5,2,4,3,5);
		Collections.sort(array);
		uni = array.get(0);
		int test = uni.getMatchStrength();
		assertTrue("testing perfect match strength",test==30);
		assertTrue("making sure school is Barnard",uni.getName().equalsIgnoreCase("BARNARD"));
	}
	
	
	
	
	@Test
	public void testRelatedSchool() {
		University university = new University("n/a","TEXAS","SUBURBAN","PRIVATE",10000,50,-1,-1,12088,70,4000,90,80,2,3,3);
		ArrayList<University> array = uHome.relatedSchool(university);
		assertTrue("Top result should be Abilene Christian University",array.get(0).getName().equalsIgnoreCase("ABILENE CHRISTIAN UNIVERSITY"));
	}

}
