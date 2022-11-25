package com.pageobjectmodel.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

  @FindBy(css = "[title='Otomobil']")
  private WebElement otomobil;
  @FindBy(id ="secure-login")
  private WebElement loginButton;
  @FindBy(css = ".btn.btn-modern.new-classified.ng-binding")
  private WebElement newClassified;

  public void clickVehicle() {
    otomobil.click();
  }
  public void clickLogin(){
    loginButton.click();
  }
  public void clickNewClassified(){
    newClassified.click();
  }


  @FindBy(css = ".body > div:nth-child(6) > ul > li:nth-child(1) > a")
  private WebElement populerClassified;

  public void clickPopulerClassified() {
    populerClassified.click();
  }





}
