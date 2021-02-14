package functional.stepdef.calculadora.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.HttpBinDto;
import functional.steps.ApiSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;
import net.thucydides.core.annotations.NotImplementedException;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.mockito.internal.hamcrest.HamcrestArgumentMatcher;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;


public class HttpBinStepDef {

    @Steps
    private ApiSteps api;
    private Response response;


    @Dado("um usuario que deseja enviar requisicao rest")
    public void um_usuario_que_deseja_enviar_requisicao_rest() {
        // Write code here that turns the phrase above into concrete actions
        assertThat(
                api.prepare()
                , is(true)
        );

    }


    @Quando("realizo uma requisicao GET para {string}")
    public void realizoUmaRequisicaoGETPara(String request) throws JsonProcessingException {
        response = api.realizaGet(request);
        assertThat(
                request
                , not(nullValue())
        );
    }

    @Entao("devo receber o codigo {int} na minha requisicao")
    public void devoReceberOCodigoNaMinhaRequisicao(int statusCode) {
        api.validaStatusCode(response, statusCode);
    }

    @E("o corpo da resposta deve conter os seguintes valores:")
    public void oCorpoDaRespostaDeveConterOsSeguintesValores(Map<String, String> chave) {
        if(Objects.isNull(response)){
            Assert.fail("Objeto response é nulo");
        }
        api.validarCorpo(response,chave);
    }

    @Dado("um usuario autenticado")
    public void umUsuarioAutenticado() {
        throw new NotImplementedException("Implement this first!");
    }

    @Quando("eu acesso um recurso protegido")
    public void euAcessoUmRecursoProtegido() {
        throw new NotImplementedException("Implement this first!");
    }

    @Entao("obtenho autorizacao pelo sistema de autenticacao")
    public void obtenhoAutorizacaoPeloSistemaDeAutenticacao() {
        throw new NotImplementedException("Implement this first!");
    }
}
