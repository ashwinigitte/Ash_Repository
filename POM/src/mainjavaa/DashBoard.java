package mainjavaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testt.BaseTest;

public class DashBoard extends BaseTest {
	//all locators of this page should be on top
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashboard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickLogOutDropDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement clickLogOut;
	
	
	//initialization of locators/variables
	public DashBoard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods required to perform test steps	
	
	/**
	 * @author Ashwini
	 * Date:06 feb 2023
	 * Description:this test method is used to verify dash board page title
	 * parameter return:String
	 */
	
	public String titleOfDashBoardPage() {
		return titleDashboard.getText();
	}
	
	/**
	 * @author Ashwini
	 * Date:06 feb 2023
	 * Description:this test method is used to verify logout
	 * parameter return:String
	 */
	public String clickOnLogOut() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogOutDropDown.click();
		return clickLogOut.getText();
	}
	
}
