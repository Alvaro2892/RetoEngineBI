package co.com.certification.EngineBI.stepdefinitions;

import co.com.certification.EngineBI.model.ConstructorVar;
import co.com.certification.EngineBI.questions.QVerify;
import co.com.certification.EngineBI.questions.QVerifyFreeAcoount;
import co.com.certification.EngineBI.tasks.SentForm;
import co.com.certification.EngineBI.tasks.SentFormFreeAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepFreeAccount
{


    @When("the user goes to the free account and fills out the form")
    public void theUserGoesToTheFreeAccountAndFillsOutTheForm(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(SentFormFreeAccount.webSiteEngineBI(constructorVars));
    }
    @Then("the user should see the next confirmation message {string}")
    public void theUserShouldSeeTheNextConfirmationMessage(String VerifyMessage)
    {
        theActorInTheSpotlight().should(seeThat(QVerifyFreeAcoount.messageWebSiteEngineBI(VerifyMessage)));
    }

}
