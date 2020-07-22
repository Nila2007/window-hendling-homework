package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
           //********** To check the currency converter **********
public class Currency extends Utils11 {

        public void verifyTheCurrencyConverter(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // WebElement
        List<WebElement> productList = driver.findElements(By.className("prices"));
        for (WebElement product:productList)
        {
            System.out.println(product.getText());
        } }
            public void AssertByCurrency () {
            //Method to assert currency and symbol

                String expectedTitle = "€21.50";
                String actualText1 = getTextFromElement(By.xpath("//span[text()='€21.50']"));
                Assert.assertEquals(actualText1, expectedTitle);
    }
}
