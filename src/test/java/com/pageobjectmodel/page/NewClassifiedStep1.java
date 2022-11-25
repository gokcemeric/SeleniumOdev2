package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewClassifiedStep1 extends BasePage {
    public NewClassifiedStep1(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".modern-category-list>.modern-category-item:nth-child(1)")
    private WebElement realEstate;
    @FindBy(css =".category-select-box-container > div > section:nth-child(2) > div > div.scroll-content > ul > li:nth-child(1) > span" )
    private WebElement housting;

    @FindBy(css =".category-select-box-container > div > section:nth-child(3) > div > div.scroll-content > ul > li:nth-child(1) > span" )
    private WebElement forSale;

    @FindBy(css =".category-select-box-container > div > section:nth-child(4) > div > div.scroll-content > ul > li:nth-child(1) > span" )
    private WebElement apartment;

    @FindBy(css = ".process-done.animation-done-scroll.ng-scope > button")
    private WebElement continueButton;


    public void clickRealEstate(){
        wait.until(ExpectedConditions.elementToBeClickable(realEstate));
        realEstate.click();
    }
    public void clickHousting(){
        wait.until(ExpectedConditions.elementToBeClickable(housting));
        housting.click();
    }
    public void clickForSale(){
        wait.until(ExpectedConditions.elementToBeClickable(forSale));
        forSale.click();
    }
    public void clickApartment(){
        wait.until(ExpectedConditions.elementToBeClickable(apartment));
        apartment.click();
    }
    public void continueButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();

    }


}
