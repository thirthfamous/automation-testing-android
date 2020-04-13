package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentPlanDetailsPage extends TalentPage {

    private By statusWaiting = By.id("id.co.wlb.debug:id/statusWaiting");
    private By planTitle = By.id("id.co.wlb.debug:id/planTitle");
    private By measureOfSuccess = By.id("id.co.wlb.debug:id/measureOfSucess");
    private By competencyFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By competencySecondArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By planDate = By.id("id.co.wlb.debug:id/planDate");

    public TalentPlanDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public MobileElement getPlanDate(){
        return driver.findElement(planDate);
    }

    public MobileElement getStatusWaiting(){
        return driver.findElement(statusWaiting);
    }

    public MobileElement getPlanTitle(){
        return driver.findElement(planTitle);
    }

    public MobileElement getMeasureOfSuccess(){
        return driver.findElement(measureOfSuccess);
    }

    public MobileElement getCompetencyFirstArray(){
        return driver.findElement(competencyFirstArray);
    }

    public MobileElement getCompetencySecondArray(){
        return driver.findElement(competencySecondArray);
    }

    public boolean verifyCompetency(String firstCompetency) {
        if(firstCompetency.equals(getCompetencyFirstArray().getText())){
            return true;
        }
        return firstCompetency.equals(getCompetencySecondArray().getText());
    }
}
