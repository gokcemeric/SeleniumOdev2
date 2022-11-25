package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewClassifiedStep3 extends BasePage{
    public NewClassifiedStep3(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = ".classified-preview-buttons.preview-btn-top.ng-scope > button")
    private WebElement continueButton;
    @FindBy(css = ".classified-preview-buttons.preview-btn-top.ng-scope > a")
    private WebElement editButton;

    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
    public void clickEditClassified(){
        wait.until(ExpectedConditions.elementToBeClickable(editButton));
        editButton.click();
    }
}
