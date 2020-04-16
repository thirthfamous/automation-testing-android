package Pages.Talent.TalentProfile;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentAddAspirationForm extends TalentPage {

    AppiumDriver<MobileElement> driver;

    private By submitBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/tvSubmitBtn");
    private By spinnerCompetency = By.id(SettingDataWLB.APP_PACKAGE+":id/spinnerCompetency");
    private By startDate = By.id(SettingDataWLB.APP_PACKAGE+":id/startDate");

    public TalentAddAspirationForm(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public MobileElement getSubmitBtn(){
        return driver.findElement(submitBtn);
    }

    public MobileElement getSpinnerCompetency(){
        return driver.findElement(spinnerCompetency);
    }

    public MobileElement getStartDate(){
        return driver.findElement(startDate);
    }

    public String chooseAspirationJob(){
        getSpinnerCompetency().click();
        clickSomewhere(346,606);
        return getSpinnerCompetency().getText();
    }

    public void choosePlanDate(){
        getStartDate().click();
        clickSomewhere(530, 1544);
        clickSomewhere(850, 1837);
    }
}
