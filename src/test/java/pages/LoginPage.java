package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[@data-automation-id = 'signin-submit-btn']")
	WebElement loginbutton;

	@FindBy(xpath = "//button[@data-automation-id = 'signin-sign-up-btn']")
	WebElement signupbutton;

	@FindBy(css = ".header-logo")
	WebElement Brandlogo;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public void validLogin(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();

	}

}
