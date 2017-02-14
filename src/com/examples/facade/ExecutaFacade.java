package com.examples.facade;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaFacade {

    public static void go() {
        Carro cFacade = new Carro();
        System.out.println("Ligando o carro ==> " + cFacade.ligar());
        System.out.println("Desligando o carro ==> " + cFacade.desligar());
    }
}
