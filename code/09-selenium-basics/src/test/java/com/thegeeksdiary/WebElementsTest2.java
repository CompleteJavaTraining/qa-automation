package com.thegeeksdiary;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.UriSelector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class WebElementsTest2 {
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
    public void generalImageOperations(){
        driver.get("https://localhost:7172/");
        WebElement dogImage = driver.findElement(By.id("dogimg"));
        String srcAttribute = dogImage.getAttribute("src");
        assert srcAttribute.contains("randomdog.jpg");
    }

    @Test
    public void linkImageOperations(){
        driver.get("https://localhost:7172/");
        WebElement dogImage = driver.findElement(By.id("dogimg"));
        WebElement dogImageLinkParent = driver.findElement(By.id("privacylink"));
        String srcAttribute = dogImage.getAttribute("src");
        String linkHref = dogImageLinkParent.getAttribute("href");
        assert linkHref.contains("privacy");
        assert srcAttribute.contains("randomdog.jpg");
        dogImage.click();
        String newUrl = driver.getCurrentUrl();
        assert newUrl.contains("/privacy");
    }

    @Test
    public void buttonImageOperations(){
        driver.get("https://localhost:7172/");
        WebElement dogImage = driver.findElement(By.id("submit"));
        String srcAttribute = dogImage.getAttribute("src");
        assert srcAttribute.contains("randomdog.jpg");
        dogImage.click();
        String newUrl = driver.getCurrentUrl();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assert !(driver.getTitle().contains("not secure"));
        assert newUrl.contains("google.com");
    }

    @Test
    public void dropDownOperations() throws InterruptedException{
        driver.get("https://localhost:7172/");
        Thread.sleep(2000);
        Select dropDown = new Select(driver.findElement(By.id("selectGrade")));
        List<WebElement> options = dropDown.getOptions();
        assert options.size() == 5;
        String aGradeText = options.get(0).getText();
        String bGradeText = options.get(1).getText();
        assert aGradeText.equals("A Grade");
        assert bGradeText.equals("B Grade");
        dropDown.selectByIndex(3);
        Thread.sleep(2000);
        dropDown.selectByVisibleText("C Grade");
        Thread.sleep(2000);
        dropDown.selectByValue("E");
    }

    @Test
    public void checkBoxOperations() throws InterruptedException{
        driver.get("https://localhost:7172/");
        WebElement checkBox = driver.findElement(By.id("rememberme"));
        Thread.sleep(5000);
        checkBox.click();
        assert checkBox.isSelected();
        Thread.sleep(5000);
        checkBox.click();
        assert !(checkBox.isSelected());
        assert checkBox.isDisplayed();
        assert checkBox.isEnabled();
    }

    @Test
    public void tableOperations() throws InterruptedException{
        driver.get("https://localhost:7172/");
        WebElement tableItem = driver.findElement(By.xpath(".//*[@id='students']/tbody/tr[2]/td"));
        assert tableItem.getText().equals("Oliver Smith");
        WebElement table = driver.findElement(By.id("students"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        assert rows.size() == 3;
        List<WebElement> cells = table.findElements(By.tagName("td"));
        assert cells.size() == 4;
    }

    @Test
    public void frameOperations() throws InterruptedException{
        driver.get("https://localhost:7172/");
        driver.switchTo().frame(0);

        WebElement error = driver.findElement(By.id("main-frame-error"));
        List<WebElement> divs = error.findElements(By.tagName("div"));
        System.out.println(divs.size());
        driver.switchTo().defaultContent();
    }

    @Test
    public void mouseMovement() throws InterruptedException{
        driver.get("https://localhost:7172/");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        WebElement btn1 = driver.findElement(By.id("btn1"));
        WebElement btn2 = driver.findElement(By.id("btn2"));
        actions.moveToElement(btn1, 10, 10).build().perform();;
        Thread.sleep(5000);
        actions.moveToElement(btn2, 10, 10).build().perform();;
        Thread.sleep(5000);
    }

    @Test
    public void browserHandlin() throws InterruptedException{
        driver.get("https://localhost:7172/");
        driver.get("https://localhost:7172/");
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles.size());
    }

    @Test
    public void handleMultiObjects() throws InterruptedException{
        driver.get("https://localhost:7172/");
         List<WebElement> elements = driver.findElements(By.xpath("//div"));
         for (WebElement webElement : elements) {
            System.out.println(webElement.getAttribute("class"));
            if(webElement.getAttribute("class").equals("btn btn-primary")){
                webElement.click();
            }
         }
    }
}
