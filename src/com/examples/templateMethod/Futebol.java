package com.examples.templateMethod;

import java.util.Random;

/**
 * Implementação da partida de Futebol. Essa classe implementa os três métodos definidos em Partida,
 * inserindo suas regras, porém a execução desses métodos fica a cargo do TemplateMethod
 */
public class Futebol extends Partida {

    /*Ao contário do basquete, a posse inicial de bola é definida na preparação da partida, não no início,
    * por isso a definição (uso de randômico) é feito nesse metodo. Essa é uma regra do negócio Futebol.*/
    @Override
    void prepararJogo() {
        System.out.println("-------Iniciando partida de futebol---------");
        System.out.print("Tirando cara ou coroa, quem inicia o jogo é ");
        Random rnd = new Random();
        if (rnd.nextBoolean())
            System.out.println("Time 1");
        else
            System.out.println("Time 2");

    }

    //O início da partida efetivamente não tem grandes ações a não ser o próprio início.
    @Override
    void iniciarPartida() {
        System.out.print("Juiz apita! Começa o jogo! ");
    }

    /*
    * O encerramento da partida exibe apenas o resultado baseado em um número randômico, para fins de
    * exemplo
    * */
    @Override
    void terminarPartida() {
        int pontosTime1;
        int pontosTime2;

        Random rnd = new Random();
        pontosTime1 = Math.abs(rnd.nextInt() % 10);
        pontosTime2 = Math.abs(rnd.nextInt() % 10);

        System.out.println("Final de partida! Placar: ");
        System.out.println("Time 1 -> " + pontosTime1 + " x " + pontosTime2 + " <- Time 2");

    }
}
