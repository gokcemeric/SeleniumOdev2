package com.pageobjectmodel;
import com.pageobjectmodel.page.CategoryAutomobilePage;
import com.pageobjectmodel.page.ClassifiedDetailPage;
import com.pageobjectmodel.page.HomePage;
import com.pageobjectmodel.page.SearchResultPage;
import extension.LogExtensions;
import extension.ScreenshotsExtensions;
import extension.TestStatusExtensions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@ExtendWith({LogExtensions.class, TestStatusExtensions.class, ScreenshotsExtensions.class})

public class Odev2Refactor extends BaseTest{
    private static final Logger logger = LogManager.getLogger(com.TestClass.class);

    HomePage homePage;
    CategoryAutomobilePage categoryAutomobilePage;
    SearchResultPage searchResultPage;
    ClassifiedDetailPage classifiedDetailPage;

    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        categoryAutomobilePage = new CategoryAutomobilePage(driver);
        searchResultPage = new SearchResultPage(driver);
        classifiedDetailPage = new ClassifiedDetailPage(driver);
    }

    @Test
    public void test1() {
        homePage.clickVehicle();
        categoryAutomobilePage.clickAllClassifiedLink();
        Assertions.assertTrue(searchResultPage.getClassifiedSize() > 0);

        String title = searchResultPage.getFirstClassifiedTitle();
        String KM = searchResultPage.getFirstClassifiedKM();
        String price = searchResultPage.getFirstClassifiedPrice();

        searchResultPage.clickFirstClassified();

        String classifiedTitle = classifiedDetailPage.getClassifiedTitle();
        String classifiedKM = classifiedDetailPage.getClassifiedKM();
        String classifiedPrice = classifiedDetailPage.getClassifiedPrice();
        String classifiedId = classifiedDetailPage.classifiedId();

        Assertions.assertAll(
                () -> Assertions.assertEquals(title, classifiedTitle),
                () -> Assertions.assertEquals(KM, classifiedKM),
                () -> Assertions.assertTrue(price.contains(classifiedPrice)));

        String currentUrl = driver.getCurrentUrl();
        logger.info(currentUrl);
        Assertions.assertTrue(currentUrl.contains(classifiedId));


    }
    @ParameterizedTest
    @CsvSource()
    public void testCase2() {
        logger.info("Populer ilana tıklanır.");
        homePage.clickPopulerClassified();
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
    public void parameterizedTestCsvSource(String categoryTitle, String cssSelector, int index) {

        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.findElement(By.cssSelector("#container >div.homepage > div > div.homepage-content > div:nth-child(12) > ul > li:nth-child(" + index + ") > a")).click();

        String searchResults = driver.findElement(By.cssSelector(cssSelector)).getText();
        Assertions.assertTrue(searchResults.contains(categoryTitle));

    }


}