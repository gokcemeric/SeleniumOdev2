package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewClassifiedStep5 extends BasePage{
    public NewClassifiedStep5(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = ".add-classified.ng-scope > div.ng-scope > div > div.pre-info > div.new-add-button > a")
    private WebElement banaozelButton;

    public void clickBanaozelButton(){
        wait.until(ExpectedConditions.elementToBeClickable(banaozelButton));
        banaozelButton.click();
    }


}
