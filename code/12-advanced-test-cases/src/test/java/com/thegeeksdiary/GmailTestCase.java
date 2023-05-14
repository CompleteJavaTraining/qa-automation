package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class GmailTestCase {

    final Browsers testBrowsers;
    final String hostname;

    public GmailTestCase() {
        testBrowsers = Browsers.chrome;
        hostname = "wikipedia.org";
    }

    DriverHolder driverHolder;

    @BeforeEach
    public void setUp() {
        driverHolder = new DriverHolder(testBrowsers);
    }

    @AfterEach
    public void tearDown() {
        driverHolder.Cleanup();
    }

    @Test
    public void testGmailLoginPositive() throws InterruptedException {
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://mail.google.com/");
            // Enter the username and password
            driver.findElement(By.id("identifierId")).sendKeys("thegeeksdiary.training@gmail.com");
            driver.findElement(By.id("identifierNext")).click();
            Thread.sleep(5000);
            boolean passwordEntered = false;

            try {
                driver.findElement(By.name("Passwd")).sendKeys("7&8t9YGj76#YR48&");
                passwordEntered = true;
            } catch (NoSuchElementException ex) {
                List<WebElement> elements = driver.findElements(By.tagName("input"));
                for (WebElement webElement : elements) {
                    if (webElement.getAttribute("type").equals("password")
                            && webElement.getAttribute("name").equals("Passwd")) {
                        webElement.sendKeys("7&8t9YGj76#YR48&");
                        passwordEntered = true;
                    }
                }
            }

            if (passwordEntered) {
                driver.findElement(By.id("passwordNext")).click();
                Thread.sleep(5000);
                String expectedUrl = "https://mail.google.com/mail/u/0/#inbox";
                String actualUrl = driver.getCurrentUrl();
                assert expectedUrl.equals(actualUrl);
                WebElement inboxLink = driver.findElement(By.linkText("Inbox"));
                WebElement starredLink = driver.findElement(By.linkText("Starred"));
                WebElement sentLink = driver.findElement(By.linkText("Sent"));
                WebElement emailList = driver.findElement(By.cssSelector("div.aDP"));
                assert inboxLink.isDisplayed();
                assert inboxLink.isEnabled();
                assert starredLink.isDisplayed();
                assert starredLink.isEnabled();
                assert sentLink.isDisplayed();
                assert sentLink.isEnabled();
                assert emailList.isDisplayed();
                assert emailList.findElements(By.tagName("div")).size() > 0;
            } else {
                assert false;
            }

        }
    }

    @Test
    public void testGmailLoginNegativeEmptyEmail() throws InterruptedException {
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://mail.google.com/");
            // Enter the username and password
            driver.findElement(By.id("identifierNext")).click();
            Thread.sleep(5000);
            assert driver.getCurrentUrl().contains("accounts.google.com");
            String expectedMessage = "Enter an email or phone number";
            WebElement errorMessage = driver.findElement(By.className("o6cuMc"));
            assert errorMessage.getText().equals(expectedMessage);
        }
    }
}
