package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"sanity","smoke","regression"})

    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown(){
        closeBrowser();
    }
}

