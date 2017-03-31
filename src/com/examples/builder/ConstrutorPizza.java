package com.examples.builder;

/**
 * A classe ConstrutorPizza tem a responsabilidade de definir o esqueleto de uma pizza. Todas as pizzas
 * devem estender essa classe. Ela contém métodos básicos, como a definição de um novo objeto pizza,
 * e métodos abstratos que deverão ser implementados por cada tipo.
 */
public abstract class ConstrutorPizza {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void construirNovaPizza() { pizza = new Pizza(); }

    public abstract void construirMassa();
    public abstract void construirMolho();
    public abstract void construirRecheio();
}
