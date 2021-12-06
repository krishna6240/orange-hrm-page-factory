package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends Utility {

    public DashboardPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement text;

        //By text = By.xpath("//h1[contains(text(),'Dashboard')]");

    public void ClickOnText(String text1){
            Reporter.log(" Verify Dashbord text " + text1 + " dispalyed " + text.toString() + "<br>");
            verifyText(text,text1);

        }


    }

