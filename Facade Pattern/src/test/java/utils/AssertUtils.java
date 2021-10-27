package utils;
import org.testng.Assert;
import java.util.List; 
public class AssertUtils { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public static void assertListEquals(List actualList, List expectedList, String listName) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        assertListContains(actualList, expectedList, listName);
        Assert.assertEquals(actualList.size(), expectedList.size(), //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                "Value count in list" + listName + "  didn't match. \nExpected list values:  " + expectedList + ", \nActual List values:  " + actualList);
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public static void assertListEqualsWithOrder(List actualList, List expectedList, String listName) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        assertListEquals(actualList, expectedList, listName);
        Assert.assertEquals(actualList, expectedList,
                "List order didn't match, \nExpected: " + expectedList + "\nActual: " + actualList); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    public static void assertListContains(List actualList, List expectedList, String listName) {
        for (Object expectedValue : expectedList) {
            Assert.assertTrue(actualList.contains(expectedValue),
                    "Value (" + expectedValue + ") is not present in List '" + listName + "'. \nActual list values: " //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                            + actualList + "\nExpected list values: " + expectedList);
        }
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public static void assertListNotContains(List actualList, List expectedList, String listName) {
        for (Object expectedValue : expectedList) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            Assert.assertTrue(!actualList.contains(expectedValue), "Value (" + expectedValue + ") is present in List '"
                    + listName + "'. \nActual list values: " + actualList + "\nExpected list values: " + expectedList);
        }
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

}
