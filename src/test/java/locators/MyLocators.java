package locators;

import org.openqa.selenium.By;

public class MyLocators {
	private static By EmailId = By.id("email");
	private static By Password = By.id("pass");
	private static By Login = By.xpath(".//button[@name='login']");
	private static By RchedHomepage = By.xpath(".//div[@role='navigation' and @aria-label='Facebook']//a[@aria-label='Home']/span");
	private static By addPostDiv = By.xpath(".//div[contains(@class,'k4urcfbm')]/span");
	private static By postPopup = By.xpath(".//div[@role='dialog']/form[@method='POST']");
	private static By addYourPost = By.xpath(".//div[@role='textbox']");
	private static By addYourPostBtn = By.xpath(".//div[@role='button' and @aria-label='Post']");
	private static By verifyUrPost = By.xpath(".//div[contains(@data-pagelet,'FeedUnit_0')]//div[text()='Hello World']");
	
	public static By getEmailId() {   return EmailId;   }
	public static By getPassword() {  return Password;  }
	public static By getLogin() {  return Login;  }
	public static By getRchedHomepage() {  return RchedHomepage;  }
	public static By getaddPostDiv() {  return addPostDiv;  }
	public static By getpostPopup() {  return postPopup;  }
	public static By getaddYourPost() {  return addYourPost;  }
	public static By getaddYourPostBtn() {  return addYourPostBtn;  }
	public static By getverifyUrPost() {  return verifyUrPost;  }
	
}
