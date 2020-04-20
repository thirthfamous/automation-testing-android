package Pages.Talent.TalentProfile;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;

public class TalentPlanDetailsEditPlan extends TalentNewDevelopmentPlanPage {

    AppiumDriver<MobileElement> driver;
    private By deleteFirstArrayCompetency = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
    private By deleteSecondArrayCompetency = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView");
    private By statusSpinner = By.id(SettingDataWLB.APP_PACKAGE +":id/spinnerStatus");

    public TalentPlanDetailsEditPlan(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public HashMap<String, String> fillAllForm(){
        waitUntilElementExist(driver, this.name);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name",fillName("Development Plan Name at"));
        map.put("measure", fillMeasureOfSuccess("Measure of Success at"));
        scroll(600, 2249, 600, 2);
        map.put("startDate", clickStartDateAndSet());
        map.put("endDate", clickEndDateAndSet());
        getDeleteFirstArrayCompetency().click();
        getDeleteFirstArrayCompetency().click();
        setCompetency(477,800);
        setCompetency(477,943);
        scroll(635, 1000, 740, 501);
        map.put("firstCompetency", getCompetencyFirst().getText());
        map.put("secondCompetency", getCompetencySecond().getText());
        return map;
    }

    public HashMap<String, String> fillAllFormMyTeam(){
        waitUntilElementExist(driver, this.name);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name",fillName("Development Plan Name at"));
        map.put("measure", fillMeasureOfSuccess("Measure of Success at"));
        map.put("recommended", fillRecommendedEmployeeAction("Recommended Employee Action at"));
        scroll(600, 2249, 600, 2);
        map.put("startDate", clickStartDateAndSet());
        map.put("endDate", clickEndDateAndSet());
        getDeleteFirstArrayCompetency().click();
        getDeleteFirstArrayCompetency().click();
        setCompetency(477,800);
        setCompetency(477,943);
        scroll(635, 1000, 740, 501);
        map.put("firstCompetency", getCompetencyFirst().getText());
        map.put("secondCompetency", getCompetencySecond().getText());
        map.put("status", clickStatusAndSet());
        return map;
    }

    private String clickStatusAndSet() {
        getStatusSpinner().click();
        clickSomewhere(362, 1880);
        return "Done";
    }

    @Override
    public String clickStartDateAndSet(){
        getStartDate().click();
        clickSomewhere(530,1060);
        clickSomewhere(850, 1837);
        return getStartDate().getText();
    }

    @Override
    public String clickEndDateAndSet(){
        getEndDate().click();
        clickSomewhere(642, 1544);
        clickSomewhere(850, 1837);
        return getEndDate().getText();
    }

    public MobileElement getDeleteFirstArrayCompetency(){
        return driver.findElement(deleteFirstArrayCompetency);
    }

    public MobileElement getStatusSpinner(){
        return driver.findElement(statusSpinner);
    }

    public MobileElement getDeleteSecondArrayCompetency(){
        return driver.findElement(deleteSecondArrayCompetency);
    }

}
