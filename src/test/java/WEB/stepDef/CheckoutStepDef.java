package WEB.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import WEB.pages.CheckoutPage;
import WEB.pages.HomePage;

public class CheckoutStepDef extends BaseTest{

    protected HomePage homePage;
    protected CheckoutPage checkoutPage;

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @And("user click an item")
    public void userClickAnItem() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickItem();
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        checkoutPage.clickAddToCartButton();
    }

    @And("user click the cart button")
    public void userClickTheCartButton() {
        checkoutPage.clickCartButton();
    }

    @When("user click the checkout button")
    public void userClickTheCheckoutButton() {
        checkoutPage.clickCheckoutButton();
    }

    @Then("user is directed to the checkout page with title {string}")
    public void userIsDirectedToTheCheckoutPageWithTitle(String pageTitle) {
        checkoutPage.validatePage(pageTitle);
    }

    @And("user input the first name with {string}")
    public void userInputTheFirstNameWith(String first_name) {
        checkoutPage.inputFirstName(first_name);
    }

    @And("user input the last name with {string}")
    public void userInputTheLastNameWith(String last_name) {
        checkoutPage.inputLastName(last_name);
    }

    @And("user input the zip code with {string}")
    public void userInputTheZipCodeWith(String zip_code) {
        checkoutPage.inputZIPCode(zip_code);
    }

    @When("user click the continue button")
    public void userClickTheContinueButton() {
        checkoutPage.clickContinueButton();
    }

    @Then("user is directed to the overview page with title {string}")
    public void userIsDirectedToTheOverviewPageWithTitle(String pageTitle) {
        checkoutPage.validatePage(pageTitle);
    }

    @When("user click the finish button")
    public void userClickTheFinishButton() {
        checkoutPage.clickFinishButton();
    }

    @Then("user should see confirmation message {string}")
    public void userShouldSeeConfirmationMessage(String pageTitle) {
        checkoutPage.validatePage(pageTitle);
    }

}
