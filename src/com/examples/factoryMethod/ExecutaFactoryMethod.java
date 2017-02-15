package com.examples.factoryMethod;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaFactoryMethod {
    public static void go() {
        Cozinheiro c = new Cozinheiro();
        Prato f1 = c.pedePrato("BIFE");
        f1.cozinhar();
        Prato f2 = c.pedePrato("FRANGO");
        f2.cozinhar();
        Prato f3 = c.pedePrato("PEIXE");
        f3.cozinhar();

    }
}

