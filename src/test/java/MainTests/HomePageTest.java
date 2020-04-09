package MainTests;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import Pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class HomePageTest {
    AppiumDriver<MobileElement> driver;
    HomePage homePage;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = SettingDataWLB.createLoggedInDesiredCabability();
        URL url = SettingDataWLB.createURL();
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("------- Testing Homepage Started --------");
    }

    @Test
    public void ClickTalentMenuTest(){
        System.out.println("# Starting the ClickTalentMenu() #");

        homePage = new HomePage(driver);
        homePage.showTalentPage();
        Assertions.assertTrue(true);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("HomePage Testing Finished");
        driver.quit();
    }
}
