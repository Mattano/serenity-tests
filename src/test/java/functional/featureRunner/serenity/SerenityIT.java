package functional.featureRunner.serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/serenity/environment.feature",
        glue = "functional.stepdef"
)
public class SerenityIT {

}
