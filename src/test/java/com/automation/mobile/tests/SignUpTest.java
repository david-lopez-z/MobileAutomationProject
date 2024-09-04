package com.automation.mobile.tests;

import com.automation.mobile.screens.*;
import com.automation.mobile.screens.loginScreens.LoginScreen;
import com.automation.mobile.screens.loginScreens.SignUpScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends LoginTest {

    @BeforeMethod
    public void preconditions() {
        HomeScreen homeScreen = getHomeScreen();
        homeScreen.tapNavBarBtn(2);
        LoginScreen loginScreen = getLoginScreen();
        loginScreen.cleanScreen();
    }

    @Test
    public void firstTest() {
        LoginScreen loginScreen = getLoginScreen();
        loginScreen.tapSignUpTab();
        getWebDriverWait(SCREEN_LOAD_TIME);
        SignUpScreen signUpScreen = getSignUpScreen();
        signUpScreen.swipeAction(330, 1000, 330, 100);
        signUpScreen.typeIntoEmail(EMAIL);
        signUpScreen.typeIntoPassword(PASSWOWRD);
        signUpScreen.typeIntoConfirmPassword(PASSWOWRD);
        signUpScreen.submitSignUpBtn();
        getWebDriverWait(SCREEN_LOAD_TIME);
        Assert.assertTrue(signUpScreen.isElementDisplayed(signUpScreen.getSignedUpTitle()));
        Assert.assertTrue(signUpScreen.isElementDisplayed(signUpScreen.getSignedUpOkBtn()));
        signUpScreen.tapSignedUpOkBtn();
    }
}
