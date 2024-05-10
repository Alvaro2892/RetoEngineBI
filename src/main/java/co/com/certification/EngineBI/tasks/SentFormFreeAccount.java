package co.com.certification.EngineBI.tasks;

import co.com.certification.EngineBI.model.ConstructorVar;
import co.com.certification.EngineBI.userinterface.UIContactUs;
import co.com.certification.EngineBI.userinterface.UIFreeAccount;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class SentFormFreeAccount implements Task
{

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();


    private List<ConstructorVar> constructorVars;


    public SentFormFreeAccount (List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static SentFormFreeAccount webSiteEngineBI(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(SentFormFreeAccount.class, constructorVars);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        for (ConstructorVar constructorVar : constructorVars)
        {
            actor.attemptsTo
                    (
                            Click.on(UIFreeAccount.CLICKSTARTNOW),
                            Enter.theValue(constructorVar.getFirstName()).into(UIFreeAccount.ENTERFIRSTNAME),
                            Enter.theValue(constructorVar.getLastName()).into(UIFreeAccount.ENTERLASTNAME),
                            Enter.theValue(constructorVar.getEmail()).into(UIFreeAccount.ENTEREMAIL),
                            Enter.theValue(constructorVar.getPhone()).into(UIFreeAccount.ENTERPHONE),
                            Scroll.to(UIFreeAccount.ENTERPHONE),
                            Click.on(UIFreeAccount.CLICKONBUTTONNEXT),
                            Enter.theValue(constructorVar.getFirstName()).into(UIFreeAccount.ENTERCOMPANY),
                            Click.on(UIFreeAccount.ENTERCOUNTRY),
                            Click.on(UIFreeAccount.ENTERCOUNTRYCLICK),
                            Click.on(UIFreeAccount.ENTERSTATE),
                            Click.on(UIFreeAccount.ENTERSTATECLICK),
                            Enter.theValue(constructorVar.getFirstName()).into(UIFreeAccount.ENTERCITY),
                            Click.on(UIFreeAccount.CHECKTANDC),
                            Scroll.to(UIFreeAccount.ENTERCITY),
                            Click.on(UIFreeAccount.CLICKONBUTTONNEXTP)








                            );

        }
    }
}
