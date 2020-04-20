package Pages.Talent.TalentMyTeam;

import Pages.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class TalentMyTeamPage extends HomePage {

    AppiumDriver<MobileElement> driver;
    private By firstArrayOfMyTeamList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout");
    private By secondArrayOfMyTeamList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout");

    public TalentMyTeamPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    public MobileElement getFirstArrayOfMyTeamList(){
        return driver.findElement(firstArrayOfMyTeamList);
    }

    public MobileElement getSecondArrayOfMyTeamList(){
        return driver.findElement(secondArrayOfMyTeamList);
    }

    public void clickSecondArrayOfMyTeamList(){
        waitUntilElementExist(driver, secondArrayOfMyTeamList);
        getSecondArrayOfMyTeamList().click();
    }
}
