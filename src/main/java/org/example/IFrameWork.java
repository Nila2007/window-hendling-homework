package org.example;

/////// ifram hendling

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElemet;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class IFrameWork extends Utils11 {
          // Locators for ifram
    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    String Expected = "Not a Friendly Topic";
    private By _AnimalName = By.xpath("//select[@id=\"animals\"]");


    public void animalName(){
         //using inbiuld method switch to go in another iframe
        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        TypeText(_TypeTopicName, "Animal Name",30);
      // iframe sequence
        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        clickOnElement(_CheckBox, 20);
        driver.switchTo().defaultContent();

    }

    public void categoryList(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-autpmation"});

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         // switch another ifrme
        driver.switchTo().frame("frame2");
        Select select = new Select(driver.findElement(_AnimalName));
        select.selectByVisibleText("Avatar");
    }
    public void verifyURL() {

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://chercher.tech/practice/frames-example-selenium-webdriver");

    }
        public void AssertTitle(){
        //Assert Title of comment
            String expectedText1 = "Frames Examples in Selenium Webdriver";
            String actualText1 = getTextFromElement(By.xpath("//h1[@class='breadcrumb-item']"));
            Assert.assertEquals(actualText1, expectedText1);
            driver.switchTo().defaultContent();
    }

}
