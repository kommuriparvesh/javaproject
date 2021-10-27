package testcases; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import org.openqa.selenium.remote.Augmenter; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import org.testng.annotations.*;
import utils.PropertyUtils;
import utils.ScreenshotUtility;
import utils.WaitUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import java.net.URL;
import java.util.concurrent.TimeUnit;
@Listeners({ScreenshotUtility.class})
public abstract class BaseTest {
    public static AppiumDriver driver; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public final static String APPIUM_SERVER_URL = PropertyUtils.getProperty("appium.server.url", "http://127.0.0.1:4723/wd/hub");
    public final static int IMPLICIT_WAIT = PropertyUtils.getIntegerProperty("implicitWait", 30);
    public static WaitUtils waitUtils = new WaitUtils();
    @BeforeMethod
    public void setUpAppium() throws MalformedURLException { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        setDesiredCapabilitiesForAndroid(capabilities);
        driver = new AppiumDriver(new URL(APPIUM_SERVER_URL), capabilities);
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    @BeforeTest //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public abstract void setUpPage();
    @AfterMethod(alwaysRun = true) //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void afterMethod(final ITestResult result) throws IOException {
        String fileName = result.getTestClass().getName() + "_" + result.getName();
        System.out.println("Test Case: [" + fileName + "] executed..!");
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    @AfterClass
    public void afterClass() {
    }
    @AfterSuite //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void tearDownAppium() {
        quitDriver();
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    private void setDesiredCapabilitiesForAndroid(DesiredCapabilities desiredCapabilities) {
        String PLATFORM_NAME = PropertyUtils.getProperty("android.platform"); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        String PLATFORM_VERSION = PropertyUtils.getProperty("android.platform.version");
        String APP_NAME = PropertyUtils.getProperty("android.app.name");
        String APP_RELATIVE_PATH = PropertyUtils.getProperty("android.app.location") + APP_NAME;
        String APP_PATH = getAbsolutePath(APP_RELATIVE_PATH);
        String DEVICE_NAME = PropertyUtils.getProperty("android.device.name");
        String APP_PACKAGE_NAME = PropertyUtils.getProperty("android.app.packageName");
        String APP_ACTIVITY_NAME = PropertyUtils.getProperty("android.app.activityName");
        String APP_FULL_RESET = PropertyUtils.getProperty("android.app.full.reset");
        String APP_NO_RESET = PropertyUtils.getProperty("android.app.no.reset");
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        desiredCapabilities.setCapability(MobileCapabilityType.APP, APP_PATH);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, APP_FULL_RESET);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, APP_NO_RESET);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    public static WebDriver getScreenshotableWebDriver() { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        final WebDriver augmentedDriver = new Augmenter().augment(driver);
        return augmentedDriver;
    }
    private static void setTimeOuts(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    private static String getAbsolutePath(String appRelativePath) {
        File file = new File(appRelativePath);//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return file.getAbsolutePath();
    }
    private void quitDriver() {
        try {//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            this.driver.quit();
        } catch (Exception e) {
            e.printStackTrace(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        }
    }
}