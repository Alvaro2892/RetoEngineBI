package co.com.certification.EngineBI.stepdefinitions;

import co.com.certification.EngineBI.model.ConstructorVar;
import co.com.certification.EngineBI.questions.QVerify;
import co.com.certification.EngineBI.tasks.SentForm;
import co.com.certification.EngineBI.tasks.TaskOpenPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepContactUs
{

    @Given("that the user is on the EngineBI homepage")
    public void thatTheUserIsOnTheEngineBIHomepage()
    {
        theActorCalled("Alvaro").wasAbleTo(TaskOpenPage.EngineBI());
    }

    @When("the user selects the contact us option, they should be able to fill out the form")
    public void theUserSelectsTheContactUsOptionTheyShouldBeAbleToFillOutTheForm(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(SentForm.contactUsEngineBI(constructorVars));
    }
    @Then("the user should see the confirmation message {string}")
    public void theUserShouldSeeTheConfirmationMessage(String VerifyMessage)
    {

        theActorInTheSpotlight().should(seeThat(QVerify.messageWebSite(VerifyMessage)));

    }
}
