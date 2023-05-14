package com.thegeeksdiary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeepSingh\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void cleanup(){
        if(driver!=null){
            driver.quit();
        }
    }

    void loadUrlAndCheckTitle(WebDriver driver, String url, String expectedTitle){
        driver.get(url);
        Assert.assertEquals(driver.getTitle().toLowerCase(), expectedTitle.toLowerCase());
    }
    @Test(priority = 1)
    public void verifyTitleOfGoogle() throws InterruptedException{
        loadUrlAndCheckTitle( driver, "https://www.google.com", "Google");
    }

    @Test(priority = 2)
    public void verifyTitleOfBing() throws InterruptedException{
        loadUrlAndCheckTitle( driver, "https://www.bing.com", "Bing");
    }
}
