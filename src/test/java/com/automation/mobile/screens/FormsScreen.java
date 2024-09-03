package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    public FormsScreen(AndroidDriver driver) {
        super(driver);

        addScreenElements(new WebElement[]{
                formComponentsTitle,
                inputFieldText,
                textInput,
                youHaveTypedText,
                textInputResult,
                switchText,
                switchBtn,
                clickToTurnSwitchText,
                dropDownText
        });
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    WebElement formComponentsTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input field:\")")
    WebElement inputFieldText;

    @AndroidFindBy(accessibility = "text-input")
    WebElement textInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You have typed:\")")
    WebElement youHaveTypedText;

    @AndroidFindBy(accessibility = "input-text-result")
    WebElement textInputResult;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Switch:\")")
    WebElement switchText;

    @AndroidFindBy(accessibility = "switch")
    WebElement switchBtn;

    @AndroidFindBy(accessibility = "switch-text")
    WebElement clickToTurnSwitchText;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dropdown:\")")
    WebElement dropDownText;


}