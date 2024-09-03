package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
        addScreenElements(new WebElement[]{
                swipeTitle,
                swipeSubTitle,
                githubCard
        });
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    WebElement swipeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")")
    WebElement swipeSubTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"card\").instance(0)")
    WebElement githubCard;
}

