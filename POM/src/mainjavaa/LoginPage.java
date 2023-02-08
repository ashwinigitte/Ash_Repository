package mainjavaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testt.BaseTest;



public class LoginPage extends BaseTest{
	
	//all locators of this page should be on top
	@FindBy(xpath="//*[text()='Login']")
	WebElement txtLoginPage;
	
	
	@FindBy(name="username")
	WebElement userNm;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(tagName="button")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[text()='OrangeHRM']")
	WebElement txtBuild;
	
		
    //initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//methods required to perform test steps	
	
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to verify current login page title
	 * parameter return:String
	 */
	
	public String titleOfLoginPage() {
		return txtLoginPage.getText();
	}
	
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to verify build title
	 * parameter return:String
	 */
	public String titleOfBuild() {
		return driver.getTitle();
	}
	
	
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to verify url of page 
	 * parameter return:String
	 */
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to set username
	 * parameter return:String
	 */
	
	public void setUsername(String userName ) {
		userNm.sendKeys(userName);
	}
	
	
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to set password
	 * parameter return:String
	 */
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	/**
	 * @author Ashwini
	 * Date:05 feb 2023
	 * Description:this test method is used to click on login button
	 * parameter return:String
	 */
	
	public void clickOnLoginBtn() {
		btnLogin.click();
	}
}