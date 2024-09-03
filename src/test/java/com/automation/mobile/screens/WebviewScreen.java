package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebviewScreen extends BaseScreen {
    public WebviewScreen(AndroidDriver driver){
        super(driver);
        addScreenElements(new WebElement[]{
                burguerMenu,
                webdriverIOLogo,
                searchIcon,
                robotImage,
                miniRobotImage
        });
    }
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Toggle navigation bar\")")
    private WebElement burguerMenu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"WebdriverIO\")")
    private WebElement webdriverIOLogo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    private WebElement searchIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO\").instance(1)")
    private WebElement robotImage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO AI Copilot\")")
    private WebElement miniRobotImage;


}
