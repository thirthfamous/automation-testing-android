package MainTests.TalentTest;

import Pages.Talent.TalentProfile.*;
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

public class TalentProfileTest {
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
        setupBefore();
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
        talentPage.waitForMobilityChanged(talentMobility);

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
        addNewDevelopment();
    }

    @Test
    public void EditDevelopmentPlanTest(){
        addNewDevelopment();
        setupBefore();
        TalentPlanDetailsPage talentPlanDetailsPage = new TalentPlanDetailsPage(driver);
        talentPlanDetailsPage.showEditPlanForm();

        TalentPlanDetailsEditPlan talentPlanDetailsEditPlan = new TalentPlanDetailsEditPlan(driver);
        HashMap<String, String> developmentPlan = talentPlanDetailsEditPlan.fillAllForm();
        talentPlanDetailsEditPlan.getSubmitBtn().click();

        talentPlanDetailsPage.waitForTalentPlanDetailsPageLoaded();

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
    public void EditDevelopmentPlanFromSeeAllTest(){
        addNewDevelopment();
        setupBefore();
        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.clickSeeAllDevelopmentPlan();

        TalentSeeAllDevelopmentPlanPage talentSeeAllDevelopmentPlanPage = new TalentSeeAllDevelopmentPlanPage(driver);
        talentSeeAllDevelopmentPlanPage.clickFirstArrayOfDevelopmentPlan();

        TalentPlanDetailsPage talentPlanDetailsPage = new TalentPlanDetailsPage(driver);
        talentPlanDetailsPage.getMoreBtn().click();
        talentPlanDetailsPage.clickSomewhere(846, 341);

        TalentPlanDetailsEditPlan talentPlanDetailsEditPlan = new TalentPlanDetailsEditPlan(driver);
        HashMap<String, String> developmentPlan = talentPlanDetailsEditPlan.fillAllForm();
        talentPlanDetailsEditPlan.getSubmitBtn().click();

        talentPlanDetailsPage.waitForTalentPlanDetailsPageLoaded();

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
    public void DeleteDevelopmentPlanTest(){
        addNewDevelopment();
        setupBefore();
        TalentPlanDetailsPage talentPlanDetailsPage = new TalentPlanDetailsPage(driver);
        talentPlanDetailsPage.showPlanDetails();
        String before = talentPlanDetailsPage.getPlanTitle().getText();
        talentPlanDetailsPage.getMoreBtn().click();
        talentPlanDetailsPage.deleteDevelopmentPlan();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.waitForFirstTalentDevelopmentPlanArrayDeleted(before);
        Assertions.assertTrue(true);
    }

    @Test
    public void CheckCurrentPosition(){
        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.scrollToBottom();
        talentPage.getApirationBtn().click();
        talentPage.getCurrentPositionBtn().click();
        String position = talentPage.clickPositionCurrent();

        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.waitForJobProfileDetailsLoaded();
        Assertions.assertTrue(talentJobProfileDetails.getNamaJob().getText().equals(position));
    }

    @Test
    public void CheckClickedSuggestedPosition(){
        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.scrollToBottom();
        talentPage.getApirationBtn().click();
        String current = talentPage.clickFirstArrayAspirationSuggestedPositionName();

        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.waitForJobProfileDetailsLoaded();
        Assertions.assertTrue(talentJobProfileDetails.getNamaJob().getText().equals(current));
    }

    @Test
    public void AddNewAspiration(){
        addNewAspiration();
    }

    @Test
    public void DeleteAspirationTest(){
        addNewAspiration();
        setupBefore();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.scrollToBottom();
        talentPage.getApirationBtn().click();
        String current = talentPage.clickFirstArrayAspirationSuggestedPositionName();

        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.deleteJobProfile();
        talentJobProfileDetails.waitForFirstArraySuggestedPositionDeleted(current);
        Assertions.assertTrue(true);
    }

    @Test
    public void EditAspirationTest(){
        addNewAspiration();
        setupBefore();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.scrollToBottom();
        talentPage.getApirationBtn().click();
        talentPage.clickFirstArrayAspirationSuggestedPositionName();

        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.editJobProfile();

        TalentEditAspirationForm talentEditAspirationForm = new TalentEditAspirationForm(driver);
        String selectedAspirationJob = talentEditAspirationForm.chooseAspirationJob();
        talentEditAspirationForm.choosePlanDate();
        talentEditAspirationForm.getSubmitBtn().click();

        talentPage.waitForFirstArraySuggestedPositionChanged(selectedAspirationJob);
        Assertions.assertTrue(true);
    }

    @Test
    public void AddAspirationFromSeeAllBtn(){
        addNewAspiration();
        setupBefore();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.clickSeeAllSuggestedPosition();

        TalentSeeAllAspiration talentSeeAllAspiration = new TalentSeeAllAspiration(driver);
        talentSeeAllAspiration.clickAddAspirationBtn();

        TalentAddAspirationForm talentAddAspirationForm = new TalentAddAspirationForm(driver);
        String aspirationJob = talentAddAspirationForm.chooseAspirationJob();
        talentAddAspirationForm.choosePlanDate();
        talentAddAspirationForm.getSubmitBtn().click();

        talentSeeAllAspiration.waitForFirstArraySuggestedPositionSeeAllChanged(aspirationJob);
        Assertions.assertTrue(true);
    }

    @Test
    public void EditAspirationSeeAllTest(){
        addNewAspiration();
        setupBefore();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.clickSeeAllSuggestedPosition();

        TalentSeeAllAspiration talentSeeAllAspiration = new TalentSeeAllAspiration(driver);
        String current = talentSeeAllAspiration.clickFirstArrayAspirationSuggestedPositionSeeAllName();

        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.editJobProfile();

        TalentEditAspirationForm talentEditAspirationForm = new TalentEditAspirationForm(driver);
        String selectedAspirationJob = talentEditAspirationForm.chooseAspirationJob();
        talentEditAspirationForm.choosePlanDate();
        talentEditAspirationForm.getSubmitBtn().click();

        talentSeeAllAspiration.waitForFirstArraySuggestedPositionSeeAllChanged(selectedAspirationJob);
        Assertions.assertTrue(true);
    }

    @Test
    public void deleteAspirationSeeAll(){
        addNewAspiration();
        setupBefore();

        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.clickSeeAllSuggestedPosition();

        TalentSeeAllAspiration talentSeeAllAspiration = new TalentSeeAllAspiration(driver);
        String current = talentSeeAllAspiration.clickFirstArrayAspirationSuggestedPositionSeeAllName();


        TalentJobProfileDetails talentJobProfileDetails = new TalentJobProfileDetails(driver);
        talentJobProfileDetails.deleteJobProfile();

        talentSeeAllAspiration.waitForFirstArraySuggestedPositionSeeAllDeleted(current);
        Assertions.assertTrue(true);
    }


    @AfterEach
    public void tearDown() {
        System.out.println("Testing Finished");
        driver.quit();
    }


    private void addNewAspiration() {
        TalentPage talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.scrollToBottom();
        talentPage.showAddAspirationForm();

        TalentAddAspirationForm talentAddAspirationForm = new TalentAddAspirationForm(driver);
        String aspirationJob = talentAddAspirationForm.chooseAspirationJob();
        talentAddAspirationForm.choosePlanDate();
        talentAddAspirationForm.getSubmitBtn().click();

        talentPage.waitForFirstArraySuggestedPositionChanged(aspirationJob);
        Assertions.assertTrue(true);
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
    private void addNewDevelopment() {
        talentPage = new TalentPage(driver);
        talentPage.showTalentPage();
        talentPage.waitForTalentPageShow();

        talentPage.scrollToBottom();

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
    private void setupBefore() {
        DesiredCapabilities cap = SettingDataWLB.createLoggedInDesiredCabability();
        URL url = null;
        try {
            url = SettingDataWLB.createURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("------- Testing Homepage Started --------");
    }
}