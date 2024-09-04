package com.automation.mobile.screens.loginScreens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends LoginScreen{
    public SignUpScreen(AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(accessibility = "input-repeat-password")
    WebElement confirmPassword;

    @AndroidFindBy(accessibility = "button-SIGN UP")
    WebElement signUpBtn;

    @AndroidFindBy(id = "android:id/alertTitle")
    WebElement signedUpTitle;

    @AndroidFindBy(id="android:id/button1")
    WebElement signedUpOkBtn;


    public void typeIntoConfirmPassword(String text){
        confirmPassword.sendKeys(text);
    }

    public void submitSignUpBtn(){
        signUpBtn.click();
    }

    public void tapSignedUpOkBtn(){
        signedUpOkBtn.click();
    }

    public WebElement getSignedUpOkBtn(){
        return signedUpOkBtn;
    }

    public WebElement getSignedUpTitle(){
        return signedUpTitle;
    }

    @Override
    public void cleanScreen(){
        emailInput.sendKeys("");
        passwordInput.sendKeys("");
        confirmPassword.sendKeys("");
    }
}
