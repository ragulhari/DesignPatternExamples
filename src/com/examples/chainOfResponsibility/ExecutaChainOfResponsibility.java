package com.examples.chainOfResponsibility;

import com.examples.chainOfResponsibility.interfaces.Dispensadora;

/**
 * Classe inicial do exemplo.
 *
 * Sobre o exemplo:
 *
 *      O exemplo representa uma implementação da operação de saque de um caixa eletrônico (ATM)
 *      Consideramos neste exemplo que um ATM possui três dispensadores de dinheiro: um para notas
 *      de R$ 50,00, outro para R$ 20,00 e um teceiro para R$ 10,00
 *
 *      Para a implementação, consideramos que cada dispensadora é uma classe e as classes são encadeadas
 *      pelo método responsável pelo saque. Cada dispensadora avalia se ela pode participar do evento de
 *      saque. Caso não possa participar, invoca automaticamente a próxima dispensadora da cadeia. Esse
 *      ciclo se repete até o final da cadeia, finalizando a conta de notas que serão dispensadas.
 *
 * @author Ricardo D. Agulhari
 * Fevereiro/2017
 */
public class ExecutaChainOfResponsibility {

    //Para esse exemplo, o métoo Go recebe um parâmetro com o valor a ser considerado para o saque.
    public static void go(int valorASacar) {

        Dispensadora disp1;
        Dispensadora disp2;
        Dispensadora disp3;

        //Cada uma das três dispensadoras é inicializada nas três variávies
        disp1 = new Dispensadora50Reais();
        disp2 = new Dispensadora20Reais();
        disp3 = new Dispensadora10Reais();

        /*Define a cadeia de responsabilidade entre as dispensadoras. A execução começará
        por disp1, em seguida se executa disp2 e por fim, disp3.*/
        disp1.definirProximoDaCadeia(disp2);
        disp2.definirProximoDaCadeia(disp3);

        /*Para fins de exemplo, o valor a sacar considerado é multiplo de 10. Caso essa condição
        * seja satisfeita inicia a execução da cadeia.*/
        if ((valorASacar % 10) != 0) {
            System.out.println("Valor deve ser múltiplo de R$ 10,00");
        }
        else {
            disp1.sacarDinheiro(valorASacar);
        }

    }
}
