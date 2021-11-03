package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    public LoginPage (WebDriver driver) { this.driver = driver;}


    By emailOrPhoneInput = By.id("email");
    By passwordInput = By.id("pass");
    By clickLoginBtn = By.name("login");

    @Step ("Fill email or phone field: {0}")
    public LoginPage FillEmailOrPhone(String emailOrPhone) {
        driver.findElement(emailOrPhoneInput).sendKeys(emailOrPhone);
        return this;
    }
    @Step ("Fill password: {0}")
    public LoginPage FillPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }
    @Step ("Click Login button: {0}")
    public LoginPage ClickLoginBtn() throws InterruptedException {
        driver.findElement(clickLoginBtn).click();
        Thread.sleep(2000);
        return this;
    }
}
