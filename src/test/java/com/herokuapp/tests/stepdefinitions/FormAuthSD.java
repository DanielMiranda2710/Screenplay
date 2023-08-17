package com.herokuapp.tests.stepdefinitions;

import com.herokuapp.automation.interactions.OpenThe;
import com.herokuapp.automation.tasks.CorrectForm;
import com.herokuapp.automation.tasks.Step3;
import com.herokuapp.automation.tasks.Step4;
import com.herokuapp.automation.ui.RegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FormAuthSD {

    RegisterPage homePage = new RegisterPage();

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Pablo").can(BrowseTheWeb.with(homePage.getDriver()));
    }
    @Given("^that a web user wants to login$")
    public void thatAWebUserWantsToLogin() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(OpenThe.browser());
    }

    @When("^he fills all the requested fields with the correct credentials$")
    public void heFillsAllTheRequestedFieldsWithTheCorrectCredentials() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(CorrectForm.auth(),
                Step3.yourDevices(), Step4.password());
        Thread.sleep(8000);

   }

    @Then("^he should see the secure area page$")
    public void heShouldSeeTheSecureAreaPage() {
        /*theActorInTheSpotlight().should(seeThat(ElementEnabled.correct(ValidationPage.SECURE_AREA_VALIDATION)));
        theActorInTheSpotlight().should(seeThat(TextEquals.correct(ValidationPage.SECURE_AREA_VALIDATION),
                equalToIgnoringCase("Welcome to the Secure Area. When you are done click logout below.")));*/
    }
}
