package projetotricentis;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"junit:projetoTricentisResults.xml" }, 
monochrome = true, 
features = {
		"src/main/java/projetotricentis/SolicitaSeguro.feature",
		},
glue = "projetotricentis"
)

public class SolicitaSeguroTest {

}
