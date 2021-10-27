package utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class StringUtils { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public String getFirstWordFromString(final String s) {
        String firstWord = null;

        if (s.contains(" ")) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            firstWord = s.substring(0, s.indexOf(" "));
        } else {
            firstWord = s;
        } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return firstWord;
    }

    public String getLastWordFromString(final String s) {
        final String lastWord = s.substring(s.lastIndexOf(" ") + 1); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

        return lastWord;
    }

    public String getTimeStamp() { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        final String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss")
                .format(Calendar.getInstance().getTime());
        return timeStamp; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }

    public String trimParenthesisValues(final String s) {

        String str = s.substring(0, s.indexOf("(")).trim(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return str;
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public List<String> trimParenthesisValues(final List<String> str) {

        List<String> string = new ArrayList<String>();
        for (int i = 0; i < str.size(); i++) {
            string.add(trimParenthesisValues(str.get(i))); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        }
        return string;
    }
}