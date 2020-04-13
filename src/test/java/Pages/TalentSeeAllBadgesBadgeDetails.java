package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentSeeAllBadgesBadgeDetails extends TalentPage {

    AppiumDriver<MobileElement> driver;

    public TalentSeeAllBadgesBadgeDetails(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }
}
