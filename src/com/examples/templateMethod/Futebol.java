package com.examples.templateMethod;

import java.util.Random;

/**
 * Created by ricardo on 2/8/17.
 */
public class Futebol extends Partida {
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

    @Override
    void iniciarPartida() {
        System.out.print("Juiz apita! Começa o jogo! ");
    }

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
