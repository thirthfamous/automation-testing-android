package tests;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    AppiumDriver<MobileElement> driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = SettingDataWLB.createClearDesiredCabability();

        URL url = SettingDataWLB.createURL();
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("------- Testing Login Started --------");
    }

    @Test
    public void LoginEnterUsernamePasswordTest(){
        System.out.println("# Starting the LoginEnterUsernamePasswordTest() #");

        loginPage = new LoginPage(driver);
        loginPage.waitForActivityShowed();
        loginPage.loginToWLBApp("arief@wlb.co.id", "Sukses2121");

        homePage = new HomePage(driver);
        homePage.waitforHomePageShowed();

        Assertions.assertTrue(true);
    }

    @Test
    public void LoginWithWrongPassword(){
        System.out.println("# Starting the LoginAsWrongPassword() #");

        loginPage = new LoginPage(driver);
        loginPage.waitForActivityShowed();
        loginPage.loginToWLBApp("arief@wlb.co.id", "Passwordnyasalah");
        loginPage.waitForSnackBarValidUsernamePasswordShowed();
        Assertions.assertTrue(true);
    }

    @Test
    public void LoginWithWrongUsername(){
        System.out.println("# Starting the LoginWithWrongUsername() #");

        loginPage = new LoginPage(driver);
        loginPage.waitForActivityShowed();
        loginPage.loginToWLBApp("ariefz@wlb.co.id", "Sukses2121");
        loginPage.waitForSnackBarValidUsernamePasswordShowed();
        Assertions.assertTrue(true);
    }

    @Test
    public void LoginWithoutFillingAnything(){
        System.out.println("# Starting the LoginWithoutFillingAnything( #");

        loginPage = new LoginPage(driver);
        loginPage.waitForActivityShowed();
        loginPage.clickLoginBtn();
        loginPage.waitForSnackBarValidUsernamePasswordShowed();
        Assertions.assertTrue(true);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Login Testing Finished");
        driver.quit();
    }

}
