package com.examples.factoryMethod;


public class Cozinheiro {

    public Prato pedePrato(String tipoPrato){

        if (tipoPrato.equalsIgnoreCase("BIFE"))
            return new Bife();

        if (tipoPrato.equalsIgnoreCase("FRANGO"))
            return new Frango();

        if (tipoPrato.equalsIgnoreCase("PEIXE"))
            return new Peixe();

        return null;

    }
}
