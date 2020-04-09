package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    AppiumDriver<MobileElement> driver;
    By searchBtn = By.id("id.co.wlb.debug:id/search");
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
        action.tap(new PointOption().withCoordinates(334,1660));
        action.release();
        action.perform();
        System.out.println("Click Talent Menu Done");
    }

    public void showTalentPage(){
        waitforHomePageShowed();
        clickShowMenuButton();
        clickTalentMenuButton();
    }
}
