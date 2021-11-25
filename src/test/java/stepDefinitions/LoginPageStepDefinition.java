package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.LoginPage;
import util.TestBase;

public class LoginPageStepDefinition extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;

	@Given("^user is on sign in page$")
	public void user_is_on_login_page() {
		TestBase.initialization();
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle, "Login");
		System.out.println("user landed login page");
	}

	@When("^user provides valid login and password and clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage = new LoginPage();
		loginPage.validLogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, "Account");
		System.out.println("user successfully clicks on login button");

	}

	@And("^validate the account page$")
	public void validate_the_account_page() {
		accountPage = new AccountPage();
		boolean header = accountPage.accountPageHeader();
		Assert.assertTrue(header);
		System.out.println("validated the account page");
	}

	@And("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
