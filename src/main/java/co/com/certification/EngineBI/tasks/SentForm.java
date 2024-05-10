package co.com.certification.EngineBI.tasks;

import co.com.certification.EngineBI.model.ConstructorVar;
import co.com.certification.EngineBI.userinterface.UIContactUs;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class SentForm implements Task
{

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String message = faker.lorem().sentence();

    private List<ConstructorVar> constructorVars;


    public SentForm (List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static SentForm contactUsEngineBI(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(SentForm.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars)
        {
            actor.attemptsTo
                    (
                            //ClosePopupIfPresent.forTarget(UIContactUs.POPUP_CLOSE_BUTTON),
                            Click.on(UIContactUs.CLICKCONTACTUS),
                            Enter.theValue(constructorVar.getFirstName()).into(UIContactUs.ENTERFIRSTNAME),
                            Enter.theValue(constructorVar.getLastName()).into(UIContactUs.ENTERLASTNAME),
                            Enter.theValue(constructorVar.getEmail()).into(UIContactUs.ENTEREMAIL),
                            SelectFromOptions.byVisibleText(constructorVar.getReason()).from(UIContactUs.SELECTREASON),
                            Enter.theValue(message).into(UIContactUs.ENTERMESSAGE),
                            Click.on(UIContactUs.CLICKONBUTTONSEND)

                            );
        }
    }
}
