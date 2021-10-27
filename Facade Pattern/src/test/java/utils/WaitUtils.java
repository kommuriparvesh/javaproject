package utils;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
public class WaitUtils {
    public final int explicitWaitDefault = PropertyUtils.getIntegerProperty("explicitWait", 10);

    public void staticWait(final long millis) {
        try { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (final InterruptedException e) {
        }
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void waitForElementToBeClickable(final WebElement element, final WebDriver driver) {
        new WebDriverWait(driver, this.explicitWaitDefault)
                .until(ExpectedConditions.elementToBeClickable(element)); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    public void waitForElementToBeInvisible(final By locator, final WebDriver driver) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        long s = System.currentTimeMillis();
        new WebDriverWait(driver, this.explicitWaitDefault)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForElementToBePresent(final By locator, final WebDriver driver) {
        new WebDriverWait(driver, this.explicitWaitDefault) //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitForElementToBeVisible(final By locator, final WebDriver driver) {
        new WebDriverWait(driver, this.explicitWaitDefault)
                .until(ExpectedConditions.visibilityOfElementLocated(locator)); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }
    public void waitForElementToBeVisible(final WebElement element, final WebDriver driver) {
        long s = System.currentTimeMillis();
        new WebDriverWait(driver, this.explicitWaitDefault).until(ExpectedConditions.visibilityOf(element));
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void waitForElementToBeVisible(final IOSElement element, final WebDriver driver, int time) {
        long s = System.currentTimeMillis();
        new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementsToBeInvisible(final List<WebElement> elements, final WebDriver driver) {
        final long s = System.currentTimeMillis(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        new WebDriverWait(driver, this.explicitWaitDefault)
                .until(ExpectedConditions.invisibilityOfAllElements(elements));
    }

    public void waitForElementToBeNotPresent(final By element, WebDriver driver) {
        long s = System.currentTimeMillis();
        new WebDriverWait(driver, this.explicitWaitDefault)
                .until(ExpectedConditions.not(ExpectedConditions.presenceOfAllElementsLocatedBy(element)));
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public void waitUntilNestedElementPresent(WebElement element, By locator, WebDriver driver) {
        new WebDriverWait(driver, explicitWaitDefault) //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                .until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, locator));
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
}
