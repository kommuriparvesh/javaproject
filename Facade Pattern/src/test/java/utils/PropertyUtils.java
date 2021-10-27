package utils;
import java.io.IOException;
import java.io.InputStream; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
import java.util.Properties;
public class PropertyUtils { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    private static PropertyUtils INSTANCE = null;
    private final Properties props = new Properties(); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

    private PropertyUtils() {
        this.loadProperties("configuration.properties"); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        this.props.putAll(System.getProperties());
    }

    private static PropertyUtils getInstance() {
        if (PropertyUtils.INSTANCE == null) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            PropertyUtils.INSTANCE = new PropertyUtils();
        }
        return PropertyUtils.INSTANCE;
    }
    public static String getProperty(final String key) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        return PropertyUtils.getInstance().props.getProperty(key);
    }
    public static int getIntegerProperty(final String key, final int defaultValue) {
        int integerValue = 0; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        final String value = PropertyUtils.getInstance().props.getProperty(key);
        if (value == null) {
            return defaultValue; //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        }
        integerValue = Integer.parseInt(value);
        return integerValue;
    } 
    } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    public static String getProperty(final String key, final String defaultValue) {
        return PropertyUtils.getInstance().props.getProperty(key, defaultValue);
    }
    public void loadProperties(final String path) {
        InputStream inputStream = null;
        try { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            inputStream = ClassLoader.getSystemResourceAsStream(path);
            System.out.println(inputStream);
            if (inputStream != null) {
                this.props.load(inputStream); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
            } else {
                throw new UnableToLoadPropertiesException("property file '" + path + "' not found in the classpath");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (final IOException e) { //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
                e.printStackTrace();
            }
        } //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.

        return;
    }
    public static Properties getProps() {
        return PropertyUtils.getInstance().props;
    }
 //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
}

class UnableToLoadPropertiesException extends RuntimeException {

    UnableToLoadPropertiesException(final String s) {//The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
        super(s);
    }

    public UnableToLoadPropertiesException(final String string, final Exception ex) {
        super(string, ex); //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.
    }
} //The Page Object Pattern places all locators in the appropriate Page Object Classes, such as LoginPO, RegisterPO, DashboardPO, and so on.