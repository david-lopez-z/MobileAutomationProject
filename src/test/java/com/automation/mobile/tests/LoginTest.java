package com.automation.mobile.tests;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.loginScreens.LoginScreen;
import com.automation.mobile.utils.RandomUserGenerator;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest {
    protected final String EMAIL = RandomUserGenerator.generateRandomEmail();
    protected final String PASSWOWRD = RandomUserGenerator.generateRandomPassword();

    @BeforeMethod
    public void preconditions(){
        HomeScreen homeScreen = getHomeScreen();
        homeScreen.tapNavBarBtn(2);
        LoginScreen loginScreen = getLoginScreen();
        loginScreen.cleanScreen();
    }

    @Test
    public void firstTest(){
        LoginScreen loginScreen = getLoginScreen();
        loginScreen.swipeAction(330,1000,330,100);
        loginScreen.typeIntoEmail(EMAIL);
        loginScreen.typeIntoPassword(PASSWOWRD);
        loginScreen.submitLoginBtn();
        getWebDriverWait(SCREEN_LOAD_TIME);
        Assert.assertTrue(loginScreen.isElementDisplayed(loginScreen.getLoggedInTitle()));
        Assert.assertTrue(loginScreen.isElementDisplayed(loginScreen.getLoggedInOkBtn()));
        loginScreen.tapLoggedInOkBtn();
    }
}
