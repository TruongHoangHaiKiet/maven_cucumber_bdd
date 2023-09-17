package pageObjects.user;

import commons.basePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.CommonPageUI;

public class CommonPageObject extends basePage {
    WebDriver driver;
    public CommonPageObject(WebDriver mapDriver){
        driver =  mapDriver;
    }

    /** Common function for Web Component **/
    public void inputToTextboxByID(WebDriver driver, String fieldName, String valueToInput) {
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX_BY_ID, fieldName);
        sendkeyToElement(driver,  CommonPageUI.DYNAMIC_TEXTBOX_BY_ID, valueToInput, fieldName);
    }

    public void clickButtonByTitle(WebDriver driver, String fieldName) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TITLE, fieldName);
        clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON_BY_TITLE, fieldName);
    }

    public String getFieldErrorMessageByID(WebDriver driver, String fieldName) {
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_FIELD_ERROR_MESSAGE_BY_ID, fieldName);
        return getElementText(driver, CommonPageUI.DYNAMIC_FIELD_ERROR_MESSAGE_BY_ID, fieldName);
    }

    public void selectDefaultDropdownByID(WebDriver driver, String dropdownID, String itemText) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_ID, dropdownID);
        selectItemInDefaultDropdown(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_ID, itemText, dropdownID);

    }

    public boolean isMessageDisplay (WebDriver driver, String message, String messageType){
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_PAGE_MESSAGE, messageType);
        String actualMessage = getElementText(driver, CommonPageUI.DYNAMIC_PAGE_MESSAGE, messageType);
        return actualMessage.equals(message);
    }
}
