package com.examples.templateMethod;

import java.util.Random;

/**
 * Implementação da partida de Basquetebol. Essa classe implementa os três métodos definidos em Partida,
 * inserindo suas regras, porém a execução desses métodos fica a cargo do TemplateMethod
 */
public class Basquetebol extends Partida {

    //Método de preparação da partida, no caso de basquete há o alinhamento dos times.
    @Override
    void prepararJogo() {

        System.out.println("-------Iniciando partida de basquetebol---------");
        System.out.println("Alinhar times no círculo central");
    }

    /*A posse inicial do basquete é definido no início da partida, ao contrário do futebol, por isso
        simulamos a definição da posse inicial por meio de um randômico no método de início.
    */
    @Override
    void iniciarPartida() {
        System.out.print("Partida iniciada! Posse de bola inicial com ");
        Random rnd = new Random();
        if (rnd.nextBoolean())
            System.out.println("Time 1");
        else
            System.out.println("Time 2");
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
        pontosTime1 = Math.abs(rnd.nextInt() % 120);
        pontosTime2 = Math.abs(rnd.nextInt() % 120);

        System.out.println("Final de partida! Placar: ");
        System.out.println("Time 1 -> " + pontosTime1 + " x " + pontosTime2 + " <- Time 2");
    }
}
