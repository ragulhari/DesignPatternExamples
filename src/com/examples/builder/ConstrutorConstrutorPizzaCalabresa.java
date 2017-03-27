package com.examples.builder;

/**
 * A classe define como se constrói uma pizza do tipo "Calabresa". A classe define como construir
 * cada um dos componentes da pizza (massa, molho, recheio). Apenas essa classe sabe os detalhes de
 * sua implementação.
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
