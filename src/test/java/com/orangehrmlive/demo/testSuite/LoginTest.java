package com.orangehrmlive.demo.testSuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    SoftAssert softAssert;


    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt1() {
        softAssert = new SoftAssert();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.CliclOnLoginButton();
        String expectedTest = "Welcome Paul";
        String actualTest = homePage.verifywelcomepaul();
        softAssert.assertEquals(expectedTest, actualTest);
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
    public void VerifyThatTheLogoDisplayOnHomePage() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.CliclOnLoginButton();
        String expectedTest = "OrangeHRM";
        String actualTest = homePage.verfiylogoDisplay1();
        softAssert.assertEquals(expectedTest, actualTest);
        //softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void VerifyUserShouldLogOutSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.CliclOnLoginButton();
        loginPage.ClickOnUserProfileLogo();
        loginPage.mouseHoverAndClickOnLogout();
        String expectedTest = "LOGIN Panel";
        String actualTest = loginPage.verifyLoginPannel();
        softAssert.assertEquals(expectedTest, actualTest);
        softAssert.assertAll();
    }
}
