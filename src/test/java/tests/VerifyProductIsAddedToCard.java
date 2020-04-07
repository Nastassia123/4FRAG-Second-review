package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class VerifyProductIsAddedToCard extends MainPage {


    @Test
    public void testAdditionProductToCard() {
        new MainPage()
                .openHomePage()
                .addProductToCard()
                .closePopUpWindow()
                .goToTheCardPage();
        //    .initiateOrder("Оформить заказ");
        Assert.assertTrue(driver.findElement(By.xpath("//table[contains(@id, 'page-cart-table-responsive')]//tbody//tr//td")).isDisplayed());


    }
}
