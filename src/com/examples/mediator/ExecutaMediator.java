package com.examples.mediator;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaMediator {

    public static void go() {
        Carro cMediator = new Carro();
        System.out.println("Ligando o carro ==> " + cMediator.ligar());
        System.out.println("Desligando o carro ==> " + cMediator.desligar());

    }
}
