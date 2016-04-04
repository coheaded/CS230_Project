import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import allTests.controller.*;
import allTests.entityTests.*;
import allTests.homeTests.*;
import allTests.uiTests.*;

@RunWith(Suite.class)
@SuiteClasses({
	DBControllerTest.class,
	AdminTest.class,
	UniversityTest.class,
	UserTest.class,
	AdminHomeTest.class,
	UniversityHomeTest.class,
	UserHomeTest.class,
	AdminUITest.class,
	LoginUITest.class,
	UserUITest.class
	})
public class AllTests {

}
