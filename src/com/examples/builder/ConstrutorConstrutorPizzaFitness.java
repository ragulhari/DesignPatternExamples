package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
 */
public class ConstrutorConstrutorPizzaFitness extends ConstrutorPizza {
    @Override
    public void construirMassa() {
        pizza.defineMassa("Massa integral");
    }

    @Override
    public void construirMolho() {
        pizza.defineMolho("Molho de tomate sem glúten");
    }

    @Override
    public void construirRecheio() {
        pizza.defineRecheio("Adicionado brócolis, queijo branco e tomate seco");
    }
}
