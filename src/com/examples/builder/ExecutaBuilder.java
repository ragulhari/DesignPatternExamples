package com.examples.builder;

/**
 * Created by ricardo on 2/27/17.
 */
public class ExecutaBuilder {

    public static void go() {
        MestreCuca cozinheiro = new MestreCuca();
        ConstrutorPizza pizzaCalabresa = new ConstrutorConstrutorPizzaCalabresa();
        ConstrutorPizza pizzaFitness = new ConstrutorConstrutorPizzaFitness();

        cozinheiro.definirTipoPizza(pizzaCalabresa);
        cozinheiro.constructPizza();

        Pizza pizza = cozinheiro.getPizza();
        System.out.println(pizza.detalharPizza());

        cozinheiro.definirTipoPizza(pizzaFitness);
        cozinheiro.constructPizza();

        Pizza pizza2 = cozinheiro.getPizza();
        System.out.println(pizza2.detalharPizza());

    }

}
