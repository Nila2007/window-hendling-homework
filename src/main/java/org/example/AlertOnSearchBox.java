package org.example;
     /* Verify The Alert Message */
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlertOnSearchBox extends Utils11 {
          //************  Store the locators****************|
    private By _clickOnSearchButton = By.xpath("//input[@class='button-1 search-box-button']");

          //************ Method For Verifying the Alert Message **********|
        public void verifyTheAleartMessage()
        {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        //  Store the Expected Result in String ******
        String Expected = "Please enter some search keyword";
        System.out.println(alertMessage);
        Assert.assertEquals(alertMessage,Expected);
        alert.accept();
        }
}

