package testt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjavaa.BaseClass;
import mainjavaa.DashBoard;
import mainjavaa.LoginPage;
import mainjavaa.PimPage;

public class BaseTest extends BaseClass {
	@BeforeClass
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void pageObjects() {
		lp=new LoginPage(driver);
		dp=new DashBoard(driver);
		pp=new PimPage(driver);
	}
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
