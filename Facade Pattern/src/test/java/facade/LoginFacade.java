package facade; //When writing automation test code, the Page Object Model is a common design pattern to follow.
import io.appium.java_client.AppiumDriver;  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import io.appium.java_client.android.AndroidDriver; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.DashboardPO; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
public class LoginFacade {  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
private AppiumDriver driver;  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
private LoginPO loginPO;  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
private DashboardPO dashboardPO; 

    public LoginFacade(AppiumDriver driver) { // Using the Page Object pattern is advantageous since locators and tests may be located in various locations and can utilise the method from the PO classes.
        this.driver = driver; // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public LoginPO getLoginPO() { 
    public LoginPO getLoginPO() {  // Using the Page Object pattern is advantageous since locators and tests may be located in various locations and can utilise the method from the PO classes.
    public LoginPO getLoginPO() {  
    public LoginPO getLoginPO() {  // Using the Page Object pattern is advantageous since locators and tests may be located in various locations and can utilise the method from the PO classes.
        if (loginPO == null) { // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
            loginPO = new LoginPO(driver);
            return loginPO; // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
        } else
            return loginPO;
    } // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
 

    public DashboardPO getDashboardPO() {
        if (dashboardPO == null) { // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
            dashboardPO = new DashboardPO(driver);
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
return dashboardPO;  // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
        } else
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
return dashboardPO;  // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
    } // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.

import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
public void loginAndLogout(String username, String password) {  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
getLoginPO().setUsernameTextField(username);  //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
getLoginPO().setPasswordTextField(password); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        getLoginPO().tapOnLoginButton(); // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
import pageobject.LoginPO; //When writing automation test code, the Page Object Model is a common design pattern to follow.
getDashboardPO().tapOnLogoutTextView();  // You must give the Appium Driver and the Implicit wait time objects to this function in order to initialise the AppiumFieldDecorator class.
    }
}
