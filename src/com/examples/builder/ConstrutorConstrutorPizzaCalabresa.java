package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
 */
public class ConstrutorConstrutorPizzaCalabresa extends ConstrutorPizza {
    @Override
    public void construirMassa() {
        pizza.defineMassa("Massa com farinha refinada");
    }

    @Override
    public void construirMolho() {
        pizza.defineMolho("Molho de tomate");
    }

    @Override
    public void construirRecheio() {
        pizza.defineRecheio("Adicionando calabresa, cebola e mussarela");

    }
}
