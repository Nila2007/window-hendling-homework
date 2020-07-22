package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyComment extends Utils11 {
    private By _Details = By.xpath("//div[@class='news-list-homepage']//div[1]//div[3]//a[1]");
    private By _TitleBox = By.cssSelector("#AddNewComment_CommentTitle");
    private By _commentBox = By.cssSelector("#AddNewComment_CommentText");
    private By _newComment = By.name("add-comment");
    private By _storeOpenText = By.xpath("//h1[contains(text(),'New online store is open')]");
    private By _gestUser = By.xpath("//span[contains(text(),'Guest')]");
    String ExpectedSuccessfulMessage = ("News comment is successfully added");
    String ExpectedTitle = "nice product";
            public void AssertURL(){
                String URL = driver.getCurrentUrl();
                Assert.assertEquals(URL,"https://demo.nopcommerce.com/new-online-store-is-open");
            }
     public void verifyComment() {
         clickOnElement(_Details, 30);
         TypeText(_TitleBox, "Nilu", 30);
         TypeText(_commentBox, "Hello friends", 30);
         clickOnElement(_newComment, 30);
         String comment = driver.getCurrentUrl();
         System.out.println(comment);
     }
     public void AssertComments(){

         String expectedTitle = "New online store is open!";
         Assert.assertEquals(getTextFromElement(_storeOpenText), expectedTitle);




     }

}
