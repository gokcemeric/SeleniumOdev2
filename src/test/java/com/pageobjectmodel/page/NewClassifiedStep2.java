package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NewClassifiedStep2 extends BasePage{

    public NewClassifiedStep2(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".classified-from-text-input.ng-pristine")
    private WebElement title;
    @FindBy(css = ".ng-pristine.ng-valid.ta-bind.ng-empty.ng-touched")
    private WebElement description;
    @FindBy (id = "addClassifiedPrice")
    private WebElement price;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(10) > ng-form > div:nth-child(1) > div > input")
    private WebElement brutM;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(12) > ng-form > div:nth-child(1) > div > input")
    private WebElement netM;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(14) > ng-form > div:nth-child(1) > div > select")
    private WebElement roomCount;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(16) > ng-form > div:nth-child(1) > div > select")
    private WebElement buildingAge;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(18) > ng-form > div:nth-child(1) > div > select")
    private WebElement floor;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(20) > ng-form > div:nth-child(1) > div > select")
    private WebElement floorCount;

    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(22) > ng-form > div:nth-child(1) > div > select")
    private WebElement heating;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(26) > ng-form > div:nth-child(1) > div > select")
    private WebElement balcony;
    @FindBy (css = ".add-classified.ng-scope > div.ng-scope > form > div.post-add-details.add-classified-box > dl > dd:nth-child(24) > ng-form > div:nth-child(1) > div > select")
    private WebElement bathroom;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(28) > ng-form > div:nth-child(1) > div > label")
    private WebElement furnished;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(30) > ng-form > div:nth-child(1) > div > select")
    private WebElement usage;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(36) > ng-form > div:nth-child(1) > div > input")
    private WebElement subscription;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(38) > ng-form > div:nth-child(1) > div > label")
    private WebElement availableForCredit;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(40) > ng-form > div:nth-child(1) > div > select")
    private WebElement titleDeed;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(42) > ng-form > div > div")
    private WebElement fromWho;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(44) > ng-form > div:nth-child(1) > div > select")
    private WebElement availableForVideoCall;
    @FindBy (css = ".post-add-details.add-classified-box > dl > dd:nth-child(46) > ng-form > div:nth-child(1) > div > select")
    private WebElement swap;
    @FindBy (css = ".add-classified-box.new-address-section.ng-scope > div.map-content > ul > li:nth-child(1) > select")
    private WebElement city;
    @FindBy (css = ".add-classified-box.new-address-section.ng-scope > div.map-content > ul > li:nth-child(2) > select")
    private WebElement town;
    @FindBy (css = ".add-classified-box.new-address-section.ng-scope > div.map-content > ul > li:nth-child(3) > select")
    private WebElement neightbourhood;
    @FindBy (css = ".add-classified-box.new-address-section.ng-scope > div.map-content > div.apartmentComplexDiv.ng-scope > ul > li:nth-child(1) > select")
    private WebElement front;

    @FindBy (css = ".map-container > div > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > div")
    private WebElement locasion;

    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div:nth-child(3) > label")
    private WebElement interiorFeature;

    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div.detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(1) > label")
    private WebElement interiorFeatureADSL;


    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div:nth-child(4) > label")
    private WebElement externalFeature;

    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(2) > label")
    private WebElement externalFeatureLift;

    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > label")
    private WebElement district;

    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(1) > label")
    private WebElement districtAVM;

    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div:nth-child(6) > label")
    private WebElement transport;
    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(4) > label")
    private WebElement transportStreet;
    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div:nth-child(7) > label")
    private WebElement view;
    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(5) > label")
    private WebElement viewPool;



    @FindBy (css = ".add-classified-box.post-detailed-information.ng-scope > div:nth-child(8) > label")
    private WebElement houstingType;
    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(5) > label")
    private WebElement houstingGarden;

    //engelliye uygun
    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > label")
    private WebElement handicappedAccessible;
    @FindBy (css = ".detail-attributes-container.ng-pristine.ng-scope.ng-invalid.ng-invalid-required.opened > ul > li:nth-child(2) > label")
    private WebElement handicappedLift;
//ilan süresi
    @FindBy (css = ".add-classified-box.time-extend-offer.ng-scope.B > ul > li:nth-child(1) > label > div > span.offer-title1 > div")
    private WebElement announcementPeriod;
    @FindBy (css = ".add-classified-box.new-address-section.ng-scope > div.map-content > div.apartmentComplexDiv.ng-scope > ul > li:nth-child(1) > select")
    private WebElement onSite;

    @FindBy(css = ".add-classified-footer > div > label:nth-child(2)")
    private WebElement classifiedRules;


    public void EnterTitle(String param){
        wait.until(ExpectedConditions.elementToBeClickable(title));
        js.executeScript("arguments[0].scrollIntoView();", title);
        title.sendKeys(param);
    }
    //patlıyor bu
    public void enterDescription(String param){
        wait.until(ExpectedConditions.elementToBeClickable(description));
        description.click();
        description.sendKeys(param);
    }
    public void enterPrice(String param){
        wait.until(ExpectedConditions.elementToBeClickable(description));
        js.executeScript("arguments[0].scrollIntoView();", price);
        price.sendKeys(param);
    }
    public void enterBrut(String brut){
        brutM.sendKeys(brut);
    }
    public void enterNet(String net){
        netM.sendKeys(net);
    }
    public void selectRoomCount(String param){

        Select room = new Select(roomCount);
        room.selectByVisibleText(param);
    }
    public void selectFloor(String param){
        Select selectFloor = new Select(floor);
        selectFloor.selectByVisibleText(param);
    }
    public void selectFloorCount(String param){
        Select selectFloorCount = new Select(floorCount);
        selectFloorCount.selectByVisibleText(param);
    }
    public void selectHeating(String param){
        Select selectHeating = new Select(heating);
        selectHeating.selectByVisibleText(param);
    }
    public void selectBuildingAge(String param){
        Select age = new Select(buildingAge);
        age.selectByVisibleText(param);
    }
    public void selectBathroomCount(String param){
        Select bathroomCount = new Select(bathroom);
        bathroomCount.selectByVisibleText(param);
    }
    public void isThereBalcony(String param){
        js.executeScript("arguments[0].scrollIntoView();", balcony);
        Select selectBalcony = new Select(balcony);
        selectBalcony.selectByVisibleText(param);
    }
//eşyalı checkbox
    public void selectFurnished(){
        furnished.click();
    }
    public void selectUsage(String param){
        Select isUsage = new Select(usage);
        isUsage.selectByVisibleText(param);
    }
//aidat
    public void selectSubscription(String param){
        subscription.sendKeys(param);
    }
    public void isAvailableForCredit(){
        availableForCredit.click();
    }
    public void selectTitleDeed(String param){
        Select deed = new Select(titleDeed);
        deed.selectByVisibleText(param);
    }
//checkbox disable oldugunu gor
    public void selectfromWho(){
        fromWho.isDisplayed();
    }
    public void isAvailableForVideoCall(String param){
        js.executeScript("arguments[0].scrollIntoView();", availableForVideoCall);
        Select call = new Select(availableForVideoCall);
        call.selectByVisibleText(param);
    }
    public void selectSwap(String param){
        Select selectSwap = new Select(swap);
        selectSwap.selectByVisibleText(param);
    }

    public void selectCity(String param){
        Select selectCity = new Select(city);
        selectCity.selectByVisibleText(param);
    }
    public void selectTown(String param){
        Select selectTown = new Select(town);
        selectTown.selectByVisibleText(param);
    }
    public void selectNeightbourhood(String param){
        Select selectNeightbourhood = new Select(neightbourhood);
        selectNeightbourhood.selectByVisibleText(param);
    }
    public void selectOnSite(String param){
        Select selectNeightbourhood = new Select(onSite);
        selectNeightbourhood.selectByVisibleText(param);
    }
    public void selectLocasion(){
        locasion.click();
    }
    public  void selectFront(){
        js.executeScript("arguments[0].scrollIntoView();", front);
        front.click();
    }
    public void selectinteriorFeature(){
       interiorFeature.click();
    }
    public void selectinteriorFeatureADSL(){
       interiorFeatureADSL.click();
    }
    public  void selectExternalFeature(){
       externalFeature.click();
    }
    public  void selectExternalFeatureLift(){
        externalFeatureLift.click();
    }
    public  void selectDistrict(){
        district.click();
    }
    public  void selectDistrictAVM(){
     districtAVM.click();
    }
    public void selectTransport(){
        transport.click();
    }
    public void selectTransportStreet(){
        transportStreet.click();

    }
    public void selectView(){view.click();
    }
    public void selectViewPool(){viewPool.click();
    }
    public void selectHoustingType(){
        houstingType.click();
    }
    public void selectHoustingTypeGarden(){
        houstingGarden.click();
    }
    public void selectHandicappedAccessible(){
        handicappedAccessible.click();
    }
    public void selectHandicappedAccessibleLift(){
        handicappedLift.click();
    }
//ilan dönemi
    public void selectAnnouncementPeriod(){
        js.executeScript("arguments[0].scrollIntoView();", announcementPeriod);
        announcementPeriod.click();
    }
    public void clickClassifiedRules(){
        classifiedRules.click();
    }


    public void informationDetails(){
        selectFront();
        selectinteriorFeature();
        selectinteriorFeatureADSL();
        selectExternalFeature();
        selectExternalFeatureLift();
        selectDistrict();
        selectDistrictAVM();
        selectTransport();
        selectTransportStreet();
        selectView();
        selectViewPool();
        selectHoustingType();
        selectHoustingTypeGarden();
        selectHandicappedAccessible();
        selectHandicappedAccessibleLift();
    }




}
