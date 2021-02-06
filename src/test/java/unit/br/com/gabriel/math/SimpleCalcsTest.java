package unit.br.com.gabriel.math;

import org.junit.Assert;
import org.junit.Test;
import br.com.gabriel.math.SimpleCalcs;

public class SimpleCalcsTest {



    @Test
    public void retornarMultiplicacaoDeDoisNumeros() {
        int a = 5;
        int b = 3;

        SimpleCalcs sc = new SimpleCalcs();

        Assert.assertTrue("Resultado deve ser 15", sc.multiplicador(5,3) == 15);

    }




}
