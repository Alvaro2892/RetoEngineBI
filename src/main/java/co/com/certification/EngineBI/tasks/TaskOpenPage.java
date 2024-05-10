package co.com.certification.EngineBI.tasks;

import co.com.certification.EngineBI.userinterface.OpenPageEngineBI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskOpenPage implements Task
{
    private OpenPageEngineBI openPageEngineBI;

    public static TaskOpenPage EngineBI()
    {
        return Tasks.instrumented(TaskOpenPage.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Open.browserOn(openPageEngineBI)

                );
    }
}