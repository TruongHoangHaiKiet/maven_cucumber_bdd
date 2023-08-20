package pageObjects.user;

import org.openqa.selenium.WebDriver;

import commons.basePage;
import pageObjects.Navigation.PageGeneratorManager;
import pageUIs.user.LoginPageUI;

public class UserLoginPageObjects extends basePage {
	WebDriver driver;
	
	public UserLoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	// Action objects
	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_ADDRESS_TEXTBOX, emailAddress);	
	}
	
	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);	
	}
	
	public MyDashboardPageObjects clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BTN);
		clickToElement(driver, LoginPageUI.LOGIN_BTN);
		return PageGeneratorManager.getMyDashboardPage(driver);
	}
	
	public String getEmailEmptyErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_EMPTY_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_EMPTY_ERROR_MESSAGE);
	}

	public String getPasswordEmptyErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
	}
	
	public String getEmailInvalidErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_INVALID_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_INVALID_ERROR_MESSAGE);
	}

	public String getEmailIncorrectErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_INCORRECT_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_INCORRECT_ERROR_MESSAGE);
	}

	public String getPasswordInvalidErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
	}

	public String getPasswordIncorrectErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_INCORRECT_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.PASSWORD_INCORRECT_ERROR_MESSAGE);
	}

}
