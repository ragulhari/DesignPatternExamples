package com.examples.factoryMethod;

/**
 * Created by ricardo on 2/6/17.
 */
public class Bife implements Prato {
    @Override
    public void cozinhar() {
        System.out.println("Soltando um bife ao ponto!");
    }
}
