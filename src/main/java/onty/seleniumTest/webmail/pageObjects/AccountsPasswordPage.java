package onty.seleniumTest.webmail.pageObjects;

import org.openqa.selenium.WebDriver;

import onty.seleniumTest.webmail.exceptions.WrongPageException;


public class AccountsPasswordPage extends APage {

//	public By locFieldUsername = By.id("user_name");
//	public By locFieldPassword = By.id("user_password");
//	public By locButtonLogin = By.id("login");


	public AccountsPasswordPage(WebDriver driver ) throws WrongPageException {
		super(driver);
		
		// check url to make sure we are on the correct page
		if ( ! driver.getCurrentUrl().contains("accounts/home") )
			throw new WrongPageException();
	}
	

}
