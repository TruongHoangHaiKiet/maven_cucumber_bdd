package TechPanda.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.Navigation.PageGeneratorManager;
import pageObjects.user.MyDashboardPageObjects;
import pageObjects.user.UserHomePageObjects;
import pageObjects.user.UserRegisterPageObject;

public class RegisterPageSteps {
    WebDriver driver;
    MyDashboardPageObjects myDashboardPage;
    UserHomePageObjects homePage;
    public RegisterPageSteps() {
        driver = Hooks.openAndQuitBrowser();
        myDashboardPage = PageGeneratorManager.getMyDashboardPage(driver);
    }

}
