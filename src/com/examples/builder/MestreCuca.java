package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
 */
public class MestreCuca {
    private ConstrutorPizza construtor;

    public void definirTipoPizza(ConstrutorPizza construtor) { this.construtor = construtor; }
    public Pizza getPizza() { return construtor.getPizza(); }

    public void constructPizza() {
        construtor.construirNovaPizza();
        construtor.construirMassa();
        construtor.construirMolho();
        construtor.construirRecheio();
    }

}
