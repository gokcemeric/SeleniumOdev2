package com.pageobjectmodel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest implements TestWatcher {
  private static final Logger logger = LogManager.getLogger();

  WebDriver driver;
  WebDriverWait wait;

  @BeforeAll
  public static void beforeall() {
    WebDriverManager.chromedriver().setup();
  }


  @BeforeEach
  public void beforeTest() {
    driver = new ChromeDriver();
    logger.info("Before method çalıştı.");
    waitPageLoad();
    setCookie();
    driver.get("https://sahibinden.com");
  }
  public void waitPageLoad(){
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
    driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MINUTES);
    driver.manage().window().maximize();
  }
  public void setCookie(){
    List<Cookie> cookieList = new ArrayList<>();
    cookieList.add(new Cookie("testBox", "184", ".sahibinden.com", "/", null));
    cookieList.add(new Cookie("tbSite", "x", ".sahibinden.com", "/", null));
    cookieList.add(new Cookie("OptanonConsent", "true"));
    cookieList.add(new Cookie("OptanonAlertBoxClosed", "true"));
    cookieList.forEach(cookie -> driver.manage().addCookie(cookie));


    LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
    localStorage.setItem("feature_discovery_data",
            "{\"add-to-favorites\":{\"count\":1,\"displayedAt\":1666694107010},\"extended\":true}");

    SessionStorage sessionStorage = ((WebStorage) driver).getSessionStorage();
    sessionStorage.setItem("feature_discovery_displayed", "true");
  }

  @AfterEach
  public void afterTest() {
    logger.info("After method çalıştı.");
    driver.quit();
  }
}
