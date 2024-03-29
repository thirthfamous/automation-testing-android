package Pages.Talent.TalentProfile;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalentPlanDetailsPage extends TalentPage {

    private By statusWaiting = By.id(SettingDataWLB.APP_PACKAGE+":id/statusWaiting");
    private By statusDone = By.id(SettingDataWLB.APP_PACKAGE+":id/statusDone");
    private By planTitle = By.id(SettingDataWLB.APP_PACKAGE+":id/planTitle");
    private By measureOfSuccess = By.id(SettingDataWLB.APP_PACKAGE+":id/measureOfSucess");
    private By recommedationOfEmpAct = By.id(SettingDataWLB.APP_PACKAGE+":id/recommedEmployee");
    private By competencyFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By competencySecondArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    private By planDate = By.id(SettingDataWLB.APP_PACKAGE+":id/planDate");
    private By moreBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/more");
    private By delete = By.id(SettingDataWLB.APP_PACKAGE+":id/delete");

    public TalentPlanDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public void waitForTalentPlanDetailsPageLoaded(){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(planTitle).getText().equals("");
                    }
                });
    }

    public void showPlanDetails(){
        showTalentPage();
        scrollToBottom();
        getDevelopmentPlanNameFirstArray().click();
    }

    public void showEditPlanForm(){
        showPlanDetails();
        getMoreBtn().click();
        clickSomewhere(846, 341);
    }

    public MobileElement getMoreBtn(){
        return driver.findElement(moreBtn);
    }

    public MobileElement getPlanDate(){
        return driver.findElement(planDate);
    }

    public MobileElement getStatusWaiting(){
        return driver.findElement(statusWaiting);
    }

    public MobileElement getStatusDone(){
        return driver.findElement(statusDone);
    }

    public void waitForTalentDevelopmentPlanDetailChanged(final String expected){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(planTitle).getText().equals(expected);
                    }
                });
    }

    public MobileElement getPlanTitle(){
        return driver.findElement(planTitle);
    }

    public MobileElement getMeasureOfSuccess(){
        return driver.findElement(measureOfSuccess);
    }

    public MobileElement getRecommedationOfEmpAct(){
        return driver.findElement(recommedationOfEmpAct);
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

    public void deleteDevelopmentPlan() {
        clickSomewhere(907, 494);
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(delete));
        getDeleteDevelopmentPlanBtn().click();
    }

    public MobileElement getDeleteDevelopmentPlanBtn(){
        return driver.findElement(delete);
    }
}
