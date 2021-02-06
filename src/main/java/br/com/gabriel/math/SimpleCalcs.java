package br.com.gabriel.math;

/**
 * Classe para testes que faz alguns calculos simples
 */
public class SimpleCalcs {


    public int sum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return a + b;
    }

    public int multiplicador(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        if (a == 1) {
            return b;
        }

        if (b == 1) {
            return a;
        }

        return a * b;
    }


}
