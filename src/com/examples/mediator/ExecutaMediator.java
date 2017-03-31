package com.examples.mediator;

/**
 * Classe inicial do exemplo.
 *
 * Mediator é um padrão que define uma classe intermediadora entre diversos componentes para permitir
 * a interação entre eles. Ao isolar a interação entre diversos componentes em um único ponto, permitimos
 * que esses componentes se tornem reusáveis.
 *
 * Nosso exemplo é similar ao exemplo do pattern "Facade" porém isolando todas as interações entre os componentes
 * de um veículo na classe "Carro". Os componentes que compõem o carro do exemplo (CintoSeguranca, Motor,
 * ParteEletrica e TanqueCombustivel) não possui nenhum relacionamento entre si diretamente, ao contrário do
 * exemplo do "facade".
 *
 * A classe ExecutaMediator invoca a classe Carro para as operações "ligar" e "desligar". Os métodos da classe Carro
 * realizam as interações necessárias entre os componentes para executar as operações.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 * */
public class ExecutaMediator {

    public static void go() {
        Carro cMediator = new Carro();
        System.out.println("Ligando o carro ==> " + cMediator.ligar());
        System.out.println("Desligando o carro ==> " + cMediator.desligar());

    }
}
