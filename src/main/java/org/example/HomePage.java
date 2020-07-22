package org.example;
      // This is home-page , verify  element that we have on homepage
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
            // Store all the Locators

public class HomePage extends Utils11 {
    private By _WelcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    private By _clickOnSearchButton = By.xpath("//input[@class='button-1 search-box-button']");
    private By _clickOnCurrencyOption = By.id("customerCurrency");
    private By _FacebookLogo = By.linkText("Facebook");
            //**** Assert text to verify that user on homepage
    public void getTextFromeHomePage() {
        getTextFromElement(_WelcomeText);
        System.out.println(_WelcomeText);
        Assert.assertEquals("Welcome to our store", "Welcome to our store");
    }
      //********* user click on search button on homepage
    public void userClickOnSearchButton() {
        clickOnElement(_clickOnSearchButton, 30);
    }

      //******* user able to select currency on homepage
    public void currency() {
        clickOnElement(_clickOnCurrencyOption, 30);
        Select currency = new Select(driver.findElement(By.cssSelector("#customerCurrency")));
        currency.selectByVisibleText("Euro");
    }
     // ********* user click on facebook logo and naviget to the facebook page
    // ********** Window hendling
    public void clickOnFaceBookLogo() {
        clickOnElement(_FacebookLogo, 30);
    }
         // get another URL , which have iframe
    public void SwichIframe() {
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        // verify from URL
        String URL = driver.getCurrentUrl();
        String Expected = "https://chercher.tech/practice/frames-example-selenium-webdriver";
        Assert.assertEquals(URL, Expected);
    }
}