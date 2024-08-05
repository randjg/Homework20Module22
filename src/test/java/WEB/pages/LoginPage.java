package WEB.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.cssSelector("input#password");
    By loginButton = By.cssSelector("input#login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com");
    }

    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateError(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
