package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LoginPage extends BasePageClass {

    private static final By EMAIL_FIELD = By.id("exampleInputEmail1");

    private static final By PASSWORD_FIELD = By.id("exampleInputPassword1");


    private String getParamFromProperty(String propertyName) {
        FileInputStream fis;
        Properties properties = new Properties();
        String emailFromPropertyFile = "";
        try {
            fis = new FileInputStream("./src/test/java/resources/application.properties");
            properties.load(fis);
            emailFromPropertyFile = properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            LOGGER.warning("Check out file's path");
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return emailFromPropertyFile;
    }


    public LoginPage fillOutEmailField() {
        WebElement emailField = waitForExpectedElement(EMAIL_FIELD);
        emailField.sendKeys(getParamFromProperty("email"), Keys.ENTER);
        return this;
    }


    public PersonalAreaPage fillOutPasswordField() {
        WebElement passwordField = waitForExpectedElement(PASSWORD_FIELD);
        passwordField.sendKeys(getParamFromProperty("password"), Keys.ENTER);
        return new PersonalAreaPage();
    }


    public boolean isLoginPage() {
        new MainPage()
                .openHomePage()
                .openTabPage("Вход/регистрация");
        return driver.findElement(By.xpath("//a[contains(text(), 'Вход')]")) != null;
    }
}


