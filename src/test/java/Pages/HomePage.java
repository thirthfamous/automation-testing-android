package Pages;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    AppiumDriver<MobileElement> driver;
    By searchBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/search");
    By showMenuBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");

    public HomePage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void waitforHomePageShowed(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(searchBtn));
    }

    public void clickShowMenuButton(){
        driver.findElement(showMenuBtn).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickTalentMenuButton(){
        io.appium.java_client.TouchAction action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(183,1360));
        action.release();
        action.perform();
        System.out.println("Click Talent Menu Done");
    }

    public void waitUntilElementExist(AppiumDriver<MobileElement> driver, By element){
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void clickSomewhere(int x, int y){
        io.appium.java_client.TouchAction action = new TouchAction(driver);
        action.tap(new PointOption().withCoordinates(x,y));
        action.release();
        action.perform();
    }

    public void showTalentPage(){
        waitforHomePageShowed();
        clickShowMenuButton();
        clickTalentMenuButton();
    }


    public void scroll(int xLongPress, int yLongPress, int xRelease, int yRelease) {
        TouchAction action = new TouchAction(driver);
        action.longPress(new PointOption().withCoordinates(xLongPress,yLongPress))
                .moveTo(new PointOption().withCoordinates(xRelease, yRelease))
                .release().perform();
    }
}
