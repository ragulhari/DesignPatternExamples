package com.examples.builder;

/**
 * Classe inicial do exemplo.
 *
 * O exemplo contém uma implementação básica de um builder. Para abstração, simulamos a construção
 * de pizzas diferentes.
 *
 * Cada pizza possui três passos em comum na sua construção: Escolha da massa, do molho e do recheio.
 * Independente do sabor, a pizza deve passar por essas três etapas de construção. Por isso, é possivel
 * termos uma classe que invoque a construção dessas três partes, independente de conhecer os detalhes
 * da construção. Essa classe, no nosso exemplo, é a Cozinheiro.
 *
 * No exemplo, temos dois sabores de pizza, calabresa e fitness. Cada uma delas implementa os três passos
 * de sua construção (massa, molho, recheio) e só ela sabe os detalhes de sua implementação.
 *
 * O exemplo então consiste na invocação da classe Cozinheiro, passando no método "definirTipoPizza"
 * a pizza que será construída. Em seguida, utilizamos o método "constructPizza" para executar as ações
 * de construção. Ao final temos um objeto Pizza construído.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaBuilder {

    public static void go() {

        //Define os objetos utilizados, o Cozinheiro e os dois tipos de pizza diferentes
        Cozinheiro cozinheiro = new Cozinheiro();
        ConstrutorPizza pizzaCalabresa = new ConstrutorPizzaCalabresa();
        ConstrutorPizza pizzaFitness = new ConstrutorPizzaFitness();

        //Executa a construção de uma pizza do tipo "Calabresa"
        cozinheiro.definirTipoPizza(pizzaCalabresa);
        cozinheiro.constructPizza();

        //Após a construção, devolve o objeto construído para um objeto Pizza.
        Pizza pizza = cozinheiro.getPizza();
        System.out.println(pizza.detalharPizza());

        //Executa a construção de uma pizza do tipo "Calabresa"
        cozinheiro.definirTipoPizza(pizzaFitness);
        cozinheiro.constructPizza();

        //Após a construção, devolve o objeto construído para um objeto Pizza.
        Pizza pizza2 = cozinheiro.getPizza();
        System.out.println(pizza2.detalharPizza());

    }

}
