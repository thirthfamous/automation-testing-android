package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    AppiumDriver<MobileElement> driver;
    By searchBtn = By.id("id.co.wlb.debug:id/search");
    By showMenuBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
    By talentMenuBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.TextView[5]");

    public HomePage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void waitforHomePageShowed(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(searchBtn));
    }

    public void clickShowMenuButton(){
        driver.findElement(showMenuBtn).click();
    }

    public void clickTalentMenuButton(){
        driver.findElement(talentMenuBtn).click();
    }

    public void showTalentPage(){
        waitforHomePageShowed();
        clickShowMenuButton();
        clickTalentMenuButton();
    }
}
