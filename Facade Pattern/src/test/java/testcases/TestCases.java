package testcases; v
import org.testng.Assert;
import org.testng.annotations.BeforeTest; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import org.testng.annotations.Test;
import facade.LoginFacade;
import pageobject.LoginPO;
public class TestCases extends BaseTest {
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    @Test
    public void testUserCanLoginAndLogout() {
        String username = "jon";
        String password = "test123"; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

        LoginFacade loginFacade = new LoginFacade(driver);
        loginFacade.loginAndLogout(username, password); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

        Assert.assertTrue(new LoginPO(driver).isLoginPageDisplayed(), "Login Page did not appear after logout");
    }

    @BeforeTest //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    @Override
    public void setUpPage() { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    }
}//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
