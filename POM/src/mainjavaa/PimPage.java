package mainjavaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testt.BaseTest;

public class PimPage extends BaseTest {
	//all locators of this page should be on top
	@FindBy(xpath="//*[text()='PIM']")
	WebElement pimTxt;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtPim;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement setEmpId;
	
	
	 //initialization of locators/variables
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	//methods required to perform test steps	
	public void clickOnPim() {
		pimTxt.click();
	}
	public String textOnPim() {
		return txtPim.getText();
	}
	
	public void setPimPageEmpId(String empId) {
		setEmpId.sendKeys(empId);
	}
	public void clickOnSearch1() {
		search.click();
	}
	public String clickOnSearch(String empIdd) {
		search.click();
		return setEmpId.findElements(By.xpath("//div[text()='"+empIdd+"']")).get(0).getText();
	}
	
}
