package TechPanda.stepDefinitions;

import commons.basePage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.Navigation.PageGeneratorManager;
import pageObjects.user.UserHomePageObjects;
import pageObjects.user.UserLoginPageObjects;
import pageUIs.navigation.FooterContainerPageUI;

public class HomePageSteps extends basePage {
    WebDriver driver;
    UserHomePageObjects homePage;
    public HomePageSteps() {
        driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getUserHomePage(driver);
    }
    @Then("Click on My Account link")
    public void openMyAccountPageNotLogged()  {
        homePage.clickToMyAccountLink();
    }

//    public void openMyAccountPageNotLoggedd()  {
//        homePage.clickToMyAccountLink();
//    }
}
