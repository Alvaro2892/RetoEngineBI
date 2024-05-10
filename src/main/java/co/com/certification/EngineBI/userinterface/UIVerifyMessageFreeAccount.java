package co.com.certification.EngineBI.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIVerifyMessageFreeAccount
{
    public static final Target VERIFYMESSAGEFREEACCOUNT = Target.the("Verify message free account ").located(By.xpath("(//div[contains(text (), 'Your 30 Day Free Trial subscription has been successfully completed!')])"));

}
