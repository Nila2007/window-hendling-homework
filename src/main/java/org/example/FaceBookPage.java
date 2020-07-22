package org.example;
                //********* Window Hendling on FaceBook Page ***********/
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FaceBookPage extends Utils11 {
     // Locators for this class
    private By _FacebookLogo = By.linkText("Facebook");
    private By _linkVerify = By.xpath("//i[@class='fb_logo img sp_aRLx32r9_ET sx_cd94c4']");
    private By _createNewAccount = By.xpath("//a[@class='_42ft _4jy0 _3obb _4jy6 _4jy2 selected _51sy']");
     // Method for Window hendling
    public void WindowHandleForFaceBookPage() {
        driver.getWindowHandle();
        String MainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext())
        {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow))
            {     // code to hendle windows
                driver.switchTo().window(ChildWindow);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                System.out.println(driver.switchTo().window(ChildWindow).getCurrentUrl());
               }
    } }
        public void assertByTexAndColor ()
        {   //Assert Method To Verify The Colors of the Text "Ceate Account"
            String expectedColour = "#42b72a";
            String ActualColour = driver.findElement(By.linkText("Create New Account")).getCssValue("background-color");
            String hexColour = Color.fromString(ActualColour).asHex();
            String Actulcolour = hexColour;
            Assert.assertEquals(Actulcolour, expectedColour);
            System.out.println("Button color: " + ActualColour);
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            //driver.switchTo().window("MainWindow");

        }

    } //div[@class='news-list-homepage']//div[1]//div[3]//a[1]"}

  //Using=id, value=customerCurrency

