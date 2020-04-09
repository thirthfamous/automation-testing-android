package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentPage extends HomePage {
    AppiumDriver<MobileElement> driver;
    By name = By.id("id.co.wlb.debug:id/name");
    By position = By.id("id.co.wlb.debug:id/position");
    By userPhoto = By.id("id.co.wlb.debug:id/avatar");
    By riskOfLoss = By.id("id.co.wlb.debug:id/riskOfLoseLevel");
    By impactOfLoss = By.id("id.co.wlb.debug:id/impactOfLoseLevel");
    By futureLeader = By.id("id.co.wlb.debug:id/futureLeaderLevel");
    By talentMobilityReason = By.id("id.co.wlb.debug:id/reason");
    By editTalentInformationBtn = By.id("id.co.wlb.debug:id/editTalent");
    By seeAllBadgesBtn = By.id("id.co.wlb.debug:id/seeAllBadge");
    By badgeName = By.id("id.co.wlb.debug:id/namaBadge");
    By badgeVersion = By.id("id.co.wlb.debug:id/versionBadge");
    By userValue = By.id("id.co.wlb.debug:id/nilaiUser");
    By potCompetency = By.id("id.co.wlb.debug:id/potCompetency");
    By potAttendance = By.id("id.co.wlb.debug:id/potAttendance");
    By pitTask = By.id("id.co.wlb.debug:id/pitTask");
    By pitOGF = By.id(("id.co.wlb.debug:id/pitOGF"));
    By pitMultirater = By.id("id.co.wlb.debug:id/pitMultirater");
    By developmentPlanBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Development Plan\"]/android.widget.TextView");
    By aspirationBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Aspiration\"]/android.widget.TextView");
    By addNewDevelopmentPlanBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout");
    By developmentPlanFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]");


    public TalentPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(name).getText();
    }

    public String getUserPosition() {
        return driver.findElement(position).getText();
    }

    public boolean IsImageDisplayed(){
        return driver.findElement(userPhoto).isDisplayed();
    }
}
