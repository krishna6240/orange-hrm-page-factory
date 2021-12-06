package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'>')]")
    WebElement sysusertext;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userfield;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userrolldropdown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement empnamefield;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statuserdropdown;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchbtn;
    @FindBy(xpath = "//a[normalize-space()='krishna1203']")
    WebElement verifyresultlist;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addbtn;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deletbtn;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popup;
    @FindBy(css = "td[colspan='5']")
    WebElement NorecordFound;

    public String verifySystemUsers() {
      //  Reporter.log(" Verify System User" + text1 + " dispalyed " + sysusertext.toString() + "<br>");
        return getTextFromElement(sysusertext);
    }

    public void clickOnAddButton() {
        Reporter.log(" Click on Add Button" + addbtn.toString() + "<br>");
        clickOnElement(addbtn);
    }
    public void searchOnSystemUser(String name) {
        Reporter.log(" Search On System user" + name + "to the search on system user" + userfield.toString() + "<br>");
        sendTextToElement(userfield, name);
    }

    public void selectSearchUserRoll(String value) {
        Reporter.log(" Enter userRoll" + value + "to the search user roll" + userrolldropdown.toString() + "<br>");
        selectByValueFromDropDown(userrolldropdown, value);
    }

    public void selectSearchStatus(String value) {
        Reporter.log(" Search Status" + value + "to the search status" + statuserdropdown.toString() + "<br>");
        selectByValueFromDropDown(statuserdropdown, value);
    }

    public void clickOnSearchButton() {
        Reporter.log(" Click on search Button" + searchbtn.toString() + "<br>");
        clickOnElement(searchbtn);
    }

    public String verifyUserShouldBeINResultList() {
       // Reporter.log(" Verify user " + text1 + " to the user should be in result list " + verifyresultlist.toString() + "<br>");
        return getTextFromElement(verifyresultlist);
    }

    public void clickOnCheckBox() {
        Reporter.log(" Click on CheckBox" + checkBox.toString() + "<br>");
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton() {
        Reporter.log(" Click on Delete Button" + deletbtn.toString() + "<br>");
        clickOnElement(deletbtn);
    }

    public void clickokOnPopup() {
        Reporter.log(" Click on Popup" + popup.toString() + "<br>");
        mouseHoverToElement(popup);
        clickOnElement(popup);
    }

    public String VerifyMsgNoRecordFound() {
        //Reporter.log(" Verify No Record Found text " + text1 + " to be no record found msg verification " + NorecordFound.toString() + "<br>");
       return getTextFromElement(NorecordFound);

    }

}
