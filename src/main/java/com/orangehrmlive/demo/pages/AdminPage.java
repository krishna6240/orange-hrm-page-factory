package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    public AdminPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement job;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organizationTabs;

    public void ClickOnUserMgt(){
        Reporter.log(" Click on user mgt" + userManagement.toString() + "<br>");
        clickOnElement(userManagement);
     }
    public void ClickOnjob(){
        Reporter.log(" Click on job tab" + job.toString() + "<br>");
        clickOnElement(job);
    }
    public void ClickOnOrgTabs(){
        Reporter.log(" Click on Organization tab" + organizationTabs.toString() + "<br>");
        clickOnElement(organizationTabs);
    }
}
