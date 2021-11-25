package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class AccountPage extends TestBase {

	@FindBy(xpath = "//a[@data-automation-id= 'add-payment']")
	WebElement addoreditPaymentLink;

	@FindBy(xpath = "//a[@data-automation-id= 'add-address']")
	WebElement addAddressLink;

	@FindBy(xpath = "//a[@data-automation-id= 'edit-profile']")
	WebElement editProfileLink;

	@FindBy(xpath = "//a[@data-automation-id= 'edit-password']")
	WebElement changePWDLink;

	@FindBy(xpath = "//h2[text() = 'Manage your account']")
	WebElement accountPageHeader;

	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean accountPageHeader() {
		 boolean headerText = accountPageHeader.isDisplayed();
		 return headerText;
	}

}
