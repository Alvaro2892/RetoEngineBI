package co.com.certification.EngineBI.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIContactUs
{
    public static final Target CLICKCONTACTUS = Target.the("Click on Contact Us").located(By.xpath("(//a[contains(text (), 'Contact')])[2]"));
    public static final Target ENTERFIRSTNAME = Target.the("Enter first name ").located(By.xpath("(//input[@class= 'large'])[1]"));
    public static final Target ENTERLASTNAME = Target.the("Enter last name ").located(By.xpath("(//input[@class= 'large'])[2]"));
    public static final Target ENTEREMAIL = Target.the("Enter email ").located(By.xpath("(//input[@class= 'large'])[3]"));
    public static final Target SELECTREASON = Target.the("Select reason ").located(By.xpath("(//select[@class= 'large gfield_select'])[2]"));
    public static final Target ENTERMESSAGE = Target.the("Enter message ").located(By.xpath("(//textarea[@class = 'textarea medium'])"));
    public static final Target CLICKONBUTTONSEND = Target.the("Click on button submit ").located(By.xpath("(//input[@class = 'gform_button button'])"));



}
