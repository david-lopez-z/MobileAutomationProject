package com.automation.mobile.screens.loginScreens;

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

    @AndroidFindBy(id = "android:id/titleDividerNoCustom")
    WebElement loggedInTitle;

    @AndroidFindBy(id="android:id/button1")
    WebElement loggedInOkBtn;

    public void typeIntoEmail(String text){
        emailInput.sendKeys(text);
    }

    public void typeIntoPassword(String text){
        passwordInput.sendKeys(text);
    }

    public void submitLoginBtn(){
        loginBtn.click();
    }

    public void tapSignUpTab(){
        signUpTab.click();
    }

    public void cleanScreen(){
        emailInput.sendKeys("");
        passwordInput.sendKeys("");
    }

    public void tapLoggedInOkBtn(){
        loggedInOkBtn.click();
    }

    public WebElement getLoggedInOkBtn(){
        return loggedInOkBtn;
    }

    public WebElement getLoggedInTitle(){
        return loggedInTitle;
    }
}
