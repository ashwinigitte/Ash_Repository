package testt;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import mainjavaa.LoginPage;

public class LoginTest extends BaseTest {
@Test(priority=0,groups= {"smoke","regression"})
 public void verifyTitleOfLoginPage() {
	String verifyTitleOfLoginPage=lp.titleOfLoginPage();
	AssertJUnit.assertEquals(verifyTitleOfLoginPage, "Login");
}

@Test(priority=1,groups= {"smoke","regression"})
public void verifyCurrentUrl() {
	String verifUrlOfPage =lp.urlOfPage();
	AssertJUnit.assertEquals( verifUrlOfPage,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Test(priority=2,groups= {"smoke","regression"})
public void verifyValidUsername() {
	lp.setUsername("Admin");
	lp.setPassword("admin123");
	lp.clickOnLoginBtn();
}
@Test(priority=3,groups= "smoke")
public void verifyDashboard() {
	String titleOfDash=dp.titleOfDashBoardPage();
	AssertJUnit.assertEquals(titleOfDash, "Dashboard");
}

@Test(priority=0,groups="smoke")
public void verifyBuildtitle() {
	String verifytitle=lp.titleOfBuild();
	Assert.assertEquals(verifytitle,"OrangeHRM");
}
//@Test(priority=4,groups= {"smoke","regression"})
//public void logOut() {
// String  txt= dp.clickOnLogOut();
//Assert.assertEquals(txt,"");
//
//}
}

