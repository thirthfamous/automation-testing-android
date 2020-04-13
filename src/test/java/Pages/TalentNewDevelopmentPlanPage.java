package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class TalentNewDevelopmentPlanPage extends HomePage{

    AppiumDriver<MobileElement> driver;
    private By name = By.id("id.co.wlb.debug:id/name");
    private By etMeasure = By.id("id.co.wlb.debug:id/EtMeasure");
    private By etRecom = By.id("id.co.wlb.debug:id/EtRecom");
    private By startDate = By.id("id.co.wlb.debug:id/startDate");
    private By endDate = By.id("id.co.wlb.debug:id/endDate");
    private By competency = By.id("id.co.wlb.debug:id/competencyAutoComplete");
    private By submitBtn = By.id("id.co.wlb.debug:id/tvSubmitBtn");
    private By competencyFirst = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By competencySecond = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");

    public TalentNewDevelopmentPlanPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public HashMap<String, String> fillAllForm(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name",fillName("Development Plan Name at"));
        map.put("measure", fillMeasureOfSuccess("Measure of Success at"));
        scroll(600, 2249, 600, 2);
        map.put("startDate", clickStartDateAndSet());
        map.put("endDate", clickEndDateAndSet());
        setCompetency(477,800);
        setCompetency(477,943);
        scroll(635, 1000, 740, 501);
        map.put("firstCompetency", getCompetencyFirst().getText());
        map.put("secondCompetency", getCompetencySecond().getText());
        return map;
    }

    public String fillName(String name){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String data = name+" "+formatter.format(date);
        getName().sendKeys(data);
        driver.hideKeyboard();
        return data;
    }

    public MobileElement getCompetencyFirst(){
        return driver.findElement(competencyFirst);
    }

    public MobileElement getCompetencySecond(){
        return driver.findElement(competencySecond);
    }

    public MobileElement getName(){
        return driver.findElement(name);
    }

    public MobileElement getEtMeasure(){
        return driver.findElement(etMeasure);
    }

    public String fillMeasureOfSuccess(String measure){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String data = measure+" "+formatter.format(date);
        getEtMeasure().sendKeys(data);
        driver.hideKeyboard();
        return data;
    }

    public MobileElement getEtRecom(){
        return driver.findElement(etRecom);
    }

    public MobileElement getStartDate(){
        return driver.findElement(startDate);
    }

    public String clickStartDateAndSet(){
        getStartDate().click();
        clickSomewhere(550,1221);
        clickSomewhere(850, 1837);
        return getStartDate().getText();
    }

    public String clickEndDateAndSet(){
        getEndDate().click();
        clickSomewhere(536, 1435);
        clickSomewhere(850, 1837);
        return getEndDate().getText();
    }

    public void setCompetency(int x, int y){
        getCompetency().click();
        clickSomewhere(x, y);
    }

    public MobileElement getEndDate(){
        return driver.findElement(endDate);
    }

    public MobileElement getCompetency(){
        return driver.findElement(competency);
    }

    public MobileElement getSubmitBtn(){
        return driver.findElement(submitBtn);
    }


}
