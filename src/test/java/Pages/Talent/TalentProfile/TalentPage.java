package Pages.Talent.TalentProfile;

import Pages.HomePage;
import helpers.SettingDataWLB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalentPage extends HomePage {
    AppiumDriver<MobileElement> driver;
    private By name = By.id(SettingDataWLB.APP_PACKAGE+":id/name");
    private By position = By.id(SettingDataWLB.APP_PACKAGE+":id/position");
    private By userPhoto = By.id(SettingDataWLB.APP_PACKAGE+":id/avatar");
    private By riskOfLoss = By.id(SettingDataWLB.APP_PACKAGE+":id/riskOfLoseLevel");
    private By impactOfLoss = By.id(SettingDataWLB.APP_PACKAGE+":id/impactOfLoseLevel");
    private By futureLeader = By.id(SettingDataWLB.APP_PACKAGE+":id/futureLeaderLevel");
    private By talentMobilityReason = By.id(SettingDataWLB.APP_PACKAGE+":id/reason");
    private By editTalentInformationBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/editTalent");
    private By seeAllBadgesBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/seeAllBadge");
    private By badgeName = By.id(SettingDataWLB.APP_PACKAGE+":id/namaBadge");
    private By badgeVersion = By.id(SettingDataWLB.APP_PACKAGE+":id/versionBadge");
    private By userValue = By.id(SettingDataWLB.APP_PACKAGE+":id/nilaiUser");
    private By potCompetency = By.id(SettingDataWLB.APP_PACKAGE+":id/potCompetency");
    private By potAttendance = By.id(SettingDataWLB.APP_PACKAGE+":id/potAttendance");
    private By pitTask = By.id(SettingDataWLB.APP_PACKAGE+":id/pitTask");
    private By pitOGF = By.id((SettingDataWLB.APP_PACKAGE+":id/pitOGF"));
    private By pitMultirater = By.id(SettingDataWLB.APP_PACKAGE+":id/pitMultirater");
    private By developmentPlanBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Development Plan\"]/android.widget.TextView");
    private By aspirationBtn = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Aspiration\"]");
    private By addNewDevelopmentPlanBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout");
    private By addNewDevelopmentPlanBtnMyTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout");
    private By developmentPlanNameFirstArray = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    private By developmentPlanNameFirstArrayMyTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    private By developmentPlanDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");

    private By developmentPlanDateMyTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
    private By developmentPlanStatus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");
    private By developmentPlanStatusMyTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView");
    private By seeAllBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/seeAll");
    private By addNewAspirationBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/image3");
    private By currentPositionBtn = By.id(SettingDataWLB.APP_PACKAGE+":id/currentPosition");
    private By positionCurrent = By.id(SettingDataWLB.APP_PACKAGE+":id/positionCurrent");
    private By firstArrayAspirationSuggestedPositionName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");
    private By firstArrayAspirationSuggestedPositionNameMyTeam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");
    private By tvTitleTalent = By.id(SettingDataWLB.APP_PACKAGE+":id/tvTitleTalent");
    private By cvItemMyTeam = By.id(SettingDataWLB.APP_PACKAGE+":id/cv_item_myteam");

    public TalentPage(AppiumDriver<MobileElement> driver){
        super(driver);
        this.driver = driver;
    }

    public By getTalentMobilityReasonBy(){
        return talentMobilityReason;
    }

    public void waitForMobilityChanged(final String newMobility){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(getTalentMobilityReasonBy()).getText().equals(newMobility);
                    }
                });
    }

    public MobileElement getDevelopmentPlanDate(){
        return driver.findElement(developmentPlanDate);
    }

    public MobileElement getDevelopmentPlanDateMyTeam(){
        return driver.findElement(developmentPlanDateMyTeam);
    }

    public MobileElement getDevelopmentPlanStatus(){
        return driver.findElement(developmentPlanStatus);
    }

    public MobileElement getDevelopmentPlanStatusMyTeam(){
        return driver.findElement(developmentPlanStatusMyTeam);
    }

    public MobileElement getUserName() {
        return driver.findElement(name);
    }

    public MobileElement getRiskOfLoss() {
        return driver.findElement(riskOfLoss);
    }

    public MobileElement getUserPosition() {
        return driver.findElement(position);
    }

    public MobileElement getUserImage(){
        return driver.findElement(userPhoto);
    }

    public MobileElement getImpactOfLoss() {
        return driver.findElement(impactOfLoss);
    }

    public MobileElement getFutureLeader() {
        return driver.findElement(futureLeader);
    }

    public MobileElement getFirstArrayAspirationSuggestedPositionName(){
        return driver.findElement(firstArrayAspirationSuggestedPositionName);
    }

    public MobileElement getFirstArrayAspirationSuggestedPositionNameMyTeam(){
        return driver.findElement(firstArrayAspirationSuggestedPositionNameMyTeam);
    }

    public MobileElement getAddNewDevelopmentPlanBtnMyTeam(){
        return driver.findElement(addNewDevelopmentPlanBtnMyTeam);
    }

    public String clickFirstArrayAspirationSuggestedPositionName(){
        String name = getFirstArrayAspirationSuggestedPositionName().getText();
        getFirstArrayAspirationSuggestedPositionName().click();
        return name;
    }

    public String clickFirstArrayAspirationSuggestedPositionNameMyTeam(){
        String name = getFirstArrayAspirationSuggestedPositionNameMyTeam().getText();
        getFirstArrayAspirationSuggestedPositionNameMyTeam().click();
        return name;
    }

    public MobileElement getTalentMobility() {
        return driver.findElement(talentMobilityReason);
    }

    public MobileElement getEditInformationBtn() {
        return driver.findElement(editTalentInformationBtn);
    }

    public MobileElement getSeeAllBadgesBtn() {
        return driver.findElement(seeAllBadgesBtn);
    }

    public MobileElement getBadgeName() {
        return driver.findElement(badgeName);
    }

    public MobileElement getBadgeVersion() {
        return driver.findElement(badgeVersion);
    }

    public MobileElement getuserValue() {
        return driver.findElement(userValue);
    }

    public MobileElement getPotCompetency() {
        return driver.findElement(potCompetency);
    }

    public MobileElement getPotAttendance() {
        return driver.findElement(potAttendance);
    }

    public MobileElement getpitTask() {
        return driver.findElement(pitTask);
    }

    public MobileElement getpitOGF() {
        return driver.findElement(pitOGF);
    }

    public MobileElement getpitMultirater() {
        return driver.findElement(pitMultirater);
    }

    public MobileElement getdevelopmentPlanBtn() {
        return driver.findElement(developmentPlanBtn);
    }

    public MobileElement getaddNewDevelopmentPlanBtn() {
        return driver.findElement(addNewDevelopmentPlanBtn);
    }

    public MobileElement getApirationBtn() {
        return driver.findElement(aspirationBtn);
    }

    public MobileElement getAddNewAspirationBtn(){
        return driver.findElement(addNewAspirationBtn);
    }

    public MobileElement getCvItemMyTeam(){
        return driver.findElement(cvItemMyTeam);
    }

    public void showAddAspirationForm(){
        getApirationBtn().click();
        getAddNewAspirationBtn().click();
    }

    public MobileElement getCurrentPositionBtn(){
        return driver.findElement(currentPositionBtn);
    }

    public MobileElement getPositionCurrent(){
        return driver.findElement(positionCurrent);
    }

    public String clickPositionCurrent(){
        String positionCurrent = getPositionCurrent().getText();
        getPositionCurrent().click();
        return positionCurrent;
    }


    public MobileElement getSeeAllBtn(){
        return driver.findElement(seeAllBtn);
    }
    public void clickTalentInformation() {
        driver.findElement(editTalentInformationBtn).click();
    }

    public void waitForTalentPageShow(){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(riskOfLoss).getText().equals("-");
                    }
                });
    }

    public void waitForFirstArraySuggestedPositionChanged(final String aspirationJob){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(firstArrayAspirationSuggestedPositionName)
                                .getText().equals(aspirationJob);
                    }
                });
    }

    public void waitForFirstArraySuggestedPositionChangedMyTeam(final String aspirationJob){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(firstArrayAspirationSuggestedPositionNameMyTeam)
                                .getText().equals(aspirationJob);
                    }
                });
    }


    public void waitForFirstArraySuggestedPositionDeleted(final String aspirationJob){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(firstArrayAspirationSuggestedPositionName)
                                .getText().equals(aspirationJob);
                    }
                });
    }

    public void waitForFirstArraySuggestedPositionDeletedMyTeam(final String aspirationJob){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(firstArrayAspirationSuggestedPositionNameMyTeam)
                                .getText().equals(aspirationJob);
                    }
                });
    }

    public void waitForFirstTalentDevelopmentPlanArrayDeleted(final String before){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(developmentPlanNameFirstArray));
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(developmentPlanNameFirstArray).getText().equals(before);
                    }
                });
    }

    public void waitForFirstTalentDevelopmentPlanArrayChanged(final String expected){
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return webDriver.findElement(developmentPlanNameFirstArray).getText().equals(expected);
                    }
                });
    }

    public void waitForFirstTalentDevelopmentPlanArrayDeletedMyTeam(final String before){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(developmentPlanNameFirstArrayMyTeam));
        new WebDriverWait(this.driver, 30)
                .until(new ExpectedCondition<Boolean>() {
                    @NullableDecl
                    public Boolean apply(@NullableDecl WebDriver webDriver) {
                        return !webDriver.findElement(developmentPlanNameFirstArrayMyTeam).getText().equals(before);
                    }
                });
    }

    @Override
    public void showTalentPage(){
        waitforHomePageShowed();
        clickShowMenuButton();
        clickTalentMenuButton();
        waitForTalentPageShow();
    }

    public void waitForTalentPageShowAfterAddDevelopmentPlan(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(developmentPlanNameFirstArray));
    }

    public void waitForTalentPageShowAfterAddDevelopmentPlanMyTeam(){
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(developmentPlanNameFirstArrayMyTeam));
    }


    public MobileElement getDevelopmentPlanNameFirstArray(){
        return driver.findElement(developmentPlanNameFirstArray);
    }

    public MobileElement getdevelopmentPlanNameFirstArrayMyTeam(){
        return driver.findElement(developmentPlanNameFirstArrayMyTeam);
    }

    public MobileElement getTvTitleTalent(){
        return driver.findElement(tvTitleTalent);
    }

    public void scrollToBottom() {
        // scroll to bottom
        for (int i = 0; i < 3; i++) {
            scroll(600, 2049, 600, 100);
        }
    }

    public void clickSeeAllDevelopmentPlan() {
        scrollToBottom();
        getSeeAllBtn().click();
    }

    public void clickSeeAllSuggestedPosition() {
        scrollToBottom();
        getApirationBtn().click();
        getSeeAllBtn().click();
    }

    public void showMyTeamTalentPage(){
        showTalentPage();
        getTvTitleTalent().click();
        new WebDriverWait(this.driver, 30)
                .until(ExpectedConditions.presenceOfElementLocated(cvItemMyTeam));
        getCvItemMyTeam().click();
    }

}
