package pageobject; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import io.appium.java_client.pagefactory.AndroidFindBy;
public class LoginPO extends BasePO {
    public LoginPO(AppiumDriver driver) {
        super(driver);
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    @AndroidFindBy(id = "com.example.myapplication:id/username_textview")
    AndroidElement usernameTextField;
    public void setUsernameTextField(String username) {
        usernameTextField.sendKeys(username); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }
    @AndroidFindBy(id = "com.example.myapplication:id/password_textview")
    AndroidElement passwordTextField;
    public void setPasswordTextField(String password) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        passwordTextField.sendKeys(password);
    }
    @AndroidFindBy(id = "com.example.myapplication:id/loginButton") //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    AndroidElement loginButton;
    public void tapOnLoginButton() { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        loginButton.click(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public boolean isLoginPageDisplayed(){ //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return loginButton.isDisplayed();
    }
} //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
