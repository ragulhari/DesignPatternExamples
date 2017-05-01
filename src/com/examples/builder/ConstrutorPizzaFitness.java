package com.examples.builder;

/**
 * A classe define como se constrói uma pizza do tipo "Fitness". A classe define como construir
 * cada um dos componentes da pizza (massa, molho, recheio). Apenas essa classe sabe os detalhes de
 * sua implementação.
 */
public class ConstrutorPizzaFitness extends ConstrutorPizza {
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
