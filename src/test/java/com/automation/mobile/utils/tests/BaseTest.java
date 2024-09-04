package com.automation.mobile.utils.tests;

import com.automation.mobile.screens.*;
import com.automation.mobile.screens.loginScreens.LoginScreen;
import com.automation.mobile.screens.loginScreens.SignUpScreen;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    protected final int SCREEN_LOAD_TIME = 3;
    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    public static AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        loadProperties();
        UiAutomator2Options capabilites = new UiAutomator2Options();
        setUpCapabilites(capabilites);
        try {
            driver = new AndroidDriver(new URL(getProperties("appiumServerUrl")), capabilites);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file:" + PROPERTIES_FILE);
        }
    }

    public void setUpCapabilites(UiAutomator2Options capabilites) {
        capabilites.setPlatformName(getProperties(getProperties("platformName")));
        capabilites.setDeviceName(getProperties(getProperties("deviceName")));
        capabilites.setAppPackage(getProperties(getProperties("appPackage")));
        capabilites.setAppActivity(getProperties(getProperties("appActivity")));
    }

    public static String getProperties(String name) {
        return properties.getProperty(name);
    }

    public WebDriverWait getWebDriverWait(int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public WebviewScreen getWebViewScreen() {
        return new WebviewScreen(driver);
    }

    public FormsScreen getFormsScreen() {
        return new FormsScreen(driver);
    }

    public DragScreen getDragScreen() {
        return new DragScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }

    public HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
    }

    public SwipeScreen getSwipeScreen() {
        return new SwipeScreen(driver);
    }

    public SignUpScreen getSignUpScreen() {
        return new SignUpScreen(driver);
    }
}


