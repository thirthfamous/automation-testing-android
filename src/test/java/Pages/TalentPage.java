package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentPage extends HomePage {
    AppiumDriver<MobileElement> driver;
    private By name = By.id("id.co.wlb.debug:id/name");
    private By position = By.id("id.co.wlb.debug:id/position");
    private By userPhoto = By.id("id.co.wlb.debug:id/avatar");
    private By riskOfLoss = By.id("id.co.wlb.debug:id/riskOfLoseLevel");
    private By impactOfLoss = By.id("id.co.wlb.debug:id/impactOfLoseLevel");
    private By futureLeader = By.id("id.co.wlb.debug:id/futureLeaderLevel");
    private By talentMobilityReason = By.id("id.co.wlb.debug:id/reason");
    private By editTalentInformationBtn = By.id("id.co.wlb.debug:id/editTalent");
    private By seeAllBadgesBtn = By.id("id.co.wlb.debug:id/seeAllBadge");
    private By badgeName = By.id("id.co.wlb.debug:id/namaBadge");
    private By badgeVersion = By.id("id.co.wlb.debug:id/versionBadge");
    private By userValue = By.id("id.co.wlb.debug:id/nilaiUser");
    private By potCompetency = By.id("id.co.wlb.debug:id/potCompetency");
    private By potAttendance = By.id("id.co.wlb.debug:id/potAttendance");
    private By pitTask = By.id("id.co.wlb.debug:id/pitTask");
    private By pitOGF = By.id(("id.co.wlb.debug:id/pitOGF"));
    private By pitMultirater = By.id("id.co.wlb.debug:id/pitMultirater");
    private By developmentPlanBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Development Plan\"]/android.widget.TextView");
    private By aspirationBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Aspiration\"]/android.widget.TextView");
    private By addNewDevelopmentPlanBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout");
    private By developmentPlanFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");


    public TalentPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
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

}
