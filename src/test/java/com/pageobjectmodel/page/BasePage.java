package com.pageobjectmodel.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  WebDriver driver;
  WebDriverWait wait;
  JavascriptExecutor js = (JavascriptExecutor) driver;

  public BasePage(WebDriver webDriver) {
    this.driver = webDriver;
    PageFactory.initElements(webDriver, this);
  }
}
