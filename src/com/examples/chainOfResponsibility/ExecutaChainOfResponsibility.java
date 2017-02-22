package com.examples.chainOfResponsibility;

import com.examples.chainOfResponsibility.interfaces.Dispensadora;

/**
 * Created by ricardo on 2/21/17.
 */
public class ExecutaChainOfResponsibility {

    public static void go(int valorASacar) {

        Dispensadora disp1;
        Dispensadora disp2;
        Dispensadora disp3;

        disp1 = new Dispensadora50Reais();
        disp2 = new Dispensadora20Reais();
        disp3 = new Dispensadora10Reais();

        disp1.definirProximoDaCadeia(disp2);
        disp2.definirProximoDaCadeia(disp3);

        if ((valorASacar % 10) != 0) {
            System.out.println("Valor deve ser múltiplo de R$ 10,00");
        }
        else {
            disp1.sacarDinheiro(valorASacar);
        }

    }
}
