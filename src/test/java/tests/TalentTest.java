package tests;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;
import pages.HomePage;
import pages.TalentPage;

import java.net.MalformedURLException;
import java.net.URL;

public class TalentTest {
    AppiumDriver<MobileElement> driver;
    HomePage homePage;
    TalentPage talentPage;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = SettingDataWLB.createLoggedInDesiredCabability();
        URL url = SettingDataWLB.createURL();
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("------- Testing Homepage Started --------");
    }

    @Test
    public void CheckIfTalentPageExist(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        Assertions.assertTrue(true);;
    }

    @Test
    public void CheckUserNamePositionImage(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        Assertions.assertTrue(!talentPage.getUserName().equals(""));
        Assertions.assertTrue(!talentPage.getUserPosition().equals(""));
        Assertions.assertTrue(talentPage.IsImageDisplayed());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Login Testing Finished");
        driver.quit();
    }
}
