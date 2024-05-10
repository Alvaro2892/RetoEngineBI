package co.com.certification.EngineBI.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.EngineBI.userinterface.UIVerifyMessageContactUs.VERIFYMESSAGECONTACTUS;

public class QVerify implements Question<Boolean>
{
    private final String word;

    public QVerify(String word)
    {
        this.word = word;
    }

    public static QVerify messageWebSite(String questionv)
    {
        return new QVerify(questionv);
    }


@Override
public Boolean answeredBy(Actor actor)
    {
        //String texto = Text.of(VERIFICARMENSAJE).viewedBy(actor).asString();
        WebElementFacade webElementFacade = VERIFYMESSAGECONTACTUS.resolveFor(actor);
        String texto = webElementFacade.getText();
        return word.equals(texto);
    }
}

