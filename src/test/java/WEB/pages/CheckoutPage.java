package WEB.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import WEB.stepDef.BaseTest;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckoutPage extends BaseTest {

    WebDriver driver;
    private WebDriverWait wait;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addToCartButton = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By checkoutButton = By.xpath("//*[@id=\"checkout\"]");
    By firstNameInputText = By.xpath("//*[@id=\"first-name\"]");
    By lastNameInputText = By.xpath("//*[@id=\"last-name\"]");
    By zipCodeInputText = By.xpath("//*[@id=\"postal-code\"]");
    By continueButton = By.xpath("//*[@id=\"continue\"]");
    By finishButton = By.xpath("//*[@id=\"finish\"]");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickItem(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(productTitle));
        assertTrue(element.isDisplayed());
        assertEquals("Sauce Labs Backpack", element.getText());
        element.click();
    }

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public void clickCartButton(){
        driver.findElement(cartButton).click();
    }

    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

    public void validatePage(String pageTitle){
        assertTrue(driver.getPageSource().contains(pageTitle));
    }

    public void inputFirstName(String first_name){
        driver.findElement(firstNameInputText).sendKeys(first_name);
    }

    public void inputLastName(String last_name){
        driver.findElement(lastNameInputText).sendKeys(last_name);
    }

    public void inputZIPCode(String zip_code){
        driver.findElement(zipCodeInputText).sendKeys(zip_code);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
}
