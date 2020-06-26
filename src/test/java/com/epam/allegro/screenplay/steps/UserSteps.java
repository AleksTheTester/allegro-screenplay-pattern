package com.epam.allegro.screenplay.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import pageobjects.pages.LoginPage;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserSteps {
    @Before
    public void prepareTests() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().wasAbleTo(Start.openStartPage());
    }

    @Given("User open allegro login page")
    public void user_open_login_page() {
        theActorInTheSpotlight().attemptsTo(CloseGdprWindow.close());
        theActorInTheSpotlight().attemptsTo(OpenLoginPage.open());
    }

    @When("User type {string} and {string}")
    public void user_type_and(String login, String password) {
        theActorInTheSpotlight().attemptsTo(LoginToService.login(login, password));
    }

    @When("User click login button")
    public void user_click_login_button() {
        theActorInTheSpotlight().attemptsTo(ClickOnLoginButton.click());
    }

    @Then("User should see validation message")
    public void user_should_see_validation_message(List<String> alert) {
        Ensure.that(LoginPage.ALERT_MESSAGE).text().contains(alert.toString());
    }

    @Then("User should not see validation message")
    public void user_should_not_see_validation_message() {
        Ensure.that(LoginPage.ALERT_MESSAGE).text().isBlank();
    }
}
