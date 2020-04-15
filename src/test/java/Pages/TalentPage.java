package Pages;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalentPage extends HomePage {
    AppiumDriver<MobileElement> driver;
    private By name = By.id(SettingDataWLB.APP_PACKAGE+":id/name");
    private By position = By.id(SettingDataWLB.APP_PACKAGE+":id/position");
    private By userPhoto = By.id(SettingDataWLB.APP_PACKAGE+":id/avatar");
    private By riskOfLoss = By.id(SettingDataWLB.APP_PACKAGE+":id/riskOfLoseLevel");
    private By impactOfLoss = By.id(SettingDataWLB.APP_PACKAGE+":id/impactOfLoseLevel");
    private By futureLeader = By.id(SettingDataWLB.APP_PACKAGE+":id/futureLeaderLevel");
    private By talentMobilityReason = By.id(SettingDataWLB.APP_PACKAGE+":id/reason");
    private By editTalentInformationBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/editTalent");
    private By seeAllBadgesBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/seeAllBadge");
    private By badgeName = By.id(SettingDataWLB.APP_PACKAGE+":id/namaBadge");
    private By badgeVersion = By.id(SettingDataWLB.APP_PACKAGE+":id/versionBadge");
    private By userValue = By.id(SettingDataWLB.APP_PACKAGE+":id/nilaiUser");
    private By potCompetency = By.id(SettingDataWLB.APP_PACKAGE+":id/potCompetency");
    private By potAttendance = By.id(SettingDataWLB.APP_PACKAGE+":id/potAttendance");
    private By pitTask = By.id(SettingDataWLB.APP_PACKAGE+":id/pitTask");
    private By pitOGF = By.id((SettingDataWLB.APP_PACKAGE+":id/pitOGF"));
    private By pitMultirater = By.id(SettingDataWLB.APP_PACKAGE+":id/pitMultirater");
    private By developmentPlanBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Development Plan\"]/android.widget.TextView");
    private By aspirationBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Aspiration\"]/android.widget.TextView");
    private By addNewDevelopmentPlanBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout");
    private By developmentPlanNameFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    private By developmentPlanDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
    private By developmentPlanStatus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");

    public TalentPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
    }

    public By getTalentMobilityReasonBy(){
        return talentMobilityReason;
    }

    public void waitForMobilityChanged(final String newMobility){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(getTalentMobilityReasonBy()).getText().equals(newMobility);
                    }
                });
    }

    public MobileElement getDevelopmentPlanDate(){
        return driver.findElement(developmentPlanDate);
    }

    public MobileElement getDevelopmentPlanStatus(){
        return driver.findElement(developmentPlanStatus);
    }

    public MobileElement getUserName() {
        return driver.findElement(name);
    }

    public MobileElement getRiskOfLoss() {
        return driver.findElement(riskOfLoss);
    }

    public MobileElement getUserPosition() {
        return driver.findElement(position);
    }

    public MobileElement getUserImage(){
        return driver.findElement(userPhoto);
    }

    public MobileElement getImpactOfLoss() {
        return driver.findElement(impactOfLoss);
    }

    public MobileElement getFutureLeader() {
        return driver.findElement(futureLeader);
    }

    public MobileElement getTalentMobility() {
        return driver.findElement(talentMobilityReason);
    }

    public MobileElement getEditInformationBtn() {
        return driver.findElement(editTalentInformationBtn);
    }

    public MobileElement getSeeAllBadgesBtn() {
        return driver.findElement(seeAllBadgesBtn);
    }

    public MobileElement getBadgeName() {
        return driver.findElement(badgeName);
    }

    public MobileElement getBadgeVersion() {
        return driver.findElement(badgeVersion);
    }

    public MobileElement getuserValue() {
        return driver.findElement(userValue);
    }

    public MobileElement getPotCompetency() {
        return driver.findElement(potCompetency);
    }

    public MobileElement getPotAttendance() {
        return driver.findElement(potAttendance);
    }

    public MobileElement getpitTask() {
        return driver.findElement(pitTask);
    }

    public MobileElement getpitOGF() {
        return driver.findElement(pitOGF);
    }

    public MobileElement getpitMultirater() {
        return driver.findElement(pitMultirater);
    }

    public MobileElement getdevelopmentPlanBtn() {
        return driver.findElement(developmentPlanBtn);
    }

    public MobileElement getaddNewDevelopmentPlanBtn() {
        return driver.findElement(addNewDevelopmentPlanBtn);
    }

    public MobileElement getApirationBtn() {
        return driver.findElement(aspirationBtn);
    }

    public void clickTalentInformation() {
        driver.findElement(editTalentInformationBtn).click();
    }

    public void waitForTalentPageShow(){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(riskOfLoss).getText().equals("-");
                    }
                });
    }

    @Override
    public void showTalentPage(){
        waitforHomePageShowed();
        clickShowMenuButton();
        clickTalentMenuButton();
        waitForTalentPageShow();
    }

    public void waitForTalentPageShowAfterAddDevelopmentPlan(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(developmentPlanNameFirstArray));
    }

    public MobileElement getDevelopmentPlanNameFirstArray(){
        return driver.findElement(developmentPlanNameFirstArray);
    }

    public void scrollToBottom() {
        // scroll to bottom
        for (int i = 0; i < 3; i++) {
            scroll(600, 2049, 600, 100);
        }
    }
}
