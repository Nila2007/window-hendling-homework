package org.example;
 // ++++++++ Reusable method have WebDriver and method ++++++++++++++++++=
 //+++++++++Crate parent child ( IS-A) Relation ++++++++++++++
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseTest extends Utils11 {
    BrowserManager browserManager = new BrowserManager();


    @BeforeSuite
    public void toVerifyThatUserOnHomePage(){
        browserManager.setBrowser();
        browserManager.typeTheUrl();
    }

    @AfterSuite
    public void CloseBrowser(ITestResult result) { //Method to close browser
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenShotCapture(result.getName()+timestamp());

        }
        //browserManager.closeBrowser();
    }

        }







