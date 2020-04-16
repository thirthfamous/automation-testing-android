package Pages.Talent.TalentProfile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TalentEditAspirationForm extends TalentAddAspirationForm {
    public TalentEditAspirationForm(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public String chooseAspirationJob(){
        getSpinnerCompetency().click();
        clickSomewhere(438,1070);
        return getSpinnerCompetency().getText();
    }

    public void choosePlanDate(){
        getStartDate().click();
        clickSomewhere(214, 1538);
        clickSomewhere(850, 1837);
    }


}
