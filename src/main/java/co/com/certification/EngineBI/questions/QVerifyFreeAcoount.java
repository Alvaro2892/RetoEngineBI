package co.com.certification.EngineBI.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.EngineBI.userinterface.UIVerifyMessageFreeAccount.VERIFYMESSAGEFREEACCOUNT;


public class QVerifyFreeAcoount implements Question<Boolean>
{
    private final String word;

    public QVerifyFreeAcoount(String word)
    {
        this.word = word;
    }

    public static QVerifyFreeAcoount messageWebSiteEngineBI(String questionv)
    {
        return new QVerifyFreeAcoount(questionv);
    }


    @Override
    public Boolean answeredBy(Actor actor)
    {
        //String texto = Text.of(VERIFICARMENSAJE).viewedBy(actor).asString();
        WebElementFacade webElementFacade = VERIFYMESSAGEFREEACCOUNT.resolveFor(actor);
        String texto = webElementFacade.getText();
        return word.equals(texto);
    }
}
