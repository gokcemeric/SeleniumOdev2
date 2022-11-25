package com.pageobjectmodel;

import com.pageobjectmodel.page.HomePage;
import com.pageobjectmodel.page.LoginPage;
import extension.LogExtensions;
import extension.ScreenshotsExtensions;
import extension.TestStatusExtensions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({LogExtensions.class, TestStatusExtensions.class, ScreenshotsExtensions.class})

public class LoginTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    HomePage homePage;
    LoginPage loginPage;


    @BeforeEach
    public void before() {
        homePage = new HomePage(driver);
        loginPage= new LoginPage(driver);
    }
    @Tag("Login")
    @Test
    public void loginTest(){
        homePage.clickLogin();
        loginPage.enterUsername("cerensaricam");
        loginPage.enterPassword("password");
        loginPage.clickSubmitButton();
        logger.info("Kullanıcı başarılı login oldu.");
    }










}
