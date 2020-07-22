package org.example;
        //********** This code for Open The ChromeBrowser ************
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils11 {
        // set path for chrome browser
    public void setBrowser() {
        // set the cromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
        // obj ect for chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        // to maximize window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
        // type the url
        public void typeTheUrl () {
            driver.get("https://demo.nopcommerce.com/ ");
        }
        @AfterMethod
    public void closeBrowser(){
    driver.close();
}

    //src\test\BrowserDriver

    }

