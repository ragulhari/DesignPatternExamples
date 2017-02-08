package com.examples.factoryMethod;

public class Frango implements Prato {
    @Override
    public void cozinhar() {
        System.out.println("Soltando um frango assado!");
    }
}
