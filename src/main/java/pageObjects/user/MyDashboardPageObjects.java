package pageObjects.user;

import org.openqa.selenium.WebDriver;

import pageObjects.Navigation.SideBarMyAccountPageObjects;
import pageUIs.user.MyDashboardPageUI;

public class MyDashboardPageObjects extends SideBarMyAccountPageObjects {
	WebDriver driver;
	
	public MyDashboardPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public boolean getInfoContactText(String exptectedInfoContact) {
		waitForElementVisible(driver, MyDashboardPageUI.CONTACT_INFO_TEXT);
		String actualInfoContact = getElementText(driver, MyDashboardPageUI.CONTACT_INFO_TEXT);
		return actualInfoContact.contains(exptectedInfoContact);
	}

	public boolean isAccountInformationDisplay(String expectedUpdatedInfo) {
		waitForElementVisible(driver, MyDashboardPageUI.UPDATED_ACCOUNT_INFORMATION_MESS);
		String actualUpdatedInfo = getElementText(driver, MyDashboardPageUI.UPDATED_ACCOUNT_INFORMATION_MESS);
		return actualUpdatedInfo.contains(expectedUpdatedInfo);
	}

}
