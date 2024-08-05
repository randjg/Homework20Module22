package WEB.stepDef;

import io.cucumber.java.en.Then;
import WEB.pages.HomePage;

public class HomeStepDef extends BaseTest{

    protected HomePage homePage;

    @Then("user is directed to homepage")
    public void userIsOnHomepage(){
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

}
