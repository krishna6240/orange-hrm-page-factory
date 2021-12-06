package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement usernamefield;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordfield;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement LoginButton;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userprofilelogo;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement verifyloginpanel;

     public void enterUserName(String username) {
         Reporter.log(" Enter User name" + username + "to the Username" + usernamefield.toString() + "<br>");
         sendTextToElement(usernamefield, username);
     }

    public void enterPassword(String password) {
        Reporter.log(" Enter password" + password + "to the password" + passwordfield.toString() + "<br>");
        sendTextToElement(passwordfield, password);
    }

    public void CliclOnLoginButton() {
        Reporter.log(" Click on Login Tab" + LoginButton.toString() + "<br>");
         clickOnElement(LoginButton);
    }

      public void ClickOnUserProfileLogo() {
        Reporter.log(" Click on user Profile Logo Tab" + userprofilelogo.toString() + "<br>");
        clickOnElement(userprofilelogo);
    }

    public void mouseHoverAndClickOnLogout() {
        Reporter.log(" Click on Logout Tab" + logout.toString() + "<br>");
        mouseHoverToElement(logout);
        mouseHoverToElementAndClick(logout);
    }

    public String verifyLoginPannel() {
        //Reporter.log(" Verify Dashbord text " + text1 + " dispalyed " + verifyloginpanel.toString() + "<br>");
     return getTextFromElement(verifyloginpanel);

    }
}
