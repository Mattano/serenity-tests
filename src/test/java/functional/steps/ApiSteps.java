package functional.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.HttpBinDto;
import dto.JsonDto;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.*;

public class ApiSteps {

    Logger logger = Logger.getLogger(ApiSteps.class.getName());

    @Step(value = "Preparando execução!")
    public boolean prepare() {
        logger.log(Level.INFO, "Preparando tudo");
        return true;
    }

    @Step(value = "Realizando get")
    public Response realizaGet(String request) throws JsonProcessingException {


        Response response = SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType("application/json")
                .when()
                .get(request);
        // Testes para mapear DTO

        String jsonResponse = response.getBody().jsonPath().toString();
        HttpBinDto dto = response.as(HttpBinDto.class);
        Serenity.recordReportData().asEvidence().withTitle("Java Object to JSON").andContents(dto.asJsonString(dto));
        Serenity.recordReportData().asEvidence().withTitle("Java Object").andContents(dto.getUrl() + dto.getOrigem());
        return response;
    }


    @Step(value = "Retornando se status da resposta é o esperado")
    public void validaStatusCode(Response response, int expectedStatus) {
        response.then()
                .assertThat()
                .statusCode(expectedStatus);
    }

    @Step(value = "Validando campos no corpo da resposta")
    public void validarCorpo(Response response, Map<String, String> chave) {
        chave.forEach(
                (key, value) ->
                        response.then().assertThat()
                                .body(key, equalTo(value))
        );
    }



}
