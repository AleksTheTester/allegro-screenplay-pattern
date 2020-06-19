package com.epam.allegro.screenplay.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Start;

public class UserSteps {
    @Before
    public void prepareTests() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().wasAbleTo(Start.openStartPage());
    }

    @Given("User open allegro home page")
    public void user_open_home_page() {

    }

    @When("User type {string} and {string}")
    public void user_type_and(String login, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click login button")
    public void user_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see validation message")
    public void user_should_see_validation_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

