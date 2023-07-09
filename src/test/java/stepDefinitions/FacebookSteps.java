package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;
    @Given("Open facebook application")
    public void open_facebook_application()  {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("Input to username textbox")
    public void inputToUsernameTextbox() {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("automationtestingUI@gmail.com");
    }

    @When("Input to password textbox")
    public void inputToPasswordTextbox() {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123123");
    }

    @When("Input to username textbox with \"\"")
    public void inputToUsernameTextbox(String username){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @When("Input to password textbox with \"\"")
    public void inputToPasswordTextbox(String password){
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }
    @When("Input to username textbox with (\\\\d+)$")
    public void inputToUsernameTextboxWith(String username){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @When("Input to password textbox with (\\\\d+)$")
    public void inputToPasswordTextboxWith(String password){
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("^Input to username with \"([^\"]*)\" and password with \"([^\"]*)\"$")
    public void inputToUsernameWithAndPasswordWith(String username, String password){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }


    @When("Click on login button")
    public void clickOnLoginButton() throws Throwable {
        driver.findElement(By.name("login")).isEnabled();
        driver.findElement(By.name("login")).click();
    }

    @Then("Close application")
    public void close_application()  {
        driver.quit();
    }
}
