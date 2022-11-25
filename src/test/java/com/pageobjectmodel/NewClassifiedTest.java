package com.pageobjectmodel;

import com.pageobjectmodel.page.*;
import extension.LogExtensions;
import extension.ScreenshotsExtensions;
import extension.TestStatusExtensions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({LogExtensions.class, TestStatusExtensions.class, ScreenshotsExtensions.class})
public class NewClassifiedTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger();

    HomePage homePage;
    LoginPage loginPage;
    NewClassifiedStep1 newClassifiedStep1;
    NewClassifiedStep2 newClassifiedStep2;
    NewClassifiedStep3 newClassifiedStep3;
    NewClassifiedStep4 newClassifiedStep4;
    NewClassifiedStep5 newClassifiedStep5;


    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        loginPage= new LoginPage(driver);
        newClassifiedStep1= new NewClassifiedStep1(driver);
        newClassifiedStep2= new NewClassifiedStep2(driver);
        newClassifiedStep3 = new NewClassifiedStep3(driver);
        newClassifiedStep4 = new NewClassifiedStep4(driver);
        newClassifiedStep5 = new NewClassifiedStep5(driver);
    }
  @Tag("Ilan")
  @Test
    public void newClassifiedTest() throws InterruptedException {
        homePage.clickLogin();
        loginPage.enterUsername("cerensaricam");
        loginPage.enterPassword("password");
        Thread.sleep(4000);
        loginPage.clickSubmitButton();
      logger.info("kullanıcı ile giriş yapıldı.");
      homePage.clickNewClassified();
      //driver.findElement(By.cssSelector(".btn.btn-modern.new-classified.ng-binding")).click();
    newClassifiedStep1.clickRealEstate();
    newClassifiedStep1.clickHousting();
    newClassifiedStep1.clickForSale();
    newClassifiedStep1.clickApartment();
    newClassifiedStep1.continueButton();
    newClassifiedStep2.EnterTitle("Bakirköy de 2+1 satılık ev ilanıdır.");
    newClassifiedStep2.enterDescription("Sahibinden satılık yeni dairedir. Son fiyattir.");
    newClassifiedStep2.enterPrice("1000000");
    newClassifiedStep2.enterBrut("100");
    newClassifiedStep2.enterNet("80");
    newClassifiedStep2.selectRoomCount("2+1");
    newClassifiedStep2.selectBuildingAge("4");
    newClassifiedStep2.selectFloor("2");
    newClassifiedStep2.selectFloorCount("4");
    newClassifiedStep2.selectHeating("Doğalgaz (Kombi)");
    newClassifiedStep2.selectBathroomCount("1");
    newClassifiedStep2.isThereBalcony("Var");
    newClassifiedStep2.selectFurnished();
    newClassifiedStep2.selectUsage("Boş");
    newClassifiedStep2.selectSubscription("500");
    newClassifiedStep2.isAvailableForCredit();
    newClassifiedStep2.selectTitleDeed("Kat Mülkiyetli");
    newClassifiedStep2.isAvailableForVideoCall("Evet");
    newClassifiedStep2.selectSwap("Hayır");


    //Adres Bilgileri girilir.
      logger.info("Adres bilgisi girilir.");
      newClassifiedStep2.selectCity("İstanbul");
    newClassifiedStep2.selectTown("Adalar");
    newClassifiedStep2.selectNeightbourhood("KaşıkAdası");
    newClassifiedStep2.selectOnSite("Hayır");
    newClassifiedStep2.selectLocasion();
    //Detaylı bilgi girilir.
      logger.info("informationDetails method icerisinde detaylı bilgiler cekilir.");
    newClassifiedStep2.informationDetails();
    //ilan periyotu secilir.
    newClassifiedStep2.selectAnnouncementPeriod();
    newClassifiedStep2.clickClassifiedRules();
    //Step 3
    newClassifiedStep3.clickContinue();
    //Step4
    newClassifiedStep4.clickContinueDoping();
    newClassifiedStep5.clickBanaozelButton();
  }






}
