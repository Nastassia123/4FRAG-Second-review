package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class VerifyProductsCatalogOptions extends MainPage {

    @Test
    public void testChooseProductFromCatalog() throws InterruptedException {

        new MainPage()
                .openHomePage()
                .chooseProductCategory()
                .checkBrandOfChosenProduct()
                .filloutInputFormaxPrice()
                .clickOnTheProductTypeDropDown()
                .chooseProductFromProductTypeDropDown()
                .filloutInputDPIAndCPIResolutionValue()
                .chooseProductSubCategoryFromResultList()
                .addProductToWishListFromResultList()
                .closePopUpWindow()
                .openProductInTheWishListPage();
        Assert.assertTrue(driver.findElement(By.id("item-product-inner")).isDisplayed());
    }
}
