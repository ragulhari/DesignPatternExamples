package com.examples.prototype;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Classe inicial do exemplo.
 *
 * Prototype parece se assemelhar a um pattern de factory, porém ele se diferencia por uma característica:
 * enquanto factories tem o objetivo de criar novos objetos a partir de um template, um padrão prototype não
 * cria novas instâncias, ele clona uma instância existente para a classe demandante.
 *
 * Para representar esse exemplo, imaginamos um sistema que gera novas células, podendo ser de três tipos:
 * epitelial, estomacal e bucal. A classe demandadora (no caso a "ExecutaPrototype") solicita novas células
 * para uma classe de repositório ("RepositorioCelulas") e essa classe é responsável por gerar um novo objeto
 * célula do tipo especificado, por meio de clonagem de objeto existente.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaPrototype {

    public static void go() {

        /*Cria o objeto Repositório e, em seguida, inicia a criação das células passando por parâmetro
        * o tipo de célula desejada*/
        RepositorioCelulas repo = new RepositorioCelulas();

        Celula ep = (Celula) repo.novaCelula("epitelial");
        System.out.println(ep.getTipo());

        Celula st = (Celula) repo.novaCelula("estomacal");
        System.out.println(st.getTipo());

        Celula bc = (Celula) repo.novaCelula("bucal");
        System.out.println(bc.getTipo());
    }

}
