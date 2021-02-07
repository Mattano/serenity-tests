package functional.featureRunner.calculadora.api;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/calculadora/api/http_bin.feature",
        glue = "functional.stepdef"
)
public class HttpBinIT {
}
