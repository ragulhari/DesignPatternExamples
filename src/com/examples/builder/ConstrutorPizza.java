package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
 */
public abstract class ConstrutorPizza {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void construirNovaPizza() { pizza = new Pizza(); }

    public abstract void construirMassa();
    public abstract void construirMolho();
    public abstract void construirRecheio();
}
