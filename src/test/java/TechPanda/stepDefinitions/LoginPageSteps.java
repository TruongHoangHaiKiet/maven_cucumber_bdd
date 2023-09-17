package TechPanda.stepDefinitions;

import commons.GlobalConstants;
import commons.basePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.user.MyDashboardPageObjects;
import pageObjects.user.UserLoginPageObjects;

public class LoginPageSteps extends basePage {

    WebDriver driver;
    UserLoginPageObjects loginPage;
    MyDashboardPageObjects myDashboardPage;
    String emailAddress = "automationfc0812.vn@gmail.com";
    String password = "123123";

    public LoginPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        loginPage = new UserLoginPageObjects(driver);
    }

    @Given("Open Login Page URL")
    public void openLoginPageURL() {
        driver.get(GlobalConstants.LIVE_USER_URL);
    }

    @When("Input valid email address and password")
    public void inputValidEmailAddressAndPassword()  {
        loginPage.inputToTextboxByID(driver, "email", emailAddress);
        loginPage.inputToTextboxByID(driver, "pass", password);
    }

    @When("Click on Login button")
    public void clickOnLoginButton()  {
        myDashboardPage = loginPage.clickButtonByTitle(driver, "Login");
    }

    @Then("Verify contact info")
    public void verifyLoginPageDisplay() {
        Assert.assertTrue(myDashboardPage.getInfoContactText("Automation FC"));
        Assert.assertTrue("Correct info email",myDashboardPage.getInfoContactText("automationfc0812.vn@gmail.com"));
    }
}
