package functional.stepdef.serenity;

import functional.steps.SerenityUtil;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SerenityStepDef {


    @Steps
    SerenityUtil serenityUtil;
    private List<String> variavel_ambiente = new ArrayList<>();

    @Dado("a variavel token carregada")
    public void a_variavel_token_carregada() {
        String token = serenityUtil.getPropertyAsString("token");
        assertThat(token, equalTo("meu token"));

    }

    @Quando("busco pela variavel {string}")
    public void buscoPelaVariavel(String variavel) {
        variavel_ambiente.add(serenityUtil.getPropertyAsString(variavel));
    }

    @Entao("o sistema deve retornar o resultado de acordo com o ambiente")
    public void oSistemaDeveRetornarOResultadoDeAcordoComOAmbiente() {
        Serenity.recordReportData().asEvidence().withTitle("Retorno Ambiente").andContents(variavel_ambiente.toString());
    }
}
