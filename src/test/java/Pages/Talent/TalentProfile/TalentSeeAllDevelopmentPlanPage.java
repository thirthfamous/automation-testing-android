package Pages.Talent.TalentProfile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentSeeAllDevelopmentPlanPage extends TalentPage {

    By firstArrayDevelopmentPlanName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    By firstArrayDevelopmentPlanDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
    By firstArrayDevelopmentPlanStatus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");

    public TalentSeeAllDevelopmentPlanPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickFirstArrayOfDevelopmentPlan(){
        getFirstArrayDevelopmentPlanName().click();
    }

    public MobileElement getFirstArrayDevelopmentPlanName(){
        return driver.findElement(firstArrayDevelopmentPlanName);
    }

    public MobileElement getFirstArrayDevelopmentPlanDate(){
        return driver.findElement(firstArrayDevelopmentPlanDate);
    }

    public MobileElement getFirstArrayDevelopmentPlanStatus(){
        return driver.findElement(firstArrayDevelopmentPlanStatus);
    }
}
