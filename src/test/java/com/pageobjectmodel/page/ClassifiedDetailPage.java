package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassifiedDetailPage extends BasePage {

  public ClassifiedDetailPage(WebDriver webDriver) {
    super(webDriver);
  }

  @FindBy(css = ".classifiedDetailTitle h1")
  public WebElement classifiedTitle;

  public String getClassifiedTitle() {
    return classifiedTitle.getText();
  }
  @FindBy(css = ".classifiedInfoList >li:nth-of-type(9) >span")
  public WebElement classifiedKm;
  public String getClassifiedKM(){
    return classifiedKm.getText();

  }
  @FindBy(css = ".searchResultsRowClass>tr:first-child>td:nth-of-type(9)")
  public WebElement classifiedPrice;

  public String getClassifiedPrice(){
    return classifiedPrice.getText();

  }
  @FindBy(css = ".classifiedInfoList>li:first-child span")
  public WebElement classifiedID;

  public String classifiedId(){
    return classifiedID.getText();

  }




}
