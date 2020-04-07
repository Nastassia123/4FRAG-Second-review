package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;


public class VerifyLoginFunctionality extends MainPage {


    @Test
    public void testLoginOption() {
        new MainPage()
                .openHomePage()
                .openLoginPage()
                .fillOutEmailField()
                .fillOutPasswordField();
        Assert.assertEquals(driver.getCurrentUrl(), "https://stage.4frag.ru/my-account/");
    }
}
