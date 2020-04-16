package Pages.Talent.TalentProfile;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalentSeeAllAspiration extends TalentPage {

    private By addAspirationBtn = By.id(SettingDataWLB.APP_PACKAGE +":id/image3");
    private By firstArrayOfAspiration = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");

    public TalentSeeAllAspiration(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public MobileElement getAddAspirationBtn(){
        return driver.findElement(addAspirationBtn);
    }

    public MobileElement getFirstArrayOfAspiration(){
        return driver.findElement(firstArrayOfAspiration);
    }

    public void clickAddAspirationBtn(){
        getAddAspirationBtn().click();
    }

    public void waitForFirstArraySuggestedPositionSeeAllChanged(final String aspirationJob) {
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(firstArrayOfAspiration)
                                .getText().equals(aspirationJob);
                    }
                });
    }

    public String clickFirstArrayAspirationSuggestedPositionSeeAllName() {
        String name = getFirstArrayOfAspiration().getText();
        getFirstArrayOfAspiration().click();
        return name;
    }

    public void waitForFirstArraySuggestedPositionSeeAllDeleted(final String current) {
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(firstArrayOfAspiration)
                                .getText().equals(current);
                    }
                });
    }
}
