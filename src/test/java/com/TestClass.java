package com;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass extends BaseTest {
    private static final Logger logger = LogManager.getLogger();


    @Test
    public void testCase1() throws InterruptedException {
        driver.get("https://sahibinden.com");

        List<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie("testBox", "184", ".sahibinden.com", "/", null));
        cookieList.add(new Cookie("tbSite", "x", ".sahibinden.com", "/", null));
        //cookieList.add(new Cookie("OptanonConsent", "isGpcEnabled=0&datestamp=Wed+Nov+09+2022+14%3A10%3A31+GMT%2B0300+(GMT%2B03%3A00)&version=6.22.0&isIABGlobal=false&hosts=&consentId=32716298-9fcc-4245-985b-09d0be30e4ff&interactionCount=2&landingPath=NotLandingPage&groups=C0001%3A1%2CC0002%3A0%2CC0003%3A0%2CC0004%3A0&geolocation=%3B&AwaitingReconsent=false", ".sahibinden.com", "/", null));
        cookieList.forEach(cookie -> driver.manage().addCookie(cookie));
        logger.info("Cookie setlendi.");

        //Anasayfa açıldığında çıkan youtube reklamı kapatılır.(Ben de kapanmıyor 2-3 refresh ıle kapatabıldım.)

        LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        localStorage.setItem("yt-remote-device-id",
                "{\"data\":\"95a35c11-7114-4936-917f-d98613c47389\",\"expiration\":1699164221982,\"creation\":1667628221982}");

        SessionStorage sessionStorage = ((WebStorage) driver).getSessionStorage();
        sessionStorage.setItem("yt-remote-session-app", "{\"data\":\"youtube-desktop\",\"creation\":1667628222564}");
        //Çerezler banner kapatılır.
        driver.findElement(By.id("onetrust-close-btn-container")).click();
       /*
       Anasayfada cıkan youtube iframe e mudahale etmeye calıstım o da olmadı.

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("movie_player")));
        WebElement iframeElement = driver.findElement(By.cssSelector(".html5-video-player.ytp-exp-bottom-control-flexbox.ytp-title-enable-channel-logo.ytp-embed.ytp-embed-playlist.unstarted-mode.ytp-hide-controls.ytp-large-width-mode"));
        driver.switchTo().frame(iframeElement);

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".intermediate-element >img")));
        driver.findElements(By.cssSelector(".intermediate-element >img")).get(0).click();
        */
        //Youtube reklamı gecemedıgım ıcın sayfayı 2 refreshde gecıyorum.
        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);




        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".category-3517>ul>li:first-child>a")));
        driver.findElement(By.cssSelector(".category-3517>ul>li:first-child>a")).click();
        driver.findElement(By.cssSelector(".uiInlineBoxContent.category-list .all-classifieds-link")).click();
        cookieList.add(new Cookie("feature_discovery_displayed", "true", ".sahibinden.com", "/", null));
        //İlan sonuç sayfasının boş gelmediği kontrol edilir.
        Assertions.assertTrue( driver.findElementById("searchResultsTable").isDisplayed());

        String classifiedTitleonResult = driver.findElement(By.cssSelector(".searchResultsRowClass>tr:first-child .searchResultsTitleValue.mini-column")).getText();
        String classifiedKMonResult= driver.findElement(By.cssSelector(".searchResultsRowClass>tr:first-child>td:nth-of-type(7)")).getText();
        String priceonResult= driver.findElement(By.cssSelector(".searchResultsRowClass>tr:first-child>td:nth-of-type(9)")).getText();

        driver.findElement(By.cssSelector(".searchResultsRowClass>tr:first-child .searchResultsTitleValue.mini-column")).click();
        String classifiedPrice = driver.findElement(By.cssSelector(".classifiedInfo >h3")).getText();
        String classifiedKM = driver.findElement(By.cssSelector(".classifiedInfoList >li:nth-of-type(9) >span")).getText();
        String classifiedTitle = driver.findElement(By.cssSelector(".classifiedDetailTitle>h1")).getText();
        String classifiedId = driver.findElement(By.id("classifiedId")).getText();

        Assertions.assertAll(
                () ->Assertions.assertEquals(classifiedTitleonResult,classifiedTitle),
                () ->Assertions.assertEquals(classifiedKMonResult,classifiedKM),
                ()->Assertions.assertTrue(classifiedPrice.contains(priceonResult)));

       String currentUrl= driver.getCurrentUrl();
       System.out.println(currentUrl);
       Assertions.assertTrue(currentUrl.contains(classifiedId));
    }


    @ParameterizedTest
    @CsvSource()
    public void testCase2 (){
        driver.get("https://sahibinden.com");
        //populer ılan ılkıne tıklamöa
        driver.findElement(By.cssSelector("body > div:nth-child(6) > ul > li:nth-child(1) > a")).click();

    }

    @Tag("populer_ilan")
    @DisplayName("Popüler ilan test")
    @ParameterizedTest
    @CsvSource({
            "iPhone 12 Mini,#search_cats ul li.cl4,1",
            "PlayStation 5,#search_cats ul li.cl3 div a h2,2",
            "Koşu Bandı,#search_cats ul li.cl3 div a h2,3",
            "Elektrikli Isıtıcı,#search_cats ul li.cl3 div a h2,4",
            "Toyota,#search_cats ul li.cl2 div a h2,5",
    })
    public void parameterizedTestCsvSource(String categoryTitle, String cssSelector, int index)
    {

        driver.get("https://www.sahibinden.com/");
        List<Cookie> cookieList = new ArrayList<>();
        cookieList.add(new Cookie("OptanonConsent", "true"));
        cookieList.add(new Cookie("OptanonAlertBoxClosed", "true"));
        cookieList.forEach(cookie -> driver.manage().addCookie(cookie));

        //youtube kapatmak icin refresh
        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        driver.navigate().refresh();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.findElement(By.cssSelector("#container >div.homepage > div > div.homepage-content > div:nth-child(12) > ul > li:nth-child(" + index + ") > a")).click();


        String searchResults = driver.findElement(By.cssSelector(cssSelector)).getText();
        Assertions.assertTrue(searchResults.contains(categoryTitle));
    }


}
