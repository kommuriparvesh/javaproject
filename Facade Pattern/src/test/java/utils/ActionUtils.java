package utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;
public class ActionUtils {

    public void tapOnElement(AndroidElement androidElement, AndroidDriver driver) {
        new TouchAction(driver) //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                .tap(tapOptions().withElement(element(androidElement)))
                .perform();
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public void tapOnElementForParticularDuration(AndroidElement androidElement, AndroidDriver driver, long millis) {
        new TouchAction(driver)
                .tap(tapOptions().withElement(element(androidElement)))
                .waitAction(waitOptions(Duration.ofMillis(millis))).perform(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    public void tapOnCoordinates(AndroidDriver driver, int x, int y) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        new TouchAction(driver)
                .tap(point(x, y)) //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                .perform();
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void tapOnCoordinates(AndroidDriver driver, int x, int y, long millis) {
        new TouchAction(driver)
                .tap(point(x, y))
                .waitAction(waitOptions(Duration.ofMillis(millis))).perform(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }


}
