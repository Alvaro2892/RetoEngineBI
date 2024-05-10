package co.com.certification.EngineBI.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ContactUs.feature",
        glue = {"co.com.certification.EngineBI.stepdefinitions","co.com.certification.EngineBI.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerContactUs
{
}
