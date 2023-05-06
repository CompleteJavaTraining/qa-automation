package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.UriSelector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {

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
    public void handleEditBox() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("tensorflow gpu windows 11");
        searchBox.sendKeys(Keys.RETURN);
        WebElement element = driver.findElement(By.partialLinkText("How To: Setup Tensorflow With GPU"));
        System.out.println(element.getAttribute("href"));
    }

    @Test
    public void handleEditBoxGmail() {
        driver.get("https://mail.google.com/");
        try {
            Thread.sleep(1000);
            WebElement emailField = driver.findElement(By.id("identifierId"));
            emailField.sendKeys("Janbask.qa@gmail.com");
            Thread.sleep(1000);
            emailField.clear();
            System.out.println(emailField.getText());
            if(emailField.isDisplayed()){
                System.out.println("Field is visible");
            } else {
                System.out.println("Field is not visible");
            }
            driver.findElement(By.id("identifierNext")).click();
            WebElement error = driver.findElement(By.cssSelector("div.o6cuMc.Jj6Lae"));

            String errorMessage = error.getText();
            System.out.println(errorMessage);
            assert errorMessage.equals("Enter an email or phone number");
        } catch (InterruptedException e) {
            System.out.println("Wait interrupted!");
        }

    }
}
