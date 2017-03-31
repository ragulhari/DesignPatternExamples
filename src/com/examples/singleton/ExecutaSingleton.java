package com.examples.singleton;

/**
 * Classe inicial do exemplo.
 *
 * Singleton é um padrão que restringe a instanciação de um único objeto de uma classe para execução
 * para diversas instâncias de outros objetos. O exemplo demonstra de forma bem simples essa execução,
 * simulando uma classe Singleton "SemaforoComunicacao" que controla a criação de uma única instância de
 * objeto para várias invocações.
 *
 * A classe Comunicador utiliza o SemaforoComunicacao em três objetos (conector1, conector2 e conector3)
 * para demonstrar que os três objetos se tratam de uma única instância.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaSingleton {
    public static void go() {
        Comunicador obj = new Comunicador();
        obj.realizarConexoes();
    }
}
