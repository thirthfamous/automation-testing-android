package helpers;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SettingDataWLB {
    public final static String APP_PACKAGE = "id.co.wlb.debug";

    public static DesiredCapabilities createLoggedInDesiredCabability(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");
        cap.setCapability("deviceName", "RMX1971");
        cap.setCapability("udid", "5b2407b0");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, SettingDataWLB.APP_PACKAGE);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wlb.framework.learning.ui.splash.SplashActivity");
        return cap;
    }

    public static DesiredCapabilities createClearDesiredCabability(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "RMX1971");
        cap.setCapability("udid", "5b2407b0");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, SettingDataWLB.APP_PACKAGE);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wlb.framework.learning.ui.splash.SplashActivity");
        return cap;
    }

    public static URL createURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }
}
