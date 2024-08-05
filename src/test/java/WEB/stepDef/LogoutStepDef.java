package WEB.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import WEB.pages.HomePage;

public class LogoutStepDef extends BaseTest{

    protected HomePage homePage;

    @When("user click hamburger button")
    public void userClickHamburgerButton() {
        homePage = new HomePage(driver);
        homePage.clickHamburgerMenu();
    }

    @Then("user click logout button")
    public void userClickLogoutButton() {
        homePage.clickLogoutButton();
    }
}
