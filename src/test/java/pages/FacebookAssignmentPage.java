package pages;

import org.openqa.selenium.WebDriver;

import Utility.Utility;
import locators.MyLocators;

public class FacebookAssignmentPage {
	public WebDriver driver;
	int timeInSec = 30;
	
	public FacebookAssignmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginTofacebook(String username, String password) {
		Utility.explicitWait(driver, timeInSec, MyLocators.getEmailId()).sendKeys(username);
		Utility.explicitWait(driver, timeInSec, MyLocators.getPassword()).sendKeys(password);
		Utility.explicitWait(driver, timeInSec, MyLocators.getLogin()).click();
		try { Utility.explicitWait(driver, 5, MyLocators.getaddPostDiv()); }
		catch(Exception e) {  Utility.explicitWait(driver, timeInSec, MyLocators.getRchedHomepage()).click();  
		Utility.explicitWait(driver, timeInSec, MyLocators.getaddPostDiv());
		}
		System.out.println("Reached Home Page");
	}
	
	public void writePost(String whatToWrite) {
		Utility.explicitWait(driver, timeInSec, MyLocators.getaddPostDiv()).click();
		Utility.explicitWait(driver, timeInSec, MyLocators.getpostPopup());
		Utility.explicitWait(driver, timeInSec, MyLocators.getaddYourPost()).sendKeys(whatToWrite);
		Utility.explicitWait(driver, timeInSec, MyLocators.getaddYourPostBtn()).click();
		Utility.explicitWait(driver, timeInSec, MyLocators.getverifyUrPost());
		System.out.println("Verified our added post feed in home page");
	}
	
}
