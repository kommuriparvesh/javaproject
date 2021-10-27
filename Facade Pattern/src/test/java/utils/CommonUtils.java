package utils;
import java.math.BigDecimal;
import java.text.DecimalFormat;//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CommonUtils {
    public static int getRandomNumber() {
        final Random rand = new Random();
        return rand.nextInt(10000) + 1;
    }

    public static int getRandomNumber(final int value) {//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        final Random rand = new Random();
        return rand.nextInt(value) + 1;
    }

    public static long getMinNumber() {//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        final long maxNum = 40000000000000L;
        return maxNum - System.currentTimeMillis();
    }

    public static StringBuilder appendToString(StringBuilder url, Map elements) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        Iterator it = elements.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            url = url.append(pair.getKey()).append("=").append(pair.getValue()).append("&");
        } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return url;
    }

    public static void getDates(int startOffset, int endOffset, List<Long> dateList) {
        Date date = new Date();
        Calendar startDate = Calendar.getInstance(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        startDate.setTime(date);
        startDate.add(Calendar.DATE, startOffset);
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(date);
        endDate.add(Calendar.DATE, endOffset);
        dateList.add(startDate.getTimeInMillis());
        dateList.add(endDate.getTimeInMillis());
    }

    public static BigDecimal getBigDecimal(int value, int scale) {
        return BigDecimal.valueOf(value).setScale(scale);
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public static BigDecimal getBigDecimal(int value) {
        return getBigDecimal(value, 2);
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public static BigDecimal getBigDecimal(double value, int scale) {
        return BigDecimal.valueOf(value).setScale(scale);
    }

    public static BigDecimal getBigDecimal(String value, int scale) {
        return BigDecimal.valueOf(Double.valueOf(value)).setScale(scale);
    }

    public static BigDecimal getBigDecimal(double value) {//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on. 
        return getBigDecimal(value, 2);
    }

    public long getStartDate(Date date, int offset, String timeZone) {
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        calendar.setTime(date);
        calendar.add(Calendar.DATE, offset);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    public long getStartDate(Date date, String timeZone) {
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    public long getEndDate(Date date, int offset, String timeZone) {
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        calendar.setTime(date);
        calendar.add(Calendar.DATE, offset);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return calendar.getTimeInMillis();
    }

    public long getEndDate(Date date, String timeZone) {
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }
    public List<String> getRegexValue(String input, String methodName) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        String entityInput = input.split(methodName)[1];
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher match = pattern.matcher(entityInput);
        match.find();
        String value = match.group(1);
        String[] array = value.split(",");
        List<String> matchedItemlist = new ArrayList<String>();
        if (array != null && array.length > 1) {
            matchedItemlist.add(array[0]);
            matchedItemlist.add(array[1]);
        }
        return matchedItemlist;
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public String getFormattedNumber(BigDecimal num, int fractionDigit) {
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMinimumFractionDigits(fractionDigit);
        return formatter.format(num);
    }

    public static String getNumericValueFromString(String input) {
        Pattern pattern = Pattern.compile("[0-9,\\.]*$");
        Matcher match = pattern.matcher(input);
        match.find(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        String value = match.group(0);
        return value;
    }


    public static String getNumericValueWithCurrenySymbolFromString(String input) {
        Pattern pattern = Pattern.compile("[0-9,\\.\\$]*$");
        Matcher match = pattern.matcher(input);
        match.find();
        String value = match.group(0);
        return value;
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public static String getFormattedValueForLongField(long value) {
        NumberFormat df = new DecimalFormat("###,##0");
        return df.format(value);
    }
    public static String toNumericString(Boolean arg) {
        return (arg == null) ? null : arg.booleanValue() ? "1" : "0";
    }
}
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.