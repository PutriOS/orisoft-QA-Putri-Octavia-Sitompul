package stepdefinitions;

import Home.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStepdefs {
    @Steps
    homePage homepage;
    @Given("I am on the Home page")
    public void iAmOnTheHomePage() {
        homepage.open();
    }

    @When("I input {string}, {string}, {string},{string},{string}")
    public void iInput(String name, String email, String password, String gender, String birth) {
        homepage.inputFieldName(name);
        homepage.inputFieldEmail(email);
        homepage.inputFieldPassword(password);
        homepage.selectChekbox();
        homepage.inputFieldGender();
        homepage.selectEmploymentStatus();
        homepage.inputFieldDateOfBirth(birth);
    }

    @And("click submit button")
    public void clickSubmitButton() {
        homepage.clickSubmitButton();
    }

    @Then("I validate {string}")
    public void iValidate(String response) {
        if(response.equals("success")) {
            homepage.validateSuccessMessage();
        }
    }
}
