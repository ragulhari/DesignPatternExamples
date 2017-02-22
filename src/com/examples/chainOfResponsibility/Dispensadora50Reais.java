package com.examples.chainOfResponsibility;

import com.examples.chainOfResponsibility.interfaces.Dispensadora;

/**
 * Created by ricardo on 2/21/17.
 */
public class Dispensadora50Reais implements Dispensadora {

    private Dispensadora dispensadora;

    @Override
    public void definirProximoDaCadeia(Dispensadora d) {
        this.dispensadora = d;
    }

    @Override
    public void sacarDinheiro(int quantidade) {
        if (quantidade >= 50) {
            int num = quantidade/ 50;
            int faltante = quantidade % 50;
            System.out.println("Entregando " + num + " notas de R$ 50,00");
            if (faltante != 0)
                this.dispensadora.sacarDinheiro(faltante);
        }
        else
        {
            /*caso essa dispensadora não consiga atender a requisição (por exemplo, valor faltante menor que o valor
            da dispensadora) encaminha a solicitação para o próximo requisitante */
            this.dispensadora.sacarDinheiro(quantidade);
        }
    }
}
