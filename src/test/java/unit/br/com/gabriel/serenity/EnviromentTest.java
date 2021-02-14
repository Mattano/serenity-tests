package unit.br.com.gabriel.serenity;

import cucumber.runtime.SerenityBackend;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class EnviromentTest {




    @Test
    public void checkEnviroment(){
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String token  = variables.getProperty("token");
        System.out.println(token);
        Assert.assertTrue(token.equals("meu token"));
    }
}
