package com.pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id ="username")
    public WebElement username;
    @FindBy(id ="password")
    public WebElement password;
    @FindBy(id ="userLoginSubmitButton")
    public WebElement loginSubmitButton;

    public void enterUsername(String user){
        username.sendKeys(user);
    }
    public void enterPassword(String pass){
        password.sendKeys(pass);
    }
    public void clickSubmitButton(){

        loginSubmitButton.click();
    }


}
