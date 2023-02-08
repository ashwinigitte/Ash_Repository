package testt;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;

public class CommonTest extends BaseTest {
	@BeforeClass
	public void login() {
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickOnLoginBtn();
		String titleOfDash=dp.titleOfDashBoardPage();
		AssertJUnit.assertEquals(titleOfDash, "Dashboard");
	}

}
