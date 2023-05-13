package com.thegeeksdiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

/*
 * SOLID
 * S: Single Responsibility Principle
 * O: Open Closed Principle
 * L: Liskov Substitution Principle
 * I: Interface Segregation Principle
 * D: Dependency Inversion Principle
*/

public class AppDriverBasedTest {
    static final Browsers testBrowsers = Browsers.all;

    DriverHolder driverHolder;

    @BeforeEach
    public void setUp() {
        driverHolder = new DriverHolder(testBrowsers);
    }

    @AfterEach
    public void tearDown() {
        driverHolder.Cleanup();
    }

    void testWebpageLoading(WebDriver driver) throws InterruptedException{
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        String pageTitle = driver.getTitle();
        assert pageTitle.equals("Google");
    }

    @Test
    public void testGoogle() throws InterruptedException {
        for (WebDriver driver : driverHolder.drivers) {
            testWebpageLoading(driver);
        }
    }
}
