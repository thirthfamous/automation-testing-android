package Pages;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class TalentSeeAllBadgesPage extends HomePage {
    AppiumDriver<MobileElement> driver;
    By badge = By.id(SettingDataWLB.APP_PACKAGE+":id/parentLy");

    public TalentSeeAllBadgesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }
    public void clickBadge(){
        io.appium.java_client.TouchAction action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(484, 535));
        action.release();
        action.perform();
    }
}
