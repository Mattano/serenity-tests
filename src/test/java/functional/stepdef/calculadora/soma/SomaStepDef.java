package functional.stepdef.calculadora.soma;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.NotImplementedException;

public class SomaStepDef {



    @Dado("que o usuario deseja realizar uma operacao de soma")
    public void que_o_usuario_deseja_realizar_uma_operacao_de_soma() {
        // Write code here that turns the phrase above into concrete actions
        throw new NotImplementedException("");
    }

    @Quando("ele  tenta somar o {double} o {double}")
    public void eleTentaSomarOPrimeiro_numeroOSegundo_numero(Double a, Double b) {
        throw new NotImplementedException("");
    }

    @Entao("o sistema deve retornar {double}")
    public void oSistemaDeveRetornarResultado(Double a) {
        throw new NotImplementedException("");
    }


}
