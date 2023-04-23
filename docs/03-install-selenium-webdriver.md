## Steps to Install Selenium WebDriver for Chrome using Maven and VSCode

1. **Download ChromeDriver:**
   - Visit the official ChromeDriver download page: [https://sites.google.com/a/chromium.org/chromedriver/downloads](https://sites.google.com/a/chromium.org/chromedriver/downloads)
   - Download the appropriate version of ChromeDriver for your installed version of Google Chrome.
   - Extract the downloaded archive to a directory of your choice.

2. **Create a new Maven project in VSCode:**
   - Press `Ctrl+Shift+P` to open the Command Palette in VSCode.
   - Type "Maven: Create Maven Project" in the search bar and press Enter.
   - Select "Create a simple project (skip archetype selection)".
   - Choose a directory to store your project, and click "Select Folder".
   - Provide the following details for your project:
     - groupId: (e.g., "com.example")
     - artifactId: (e.g., "selenium-chrome-project")
     - version: (e.g., "1.0.0-SNAPSHOT")
     - package: (e.g., "com.example.selenium")

3. **Add Selenium WebDriver dependencies to the Maven project:**
   - In the project folder, open the `pom.xml` file.
   - Add the following dependencies inside the `<dependencies>` section:
     ```xml
     <dependency>
       <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.3.2</version>
     </dependency>
     <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
     </dependency>
     ```
   - Save the `pom.xml` file. Maven will automatically download the specified dependencies.

4. **Write a simple Selenium test using Chrome WebDriver:**
   - In the "src/test/java" folder, create a new Java class file (e.g., "SeleniumChromeTest.java").
   - Write a simple Selenium test using the following code:
     ```java
     package com.example.selenium;

     import org.junit.Test;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;

     public class SeleniumChromeTest {
       @Test
       public void openGoogle() {
         WebDriver driver = null;
         WebDriverManager.chromedriver().browserVersion("77.0.3865.40").setup(); //Or for latest version: WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
         options.addArguments("start-maximized"); 
         options.addArguments("enable-automation"); 
         options.addArguments("--no-sandbox"); 
         options.addArguments("--disable-infobars");
         options.addArguments("--disable-dev-shm-usage");
         options.addArguments("--disable-browser-side-navigation"); 
         options.addArguments("--disable-gpu"); 
         driver = new ChromeDriver(options); 
         driver.get("https://www.google.com/"); 
         driver.quit();
       }
     }
     ```

5. **Run the Selenium test:**
   - Right-click on the "SeleniumChromeTest.java" file and choose "Run Java".
   - The test will be executed, and you should see the Chrome browser open, navigate to google.com, and then close.
