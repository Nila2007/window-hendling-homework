package org.example;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    BrowserManager browserManager = new BrowserManager();
    HomePage homePage = new HomePage();
    AlertOnSearchBox alertOnSearchBox = new AlertOnSearchBox();
    FaceBookPage faceBookPage = new FaceBookPage();
    VerifyComment verifyComment = new VerifyComment();
    Currency currency = new Currency();
    IFrameWork iFrameWork = new IFrameWork();
    BaseTest baseTest = new BaseTest();
    Utils11 utils11 =new Utils11();


    @BeforeTest
    public void setBrowserManager()
    {   // To verify Homepage
        browserManager.setBrowser();
        browserManager.typeTheUrl();
        homePage.getTextFromeHomePage();
    }
    @Test
    public void userGetAlertMessage()
    {    //*****To verify Alert Message******
        homePage.userClickOnSearchButton();
        alertOnSearchBox.verifyTheAleartMessage();
    }
    @Test(priority = 1)
    public void clickOnFaceBookLogo()
    {      //****** inspect facebook logo and hendle windows****
        homePage.clickOnFaceBookLogo();
        faceBookPage.WindowHandleForFaceBookPage();
        faceBookPage.assertByTexAndColor();
    }
    @Test(priority = 2)
    public void Comment()
    {    // ********Type comment and verifying***********
        verifyComment.verifyComment();
        verifyComment.AssertURL();
        verifyComment.AssertComments();
    }
    @Test(priority = 3)
    public void verifyEachProductName() {
        // Assert product price on homepage, and print thier price
        homePage.currency();
        currency.verifyTheCurrencyConverter();
       currency.AssertByCurrency();
    }
     @Test(priority = 4)
    public void  clickOnIframe(){
       // ***ifame hendling
        homePage.SwichIframe();
        iFrameWork.AssertTitle();
        iFrameWork.animalName();
        iFrameWork.categoryList();
        iFrameWork.verifyURL();

    }


    }














