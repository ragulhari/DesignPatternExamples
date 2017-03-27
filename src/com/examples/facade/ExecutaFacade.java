package com.examples.facade;

/**
 * Classe inicial do exemplo.
 *
 * Um Facade funciona como uma classe que protege um conjunto de classes e suas dependências de objetos
 * externos ao contexto em que eles se apresentam. No nosso exemplo, simulamos as partes de um carro:
 * Motor, parte elétrica, tanque de combustível, cinto de segurança. Essas classes possuem regras bem
 * definidas para executar as operações "Ligar" e "Desligar" veículo, bem como interdependências entre elas
 * (por exemplo, o tanque não pode estar na reserva para ligar o motor).
 *
 * Para proteger essas classes, criamos um Facade com a classe "Carro". Essa classe tem a responsabilidade
 * de abstrair as operações "ligar" e "Desligar" para objetos externos. Assim, outras classes não precisam
 * ter conhecimento ou instanciar os objetos componentes do carro, basta instanciar "Carro" e executar os
 * métodos dessa classe.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */

public class ExecutaFacade {

    public static void go() {

        /*A classe Facade de nosso exemplo é "Carro". A classe ExecutaFacade é externa ao contexto do
        carro, de modo que para ela interessa apenas saber as operações macro (ligar e desligar).
        */
        Carro cFacade = new Carro();
        System.out.println("Ligando o carro ==> " + cFacade.ligar());
        System.out.println("Desligando o carro ==> " + cFacade.desligar());
    }
}
