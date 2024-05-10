package co.com.certification.EngineBI.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIVerifyMessageContactUs
{
    public static final Target VERIFYMESSAGECONTACTUS = Target.the("Verify message contact us ").located(By.xpath("(//h2[contains(text (), 'Thanks for reaching out!')])"));

}
