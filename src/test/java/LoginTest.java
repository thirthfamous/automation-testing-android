import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    static AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");
        cap.setCapability("deviceName", "RMX1971");
        cap.setCapability("udid", "5b2407b0");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, SettingDataWLB.APP_PACKAGE);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wlb.framework.learning.ui.splash.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("------- Testing Login Started --------");
    }

    @Test
    public void LoginEnterUsernamePasswordTest(){
        System.out.println("# Starting the LoginEnterUsernamePasswordTest() #");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By
                .id("id.co.wlb.debug:id/etEmail")));

        MobileElement emailFormField = driver.findElement(By.id("id.co.wlb.debug:id/etEmail"));
        emailFormField.click();
        emailFormField.sendKeys("arief@wlb.co.id");

        MobileElement passwordFormField = driver.findElement(By.id("id.co.wlb.debug:id/etPassword"));
        passwordFormField.click();
        passwordFormField.sendKeys("Sukses2121");

        driver.findElement(By.id("id.co.wlb.debug:id/btn_login")).click();
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("id.co.wlb.debug:id/search")));
        Assertions.assertTrue(true);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Login Testing Finished");
        driver.quit();
    }

}
