package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwipeScreen extends BaseScreen {

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
        addScreenElements(new WebElement[]{
                swipeTitle,
                swipeSubTitle,
        });
    }

    public void swipeCard(){
        swipeAction(450,750,10,750);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    WebElement swipeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")")
    WebElement swipeSubTitle;

    @AndroidFindBy(accessibility = "WebdriverIO logo")
    WebElement robotImage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You found me!!!\")")
    WebElement robotText;

    @AndroidFindBy(xpath = "//*[@content-desc='card']")
    private List<WebElement> cards;

    public void goToLastCard(){
        for (int i = 0; i < 5; i++) {
            swipeCard();
        }
    }
    public void scrollDown(){
        swipeAction(400,450,400,10);
    }

    public void goToRobotImage(){
        for (int i = 0; i < 5; i++) {
            scrollDown();
        }
    }

    public int getCardsAmmount(){
        return cards.size();

    }

    public WebElement getRobotImage() {
        return robotImage;
    }

    public WebElement getRobotText() {
        return robotText;
    }

}

