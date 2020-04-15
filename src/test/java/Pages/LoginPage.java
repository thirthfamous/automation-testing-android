package Pages;

import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    AppiumDriver<MobileElement> driver;
    By emailForm = By.id(SettingDataWLB.APP_PACKAGE+":id/etEmail");
    By passwordForm = By.id(SettingDataWLB.APP_PACKAGE+":id/etPassword");
    By snackbarValid = By.id(SettingDataWLB.APP_PACKAGE+":id/snackbar_text");
    By loginBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/btn_login");

    public LoginPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public void setEmailFormName(String email){
        driver.findElement(emailForm).sendKeys(email);
    }

    public void setPasswordFormName(String password){
        driver.findElement(passwordForm).sendKeys(password);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void loginToWLBApp(String email, String password){
        this.setEmailFormName(email);
        this.setPasswordFormName(password);
        this.clickLoginBtn();
    }

    public void waitForActivityShowed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(emailForm));
    }

    public void waitForSnackBarValidUsernamePasswordShowed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(snackbarValid));
    }
}
