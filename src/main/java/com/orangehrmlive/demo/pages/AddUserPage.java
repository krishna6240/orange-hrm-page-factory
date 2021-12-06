package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userroledropdown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement empname;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement usernamefield;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusdropdown;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement userpassword;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmpasswordfield;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement save;


    public void selectOnUserRoleDropDown(String name) {
        Reporter.log(" Select userRole " + name + "to the select user drop down " + userroledropdown.toString() + "<br>");
        selectByValueFromDropDown(userroledropdown, name);
    }

    public void enterOnEmpName(String name) {
        Reporter.log(" Enter employee name" + name + "to the employee name " + empname.toString() + "<br>");
        sendTextToElement(empname, name);
    }
    public void EnterUserName(String name) {
        Reporter.log(" Enter user name" + name + "to the user name " + usernamefield.toString() + "<br>");
        sendTextToElement(usernamefield, name);
    }
    public void selectstatusStatusDropdown(String value) {
        Reporter.log(" Select user Status " + value + " to the select user ststus drop down " + statusdropdown.toString() + "<br>");
        sendTextToElement(statusdropdown, value);
    }
    public void enterPassword(String password) {
        Reporter.log(" Enter password" + password + "to the password" + userpassword.toString() + "<br>");
        sendTextToElement(userpassword, password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log(" Enter confirmpassword" + confirmPassword + "to the confirm password " + confirmpasswordfield.toString() + "<br>");
        sendTextToElement(confirmpasswordfield, confirmPassword);
    }
    public void ClickOnSave() {
        Reporter.log(" Click save button " + save.toString() + "<br>");
        clickOnElement(save);
    }
}


