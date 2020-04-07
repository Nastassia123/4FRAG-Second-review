package tests;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;




public class VerifyHeaderButtonsAreClickable extends MainPage {



    @Test
    public void testLoginButtonIsClickable(){
        LoginPage loginPage =  new MainPage()
                .openHomePage()
                .openLoginPage();
        Assert.assertTrue(loginPage.isLoginPage());
    }


    @Test
    public void testDeliveryButtonIsClickable(){

        Assert.assertTrue( new MainPage()
                .openHomePage()
                .openTabPage("Доставка").isDeliveryPage());
    }


   /* @Test
    public void testPaymentButtonIsClickable(){
        Boolean isPaymentPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Оплата");
        Assert.assertTrue(isPaymentPageDisplayed);

    }

    @Test
    public void testDiscountSystemButtonIsClickable(){
        Boolean isDiscountSystemPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Система скидок");
        Assert.assertTrue(isDiscountSystemPageDisplayed);
    }



    @Test
    public void testWarrantyButtonIsClickable(){
        Boolean isWarrantyPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Гарантия");
        Assert.assertTrue(isWarrantyPageDisplayed);
    }


    @Test
    public void testBookmarksButtonIsClickable(){
       Boolean isBookmarksPage = new MainPage()
                .openHomePage()
                .openTabPage("Закладки");
        Assert.assertTrue(isBookmarksPage);
    }



    @Test
    public void testComparasionOfProductsButtonIsClickable(){
        Boolean isComparasionListPage = new MainPage()
                .openHomePage()
                .openTabPage("Cравнение товаров");
        Assert.assertTrue(isComparasionListPage);
    }




    @Test
    public void testBasketButtonIsClickable(String basket){
          Boolean isBasketPageDisplayed = new MainPage()
                  .openHomePage()
                  .openTabPage(basket);
          Assert.assertTrue(isBasketPageDisplayed);
        }
    */}






