package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    public DragScreen(AndroidDriver driver) {
        super(driver);
        addViewGroupMembersToElements();
        addImageGroupMembersToElements();

        addScreenElements(new WebElement[] {dragScreenTitle});
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    WebElement dragScreenTitle;

    int[] viewGroupMembers = {8, 10, 12, 14, 16, 18, 21, 24, 28};
    WebElement[] viewGroupMemberWebElements = new WebElement[viewGroupMembers.length];

    public void addViewGroupMembersToElements() {
        int index = 0;
        for (int i : viewGroupMembers) {
            String uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(" + i + ")";
            viewGroupMemberWebElements[index] = driver.findElement(AppiumBy.androidUIAutomator(uiAutomator));
            index++;
        }
        addScreenElements(viewGroupMemberWebElements);
    }

    int[] imageGroupMembers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    WebElement[] imageGroupMemberWebElements = new WebElement[viewGroupMembers.length];

    public void addImageGroupMembersToElements() {
        int index = 0;
        for (int i : imageGroupMembers) {
            String uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(" + i + ")";
            imageGroupMemberWebElements[index] = driver.findElement(AppiumBy.androidUIAutomator(uiAutomator));
            index++;
        }
        addScreenElements(imageGroupMemberWebElements);
    }

}
