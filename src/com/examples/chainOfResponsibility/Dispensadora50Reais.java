package com.examples.chainOfResponsibility;

import com.examples.chainOfResponsibility.interfaces.Dispensadora;

/**
 * Implementação da dispensadora de R$ 50,00
 */
public class Dispensadora50Reais implements Dispensadora {

    private Dispensadora dispensadora;

    @Override
    public void definirProximoDaCadeia(Dispensadora d) {
        this.dispensadora = d;
    }

   /*
    * O método sacarDinheiro basicamente verifica se a quantidade faltante para o saque é maior ou igual ao
    * valor contido na dispensadora. Caso negativo, passa a responsabilidade para o próximo da cadeia.
    * Caso seja maior, verifica se há possibilidade de dispensar notas, vendo a quantidade de notas que pode
    * ser oferecido e o valor restante após a liberação das notas dessa dispensadora. Por fim, transfere
    * a responsabilidade para a próxima dispensadora da cadeia.
    * */
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
