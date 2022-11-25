package com.pageobjectmodel;

import com.pageobjectmodel.page.CategoryAutomobilePage;
import com.pageobjectmodel.page.ClassifiedDetailPage;
import com.pageobjectmodel.page.HomePage;
import com.pageobjectmodel.page.SearchResultPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class POMTestTest1 extends BaseTest {

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

    System.out.println(title);
    System.out.println(KM);
    System.out.println(price);

    searchResultPage.clickFirstClassified();

    String classifiedTitle = classifiedDetailPage.getClassifiedTitle();

    Assertions.assertEquals(title, classifiedTitle);
  }
}
