package com.automation.mobile.tests;

import com.automation.mobile.screens.*;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    private final int SCREEN_LOAD_TIME = 5;

    @BeforeMethod
    public void preconditions(){
        HomeScreen homeScreen = getHomeScreen();
        homeScreen.tapNavBarBtn(0);
    }

    @Test
    public void firstTest(){
        //Verify all elements in home screen
        HomeScreen homeScreen = getHomeScreen();
        Assert.assertTrue(homeScreen.verifyAllItems());
        homeScreen.tapNavBarBtn(1);
        getWebDriverWait(SCREEN_LOAD_TIME);

        //verify all elements in webview screen
        WebviewScreen webviewScreen = getWebViewScreen();
        Assert.assertTrue(webviewScreen.verifyAllItems());
        webviewScreen.tapNavBarBtn(2);
        getWebDriverWait(SCREEN_LOAD_TIME);

        //Verify all elements in login screen
        LoginScreen loginScreen = getLoginScreen();
        Assert.assertTrue(loginScreen.verifyAllItems());
        loginScreen.tapNavBarBtn(3);
        getWebDriverWait(SCREEN_LOAD_TIME);

        //Verify all elements in forms screen
        FormsScreen formsScreen = getFormsScreen();
        Assert.assertTrue(formsScreen.verifyAllItems());
        loginScreen.tapNavBarBtn(4);
        getWebDriverWait(SCREEN_LOAD_TIME);

        //verify all elements in swipe screen
        SwipeScreen swipeScreen = getSwipeScreen();
        Assert.assertTrue(getSwipeScreen().verifyAllItems());
        swipeScreen.tapNavBarBtn(5);
        getWebDriverWait(SCREEN_LOAD_TIME);

        //verify all elements in drag screen
        DragScreen dragScreen = getDragScreen();
        Assert.assertTrue(dragScreen.verifyAllItems());
    }
}