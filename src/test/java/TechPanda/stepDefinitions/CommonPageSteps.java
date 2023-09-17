package TechPanda.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.Navigation.PageGeneratorManager;
import pageObjects.user.CommonPageObject;
import pageUIs.user.RegisterPageUI;
import utilities.Data_Faker;

public class CommonPageSteps {
    WebDriver driver;
    CommonPageObject commonPage;

    Data_Faker dataFaker;
    String email, firstname, lastname;

    public CommonPageSteps(){
        driver = Hooks.openAndQuitBrowser();
        commonPage = PageGeneratorManager.getCommonPage(driver);
        dataFaker = Data_Faker.getDataFaker();
        email = dataFaker.getEmailAddress();
        firstname = dataFaker.getFirstName();
        lastname = dataFaker.getLastName();
    }
    @Given("Log out user")
    public void logOutUser()  {
        commonPage.clickOnUserLogOutLink(driver);
    }

    @When("Click on \"([^\"]*)\" button")
    public void clickOnButton(String buttonValue)  {
        commonPage.clickButtonByTitle(driver,buttonValue);
    }

    @When("Input \"([^\"]*)\" to textbox with value \"([^\"]*)\"")
    public void inputInfoToTextboxWithValue(String fieldName, String inputValue)  {
        if (fieldName.equals("email_address")){
            inputValue = email;
        }else if (fieldName.equals("firstname")){
            inputValue = firstname;
        } else if (fieldName.equals("lastname")) {
            inputValue = lastname;
        }
        commonPage.inputToTextboxByID(driver, fieldName, inputValue);
    }

    @When("Click on Register button")
    public void clickOnRegisterButton()  {
        commonPage.waitForElementClickable(driver, RegisterPageUI.REGISTER_BTN);
        commonPage.clickToElement(driver, RegisterPageUI.REGISTER_BTN);
    }

    @Then("Display success message at \"([^\"]*)\" with content \"([^\"]*)\"")
    public void displaySuccessMessage(String messageType, String expectedMessage)  {
        Assert.assertTrue(commonPage.isMessageDisplay(driver,expectedMessage, messageType));
    }
}
