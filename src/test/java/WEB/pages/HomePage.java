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

public class HomePage extends BaseTest {

    WebDriver driver;
    private WebDriverWait wait;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By hamburgerMenu = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By logoutButton = By.xpath("//*[@id=\"logout_sidebar_link\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void validateOnHomePage(){
        WebElement element = driver.findElement(productTitle);
        assertTrue(element.isDisplayed());
        assertEquals("Sauce Labs Backpack", element.getText());
    }

    public void clickHamburgerMenu(){
        driver.findElement(hamburgerMenu).click();
    }

    public void clickLogoutButton(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        element.click();
    }
}
