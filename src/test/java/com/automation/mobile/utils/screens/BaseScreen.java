package com.automation.mobile.utils.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class BaseScreen {
    protected AndroidDriver driver;
    protected ArrayList<WebElement> screenElements;

    public final String[] buttonNames = {
            "Home",
            "Webview",
            "Login",
            "Forms",
            "Swipe",
            "Drag"
    };

    private WebElement[] navBarBtns;

    public  BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        setAllNavBarBtns();
    }

    private void setAllNavBarBtns() {
        navBarBtns = new WebElement[buttonNames.length];
        int index = 0;
        for (String buttonName : buttonNames) {
            navBarBtns[index] = driver.findElement(AppiumBy.accessibilityId(buttonName));
            index++;
        }
    }

    public void swipeAction(int x1, int y1, int x2, int y2) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x1, y1));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(new Pause(finger, Duration.ofMillis(200)));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), x2, y2));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }

    public void addScreenElements(WebElement[] elements){
        screenElements.addAll(Arrays.asList(elements));
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public WebElement getNavBarBtn(int index) {
        return navBarBtns[index];
    }

    public void tapNavBarBtn(int index){
        getNavBarBtn(index).click();
    }

    public boolean verifyAllItems(){
        for (WebElement element: screenElements){
            if (!element.isDisplayed()) return false;
        }
        return true;
    };
}