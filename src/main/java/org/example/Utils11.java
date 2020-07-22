package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

//import java.util.function.Function;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

//****** This is ReusableMethod
public class Utils11 extends BasePage {

    public static void waitUntilElementToBeClickable(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void TypeText(By by, String text,int time){
       driver.findElement(by).sendKeys(text);
   }
    // **** click method with  Two parameter, one for time ****
    public static void clickOnElement(By by,int time){
        driver.findElement(by).click();
    }
    // **** time stamp method ****
    public static long timestamp(){
        return (System.currentTimeMillis());
    }
    // below method for get text ++++++++++
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    //select method for select for drop down list
    public static void selectFromDropDownByVisiableText(By by){
        Select select = new Select(driver.findElement(by));
        //select.selectByVisibleText(text);
    }
    public static String getTxtFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static void userRegisterSuccessfully( By by ,String text){
        getTextFromElement(by);
    }
   // public static void takeSnapShot(){

   // }
    public static void ScreenShotCapture(String NameofScreenshot) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File(("src\\ScreenShot" + NameofScreenshot + ".png")));

        } catch (IOException e) {
            e.printStackTrace();

        }




}}