package com.thegeeksdiary.seleniumdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://www.google.com");
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testGoogleSearch() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);    //simulate enter key press

        // Check if the search results contain the expected text
        WebElement searchResult = driver.findElement(By.xpath("//textarea[contains(text(), 'Selenium WebDriver')]"));
        assert searchResult.isDisplayed();
    }

    @Test
    public void testSearchResultList() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java and Selenium Training By TheGeeksDiary.com");
        searchBox.sendKeys(Keys.RETURN);

        List<WebElement> searchResults = driver.findElements(By.cssSelector("div#search div.g"));

        // Check if at least 5 search results are displayed
        assert searchResults.size() >= 5;
    }
}
