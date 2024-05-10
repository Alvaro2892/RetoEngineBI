package co.com.certification.EngineBI.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClosePopupIfPresent implements Task {

    private final Target popupCloseButton;

    public ClosePopupIfPresent(Target popupCloseButton) {
        this.popupCloseButton = popupCloseButton;
    }

    public static ClosePopupIfPresent forTarget(Target popupCloseButton) {
        return new ClosePopupIfPresent(popupCloseButton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(popupCloseButton, isVisible()).forNoMoreThan(5).seconds(), // Esperar a que el botón de cierre esté visible
                Check.whether(popupCloseButton.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(popupCloseButton))
        );
    }
}