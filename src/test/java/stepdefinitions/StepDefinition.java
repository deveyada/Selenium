package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageobjects.LoginPage;
import pageobjects.homepage;
import resources.baseclass;

@RunWith(Cucumber.class)
public class StepDefinition extends baseclass {
	
	public WebDriver driver;	
	
	
	
    @Given("^user launches the browser$")
    public void user_launches_the_browser() throws Throwable {
        driver = launchbrowser();
    }
    
    @Then("^user opens the \"([^\"]*)\" site$")
    public void user_opens_the_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

    @Then("^user opens the home page$")
    public void user_opens_the_home_page() throws Throwable {
    	homepage hp = new homepage(driver);
        Assert.assertTrue(hp.tabs().isDisplayed());
    }

    @Then("^user clicks on login link$")
    public void user_clicks_on_login_link() throws Throwable {
    	homepage hp = new homepage(driver);
    	hp.login().click();
    }
    @Then("^user opens the login page$")
    public void user_opens_the_login_page() throws Throwable {
    	LoginPage lp = new LoginPage(driver);
        Assert.assertTrue(lp.logintext().isDisplayed());
    }
    
    @And("^user enters the (.+) in email field$")
    public void user_enters_the_in_email_field(String emailid) throws Throwable {
    	LoginPage lp = new LoginPage(driver);
    	lp.email().sendKeys(emailid);

    }

    @And("^user enters the (.+) in password field$")
    public void user_enters_the_in_password_field(String password) throws Throwable {
    	LoginPage lp = new LoginPage(driver);
    	lp.password().sendKeys(password);
    }
    @And("^user clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	LoginPage lp = new LoginPage(driver);
    	lp.loginbutton().click();
    }


}