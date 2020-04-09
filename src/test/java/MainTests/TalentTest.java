package MainTests;

import Pages.EditTalentInformationPage;
import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import Pages.HomePage;
import Pages.TalentPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

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
    public void CheckIfTalentPageExistTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();

        Assertions.assertTrue(true);;
    }

    @Test
    public void CheckUserNamePositionImageTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();

        Assertions.assertTrue(!talentPage.getUserName().getText().equals(""));
        Assertions.assertTrue(!talentPage.getUserPosition().getText().equals(""));
        Assertions.assertTrue(talentPage.getUserImage().isDisplayed());
    }

    @Test
    public void CheckTalentInformationTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();

        Assertions.assertTrue(!talentPage.getRiskOfLoss().getText().equals(""));
        Assertions.assertTrue(!talentPage.getImpactOfLoss().getText().equals(""));
        Assertions.assertTrue(!talentPage.getFutureLeader().getText().equals(""));
        Assertions.assertTrue(!talentPage.getTalentMobility().getText().equals(""));
    }

    @Test
    public void EditTalentInformationTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        String talentMobility = talentPage.getTalentMobility().getText()+"b";
        talentPage.clickTalentInformation();

        EditTalentInformationPage editTalentInformationPage = new EditTalentInformationPage(driver);

        /**
         * State Awal : MLY
         * State Programmed : HHN
         */
        String riskOfLoss = "High";
        String impactOfLoss = "High";
        String futureLeader = "No";

        editTalentInformationPage.setTalentInformationHHN();

        Assertions.assertTrue(talentPage.getRiskOfLoss().getText().equals(riskOfLoss));
        Assertions.assertTrue(talentPage.getImpactOfLoss().getText().equals(impactOfLoss));
        Assertions.assertTrue(talentPage.getFutureLeader().getText().equals(futureLeader));
        Assertions.assertTrue(talentPage.getTalentMobility().getText().equals(talentMobility));

        talentPage.clickTalentInformation();
        editTalentInformationPage.setTalentInformationMLY();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Login Testing Finished");
        driver.quit();
    }
}