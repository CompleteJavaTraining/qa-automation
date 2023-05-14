package com.thegeeksdiary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

enum Browsers {
    chrome,
    edge,
    all
}

public class DriverHolder {
    public final WebDriver[] drivers;

    public DriverHolder(Browsers browsers) {
        if(browsers == Browsers.chrome || browsers == Browsers.edge){
            drivers = new WebDriver[1];
            if(browsers == Browsers.chrome){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeepSingh\\chromedriver_win32\\chromedriver.exe");
                drivers[0] = new ChromeDriver();
            }
            if(browsers == Browsers.edge){
                System.setProperty("webdriver.edge.driver", "C:\\Users\\PradeepSingh\\edgedriver_win64\\msedgedriver.exe");
                drivers[0] = new EdgeDriver();
            }
        } else {
            drivers = new WebDriver[2];
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeepSingh\\chromedriver_win32\\chromedriver.exe");
            drivers[0] = new ChromeDriver();
            System.setProperty("webdriver.edge.driver", "C:\\Users\\PradeepSingh\\edgedriver_win64\\msedgedriver.exe");
            drivers[1] = new EdgeDriver();
        }
    }

    public void Cleanup(){
        for (WebDriver webDriver : drivers) {
            webDriver.quit();
        }
    }
}
