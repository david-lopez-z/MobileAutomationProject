package com.automation.mobile.tests;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.SwipeScreen;
import com.automation.mobile.utils.tests.BaseTest;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    @BeforeMethod
    public void preconditions() {
        HomeScreen homeScreen = getHomeScreen();
        homeScreen.tapNavBarBtn(4);
    }


    @Test
    public void swipeTest(){
        SwipeScreen swipeScreen = getSwipeScreen();
        Assert.assertEquals(swipeScreen.getCardsAmmount(), 2);
        swipeScreen.goToLastCard();
        getWebDriverWait(SCREEN_LOAD_TIME);
        Assert.assertEquals(swipeScreen.getCardsAmmount(), 1);
        swipeScreen.goToRobotImage();
        getWebDriverWait(SCREEN_LOAD_TIME);
        Assert.assertTrue(swipeScreen.isElementDisplayed(swipeScreen.getRobotImage()));
        Assert.assertTrue(swipeScreen.isElementDisplayed(swipeScreen.getRobotText()));
    }
}