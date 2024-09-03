package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    public LoginScreen(AndroidDriver driver){
        super(driver);

        addScreenElements(new WebElement[]{
                loginOrSignUpText,
                loginTab,
                signUpTab,
                emailInput,
                passwordInput,
                loginBtn
        });
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\'Login / Sign up Form\')")
    WebElement loginOrSignUpText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\").instance(0)")
    WebElement loginTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    WebElement signUpTab;

    @AndroidFindBy(accessibility = "input-email")
    WebElement emailInput;

    @AndroidFindBy(accessibility = "input-password")
    WebElement passwordInput;

    @AndroidFindBy(accessibility = "button-LOGIN")
    WebElement loginBtn;
}
