package facebook.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;
    @Before("@parameter")
    public void open_facebook_application()  {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After("@parameter")
    public void close_application()  {
        driver.quit();
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

    @When("Input username textbox with \"([^\"]*)\"")
    public void inputToUsernameTextboxWith(String username){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @When("Input password textbox with \"([^\"]*)\"$")
    public void inputToPasswordTextboxWith(String password){
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("Input to username with \"([^\"]*)\" and password with \"([^\"]*)\"$")
    public void inputToUsernameWithAndPasswordWith(String username, String password){
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("^Input to username and password$")
    public void inputToUsernameAndPassword(DataTable table) {
//        List<Map<String, String>> customer = table.asMaps(String.class, String.class);
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys(customer.get(0).get("username"));
//
//        driver.findElement(By.id("pass")).clear();
//        driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("password"));

        for (Map<String, String> loginTable: table.asMaps(String.class, String.class)){
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(loginTable.get("username"));

            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys(loginTable.get("password"));
        }
    }


    @When("Click on login button")
    public void clickOnLoginButton(){
        driver.findElement(By.name("login")).isEnabled();
        driver.findElement(By.name("login")).click();
    }



}
