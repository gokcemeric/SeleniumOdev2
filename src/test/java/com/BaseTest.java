package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    private static final Logger logger = LogManager.getLogger();
    ChromeDriver driver;
    WebDriverWait wait;
    @BeforeEach
    public void beforeEachMethod(){
        logger.info("ChromeDriver oluşturuldu.");
        System.setProperty("webdriver.chrome.driver", "/Users/gokce.meric/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,30);
        logger.info("Before method çalıştı.");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MINUTES);
        driver.manage().window().maximize();

    }
    @AfterEach
    public void afterEachMethod(){
        logger.info("After methodu çalıştı.");
       driver.quit();
    }
}
