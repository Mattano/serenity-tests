package functional.featureRunner.calculadora.soma_subtracao;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/calculadora/soma_subtracao/soma.feature",
        glue = "functional.stepdef"
)
public class SomaIT {
}
