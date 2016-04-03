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
		uHome.search(school, state, location, control, popL, popH, perFemL, perFemH, SATVerbL, SATVerbH, SATMathL, SATMathH, expensesL, expensesH, finAidL, finAidH, numAppsL, numAppsH, perAdmL, perAdmH, perEnrollL, perEnrollH, acadScaleL, acadScaleH, socialScaleL, socialScaleH, qualLifeScaleL, qualLifeScaleH);
	}

	@Test
	public void testRelatedSchool() {
		fail("Not yet implemented");
	}

}
