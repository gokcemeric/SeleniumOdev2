package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewClassifiedStep4 extends BasePage{
    public NewClassifiedStep4(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(css = ".add-classified.ng-scope > div.ng-scope > p.submit-promotion.ng-scope > button")
    private WebElement continueDopingButton;

    public void clickContinueDoping(){
        wait.until(ExpectedConditions.elementToBeClickable(continueDopingButton));
        continueDopingButton.click();
    }
}
