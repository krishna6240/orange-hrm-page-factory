package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "img[alt='OrangeHRM']")
    WebElement OrangeHRMlogo;
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement Admin;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement PIM;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement Leave;
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement Dashboard;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement Welcome;
    public String verfiylogoDisplay1(){
        //Reporter.log(" Verify Dashbord text " + text1 + " dispalyed " + OrangeHRMlogo.toString() + "<br>");
        return getTextFromElement(OrangeHRMlogo);
    }
    public void ClickOnAdmin(){
        Reporter.log(" Click on AdminTab" + Admin.toString() + "<br>");
        clickOnElement(Admin);
        }
    public void ClickOnPIM(){
        Reporter.log(" Click on PIM " + PIM.toString() + "<br>");
        clickOnElement(PIM);
        }
    public void ClickOnLeave(){
        Reporter.log(" Click on Leave Tab" + Leave.toString() + "<br>");
        clickOnElement(Leave);
     }
    public void ClickOnDashboard(){
        Reporter.log(" Click on Dashboard" + Dashboard.toString() + "<br>");
        clickOnElement(Dashboard);
      }
    public String verifywelcomepaul() {
        //Reporter.log(" Verify Welcomepaul " + text1 + " dispalyed " + Welcome.toString() + "<br>");
        return getTextFromElement(Welcome);
    }

}
