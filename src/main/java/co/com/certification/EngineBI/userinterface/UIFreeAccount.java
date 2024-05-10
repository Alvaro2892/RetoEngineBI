package co.com.certification.EngineBI.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIFreeAccount
{
    public static final Target CLICKSTARTNOW = Target.the("Click on start now").located(By.xpath("(//span[contains(text (), ' START NOW ')])"));
    public static final Target ENTERFIRSTNAME = Target.the("Enter first name ").located(By.id("name"));
    public static final Target ENTERLASTNAME = Target.the("Enter last name ").located(By.id("lastName"));
    public static final Target ENTEREMAIL = Target.the("Enter email ").located(By.id("email"));
    public static final Target ENTERPHONE = Target.the("Enter phone ").located(By.id("phone"));
    public static final Target CLICKONBUTTONNEXT = Target.the("Click on button next ").located(By.xpath("(//SPAN[@class= 'ng-star-inserted'])[2]"));
    public static final Target ENTERCOMPANY = Target.the("Enter company ").located(By.id("customerName"));
    public static final Target ENTERCOUNTRY = Target.the("Enter country ").located(By.id("countryId"));
    public static final Target ENTERCOUNTRYCLICK = Target.the("Enter country ").located(By.xpath("(//div[contains(text (), 'United States')])"));
    public static final Target ENTERSTATE = Target.the("Enter state ").located(By.id("stateId"));
    public static final Target ENTERSTATECLICK = Target.the("Enter state ").located(By.xpath("(//div[contains(text (), 'Alaska')])"));
    public static final Target ENTERCITY = Target.the("Enter city ").located(By.id("city"));
    public static final Target CHECKTANDC = Target.the("Click on terms and contidions ").located(By.xpath("(//input[@class='ant-checkbox-input ng-untouched ng-pristine ng-valid'])"));
    public static final Target CLICKONBUTTONNEXTP = Target.the("Click on button next ").located(By.xpath("(//SPAN[@class= 'ng-star-inserted'])[4]"));















}
