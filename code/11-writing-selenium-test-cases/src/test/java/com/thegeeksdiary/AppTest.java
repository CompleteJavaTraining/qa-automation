package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


/**
 * Unit test for simple App.
 */
class AppTest {
    static final Browsers testBrowsers = Browsers.all;

    static final String hostname = "wikipedia.org";

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
    public void testInternalAndExternalLinks(){
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://en.WIKIPEDIA.org/wiki/Selenium_(software)");
            WebElement elementOpenSource = driver.findElement(By.partialLinkText("open source"));
            WebElement elementGithubLink = driver.findElement(By.partialLinkText("github.com/SeleniumHQ"));
            String hrefOpenSource = elementOpenSource.getAttribute("href");
            String hrefGithub = elementGithubLink.getAttribute("href");
            assert isInternal(hostname, hrefOpenSource);
            assert !(isInternal(hostname, hrefGithub));
        }
    }

    @Test
    public void testAccountCreation(){
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
            WebElement createAccountLink = driver.findElement(By.linkText("Create account"));
            //1. The link is present
            if(createAccountLink != null){
                //2. The link should be visible
                assert createAccountLink.isDisplayed();
                //3. The link should be enabled/clickable
                assert createAccountLink.isEnabled();
            } else {
                assert false;
            }
        }
    }

    @Test
    public void testGmailLinkOnGoogle(){
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://www.google.com");
            WebElement gmailElement = driver.findElement(By.linkText("Gmail"));
            //1. The link is present
            if(gmailElement != null){
                //2. The link should be visible
                assert gmailElement.isDisplayed();
                //3. The link should be enabled/clickable
                assert gmailElement.isEnabled();
            } else {
                assert false;
            }
        }
    }

    @Test
    public void testOutlookLinkNotOnGoogle(){
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://www.google.com");
            try{
                WebElement _ = driver.findElement(By.linkText("Outlook"));
                assert false;
            } catch(NoSuchElementException ex){
                assert true;
            }
        }
    }

    @Test
    public void testRegistration() throws InterruptedException{
        for (WebDriver driver : driverHolder.drivers) {
            driver.get("https://phptravels.com/demo/");
            Thread.sleep(2000);
            WebElement firstNameTextBox = driver.findElement(By.name("first_name"));
            WebElement lastNameTextBox = driver.findElement(By.name("last_name"));
            WebElement businessNameTextBox = driver.findElement(By.name("business_name"));
            WebElement emailTextBox = driver.findElement(By.name("email"));
            WebElement numberTextBox = driver.findElement(By.id("number"));

            WebElement challenge1 = driver.findElement(By.id("numb1"));
            WebElement challenge2 = driver.findElement(By.id("numb2"));
            Integer number1 = Integer.parseInt(challenge1.getText());
            Integer number2 = Integer.parseInt(challenge2.getText());
            Integer result = number1 + number2;

            firstNameTextBox.sendKeys("Pradeep");
            lastNameTextBox.sendKeys("Singh");
            businessNameTextBox.sendKeys("The Geeks Diary");
            emailTextBox.sendKeys("pradeep@thegeeksdiary.com");
            numberTextBox.sendKeys(result.toString());

            WebElement successMessage = driver.findElement(By.cssSelector("p.text-center.cw"));
            Thread.sleep(1000);
            assert successMessage.isEnabled();
        }
    }

    private boolean isInternal(String hostName, String url){
        return url.toLowerCase().contains(hostName);
    }
}
