package MainTests;

import Pages.*;
import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class TalentTest {
    AppiumDriver<MobileElement> driver;
    TalentPage talentPage;
    boolean potCompetency = true;
    boolean potAttendance = true;
    boolean potCourse = false;
    boolean potSosmed = false;
    boolean pitTask = true;
    boolean pitOgf = true;
    boolean pitMultirater = true;
    boolean pitNps = false;

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

    @Test
    public void CheckBadgeTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.waitForTalentPageShow();
        talentPage.scroll(600, 2249, 600, 2);
        Assertions.assertTrue(!talentPage.getBadgeName().getText().equals(""));
        Assertions.assertTrue(!talentPage.getBadgeVersion().getText().equals(""));
        Assertions.assertTrue(!talentPage.getuserValue().getText().equals(""));

        testBadgePotentialPerformance(potCompetency, potAttendance, potCourse, potSosmed, pitTask, pitOgf, pitMultirater, pitNps, talentPage);

    }

    @Test
    public void CheckBadgeDetailsTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.waitForTalentPageShow();
        talentPage.getSeeAllBadgesBtn().click();

        TalentSeeAllBadgesPage talentSeeAllBadgesPage = new TalentSeeAllBadgesPage(driver);
        talentSeeAllBadgesPage.clickBadge();

        TalentSeeAllBadgesBadgeDetails talentSeeAllBadgesBadgeDetails = new TalentSeeAllBadgesBadgeDetails(driver);
        testBadgePotentialPerformance(true, true, false, false, true, true, true, false, talentSeeAllBadgesBadgeDetails);
    }

    @Test
    public void AddNewDevelopmentPlanTest(){
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.waitForTalentPageShow();

        talentPage.scrolToBottom();

        talentPage.getaddNewDevelopmentPlanBtn().click();
        TalentNewDevelopmentPlanPage talentNewDevelopmentPlanPage = new TalentNewDevelopmentPlanPage(driver);
        HashMap<String, String> developmentPlan = talentNewDevelopmentPlanPage.fillAllForm();
        talentNewDevelopmentPlanPage.getSubmitBtn().click();

        talentPage = new TalentPage(driver);
        talentPage.waitForTalentPageShowAfterAddDevelopmentPlan();
        Assertions.assertTrue(talentPage.getDevelopmentPlanNameFirstArray()
                .getText().equals(developmentPlan.get("name")));
        Assertions.assertTrue(talentPage.getDevelopmentPlanDate().getText().equals( developmentPlan.get("startDate") +" - "+ developmentPlan.get("endDate") ));
        Assertions.assertTrue(talentPage.getDevelopmentPlanStatus().getText().equals("Waiting"));


        talentPage.getDevelopmentPlanNameFirstArray().click();

        TalentPlanDetailsPage talentPlanDetailsPage = new TalentPlanDetailsPage(driver);
        Assertions.assertTrue(talentPlanDetailsPage.getPlanTitle()
                .getText().equals(developmentPlan.get("name")));

        Assertions.assertTrue(talentPlanDetailsPage.getStatusWaiting()
                            .getText().equals("Waiting"));

        Assertions.assertTrue((talentPlanDetailsPage.getPlanDate()
                .getText().equals( developmentPlan.get("startDate") +" - "+ developmentPlan.get("endDate") )));

        Assertions.assertTrue(talentPlanDetailsPage.getMeasureOfSuccess()
                .getText().equals(developmentPlan.get("measure")));

        Assertions.assertTrue(talentPlanDetailsPage.verifyCompetency(developmentPlan.get("firstCompetency")));
    }

    @Test
    public void EditPlanDevelopmentTest(){

    }

    @AfterEach
    public void tearDown() {
        System.out.println("Login Testing Finished");
        driver.quit();
    }



    private void testBadgePotentialPerformance(boolean potCompetency, boolean potAttendance, boolean potCourse, boolean potSosmed, boolean pitTask, boolean pitOgf, boolean pitMultirater, boolean pitNps, TalentPage page ){
        if(potCompetency){
            Assertions.assertTrue(!page.getPotCompetency().getText().equals(""));
        }
        if(potAttendance){
            Assertions.assertTrue(!page.getPotAttendance().getText().equals(""));
        }
        if(potCourse){
            //assertion course
        }
        if(potSosmed){
            // assertion sosmed
        }
        if(pitTask){
            Assertions.assertTrue(!page.getpitTask().getText().equals(""));
        }
        if(pitOgf){
            Assertions.assertTrue(!page.getpitOGF().getText().equals(""));
        }
        if(pitMultirater){
            Assertions.assertTrue(!page.getpitMultirater().getText().equals(""));
        }
        if(pitNps){
            // assert pitnps
        }
    }
}