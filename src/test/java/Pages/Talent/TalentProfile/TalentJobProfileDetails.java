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

public class TalentJobProfileDetails extends TalentPage {

    AppiumDriver<MobileElement> driver;

    private By namaJob = By.id(SettingDataWLB.APP_PACKAGE +":id/namaJob");
    private By more = By.id(SettingDataWLB.APP_PACKAGE +":id/more");
    private By delete = By.id(SettingDataWLB.APP_PACKAGE +":id/delete");

    public TalentJobProfileDetails(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public MobileElement getNamaJob(){
        return driver.findElement(namaJob);
    }

    public MobileElement getMore(){
        return driver.findElement(more);
    }

    public void deleteJobProfile(){
        getMore().click();
        clickSomewhere(902,500);
        waitForDelete();
        getDelete().click();
    }

    public MobileElement getDelete(){
        return driver.findElement(delete);
    }

    public void waitForDelete(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(delete));
    }

    public void waitForJobProfileDetailsLoaded(){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(namaJob).getText().equals("");
                    }
                });
    }

    public void editJobProfile() {
        getMore().click();
        clickSomewhere(866,352);
    }

    public void waitForJobProfileDetailsChanged(final String selectedAspirationJob) {
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(namaJob)
                                .getText().equals(selectedAspirationJob);
                    }
                });
    }
}
