package com.example.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class PresidentsTestChrome {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "executables/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.pl/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testSearchPresidentsAndElectionsInfo() {
        driver.get("https://www.google.pl/");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.xpath("//*[@id='L2AGLb']")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("aleksander kwaśniewski");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='kp-wp-tab-overview']/div/div/div/div/div/div/div/div/div/div/a/h3")).click();
        driver.get("https://pl.wikipedia.org/wiki/Aleksander_Kwa%C5%9Bniewski");
        driver.findElement(By.linkText("wybory prezydenckie w Polsce w 1995 roku")).click();
        driver.get("https://pl.wikipedia.org/wiki/Wybory_prezydenckie_w_Polsce_w_1995_roku");
        driver.findElement(By.xpath("//div[@id='mw-content-text']/div/table[2]/tbody/tr[2]/td[2]/b/a")).click();
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