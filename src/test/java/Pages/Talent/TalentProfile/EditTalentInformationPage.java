package Pages.Talent.TalentProfile;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class EditTalentInformationPage extends TalentPage{
    AppiumDriver<MobileElement> driver;
    By submitBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/submit");
    By riskOfLossSpinner = By.id(SettingDataWLB.APP_PACKAGE+":id/riskOfLossSp");
    By impactOfLossSpinner = By.id(SettingDataWLB.APP_PACKAGE+":id/impackOfLossSp");
    By futureLeaderSpinner = By.id(SettingDataWLB.APP_PACKAGE+":id/futureLeaderSp");
    By talentMobilityTextArea = By.id(SettingDataWLB.APP_PACKAGE+":id/description");

    public EditTalentInformationPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
    }

    public void clickSubmitBtn(){
        driver.findElement(submitBtn).click();
    }

    public void clickRiskOfLossSpinner(){
        driver.findElement(riskOfLossSpinner).click();
    }

    public void clickFutureLeaderSpinner(){
        driver.findElement(futureLeaderSpinner).click();
    }

    public void clickImpactOfLossSpinnerSpinner(){
        driver.findElement(impactOfLossSpinner).click();
    }

    public void setTalentMobilityTextArea(){
        pressKeyboardBtn();
        driver.hideKeyboard();
    }

    private void pressKeyboardBtn(){
        driver.findElement(talentMobilityTextArea).sendKeys("b");
    }

    public MobileElement getRiskOfLossSpinner(){
        return driver.findElement(riskOfLossSpinner);
    }

    /**
     * uses : Set talent information, High High No
     */
    public void setTalentInformationHHN(){
        io.appium.java_client.TouchAction action = new TouchAction(driver);

        // click High at Risk of Loss Spinner
        clickRiskOfLossSpinner();
        action.tap(new PointOption().withCoordinates(238,619));
        action.release();
        action.perform();


        // click High at Impact of Loss Spinner
        clickImpactOfLossSpinnerSpinner();
        action.tap(new PointOption().withCoordinates(158,930));
        action.release();
        action.perform();

        // click No at Future Leader
        clickFutureLeaderSpinner();
        action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(127,1377));
        action.release();
        action.perform();

        setTalentMobilityTextArea();
        clickSubmitBtn();

    }

    /**
     * uses : Set talent information, MLY
     */
    public void setTalentInformationMLY(){
        io.appium.java_client.TouchAction action = new TouchAction(driver);

        // click Medium at Risk of Loss Spinner
        clickRiskOfLossSpinner();
        action.tap(new PointOption().withCoordinates(200,761));
        action.release();
        action.perform();


        // click Low at Impact of Loss Spinner
        clickImpactOfLossSpinnerSpinner();
        action.tap(new PointOption().withCoordinates(160,1236));
        action.release();
        action.perform();

        // click Yes at Future Leader
        clickFutureLeaderSpinner();
        action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(127,1207));
        action.release();
        action.perform();

        clickSubmitBtn();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
