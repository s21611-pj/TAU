package com.example.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ReadArticleOnBaeldungTestChrome {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "executables/chromedriver.exe");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        baseUrl = "https://www.google.pl/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void readArticleOnBaeldungAndRedirectToGithubChrome() {
        driver.get("https://www.baeldung.com/");
        driver.findElement(By.xpath("//div[@id='qc-cmp2-ui']/div[2]/div/button[2]/span")).click();
        driver.findElement(By.xpath("//a[@onclick=\"javascript:ga('send', 'event', 'menu', 'click', 'new_menu_open');\"]")).click();
        driver.findElement(By.linkText("Spring REST Tutorials")).click();
        driver.findElement(By.linkText("How to Read HTTP Headers in Spring REST Controllers")).click();
        driver.findElement(By.linkText("over on GitHub")).click();
        driver.get("https://github.com/eugenp/tutorials/tree/master/spring-web-modules/spring-mvc-basics-3");
        driver.findElement(By.linkText("README.md")).click();
    }


    @After
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
