package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class VerifyProductAdditionToComparasionList extends MainPage {


    @Test
    public void testProductAdditionToTheList() throws InterruptedException {

        new MainPage()
                .openHomePage()
                .addItemToComparasionList()
                .closePopUpWindow()
                .openTabPage("Сравнение товаров");
        Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(), 'Товары для сравнения')]")).isDisplayed());
    }
}

