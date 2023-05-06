package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.UriSelector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
class AppTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeepSingh\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() {
        driver.get("https://mail.google.com/");

        // Enter the username and password
        driver.findElement(By.id("identifierId")).sendKeys("Janbask.qa");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("passwordNext")).click();

        // Verify that the login was successful
        String expectedUrl = "https://mail.google.com/mail/u/0/#inbox";
        String actualUrl = driver.getCurrentUrl();
        assert expectedUrl.equals(actualUrl);
    }

    @Test
    public void testById() {
        driver.get("https://www.pradeep.vip/");

        WebElement element = driver.findElement(By.id("aswift_0_host"));
        String style = element.getAttribute("style");
        System.out.println(style);
    }

    @Test
    public void testGetTitle() {
        driver.get("https://www.pradeep.vip/");

        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void testGetPageSource() {
        driver.get("https://www.pradeep.vip/");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @Test
    public void testGetPageUrl() {
        String loadedUrl = "https://www.pradeep.vip/";
        driver.get(loadedUrl);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        assert loadedUrl.equals(actualUrl);
        try{
            Thread.sleep(5000);
            driver.manage().window().maximize();
            driver.navigate().to("https://studiorobert.org/");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
        }
        catch (InterruptedException ex){
            System.out.println("The wait was interrupted");
        }

    }

    @Test
    public void testByName() {
        driver.get("https://www.pradeep.vip/");

        WebElement element = driver.findElement(By.name("any-name"));
        if (element != null && element.isDisplayed()) {
            String style = element.getAttribute("style");
            System.out.println(style);
        } else {
            System.out.println("Element Not Found!");
        }

    }

    @Test
    public void testByClassName() {
        driver.get("https://www.google.com/");

        try {
            WebElement element = driver.findElement(By.className("L3eUgb"));
            if (element != null && element.isDisplayed()) {
                String style = element.getAttribute("data-hveid");
                System.out.println(style);
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Element Not Found!");
        }

    }
}
