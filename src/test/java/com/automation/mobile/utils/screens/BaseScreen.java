package com.automation.mobile.utils.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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

    public void addScreenElements(WebElement[] elements){
        screenElements.addAll(Arrays.asList(elements));
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