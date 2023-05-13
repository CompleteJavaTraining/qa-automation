package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.util.concurrent.ExecutionError;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class AppTest {

    final static String browser = "chrome";// [chrome, edge, both]
    private WebDriver edgeDriver;
    private WebDriver chromeDriver;

    void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeepSingh\\chromedriver_win32\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    void setupEdge() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PradeepSingh\\edgedriver_win64\\msedgedriver.exe");
        edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    void destroyChrome(){
        chromeDriver.quit();
    }
    void destroyEdge(){
        edgeDriver.quit();
    }

    @BeforeEach
    public void setUp() {
        if (browser.equals("chrome")) {
            setupChrome();
        } else if (browser.equals("edge")) {
            setupEdge();
        } else {
            setupChrome();
            setupEdge();
        }
    }

    @AfterEach
    public void tearDown() {
        if(browser.equals("chrome")){
            destroyChrome();
        } else if (browser.equals("edge")){
            destroyEdge();
        } else {
            destroyChrome();
            destroyEdge();
        }
    }

    void testWebpageLoading(WebDriver driver) throws InterruptedException{
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        String pageTitle = driver.getTitle();
        assert pageTitle.equals("Google");
    }

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver;
        if(browser.equals("chrome")){
            driver = chromeDriver;
            testWebpageLoading(driver);
        } else if (browser.equals("edge")){
            driver = edgeDriver;
            testWebpageLoading(driver);
        } else {
            driver = chromeDriver;
            testWebpageLoading(driver);
            driver = edgeDriver;
            testWebpageLoading(driver);
        }
    }
}
