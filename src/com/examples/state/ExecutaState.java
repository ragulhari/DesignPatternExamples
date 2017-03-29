package com.examples.state;

/**
 * Classe inicial do exemplo.
 *
 * Utilizamos como exemplo para pattern State o gerenciamento dos estados de um motor. Existem
 * três status possíveis para o motor: "ligado", "desligado" e "em resfriamento". Cada estado é implementado
 * por uma classe específica.
 *
 * Para ilustrar a verificação de regras de negócio para cada status, adotamos que um motor só pode transitar
 * nos seguintes status:
 *
 * Desligado -> Ligado -> Em Resfriamento -> Desligado
 *
 * Qualquer utilização diferente dessa sequência irá gerar um erro no sistema. Cada estado mantém uma quantidade
 * de cilindros funcionando e um valor de rotação padrão. O exemplo executa a transição entre esses estados.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaState {
    public static void go() {

        Motor c = new Motor();
        Desligado desl = new Desligado();
        Ligado lig = new Ligado();
        EmResfriamento resf = new EmResfriamento();

        //Inicia a transição entre os estados. Em caso de uso errado da sequẽncia um erro é disparado.
        System.out.println("Vamos ligar o motor");
        lig.Executar(c);
        desl.Executar(c);
        resf.Executar(c);
        lig.Executar(c);
        desl.Executar(c);


    }

}
