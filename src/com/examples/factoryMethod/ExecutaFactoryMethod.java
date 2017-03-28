package com.examples.factoryMethod;

import com.examples.factoryMethod.interfaces.IPrato;

/**
 * Classe inicial do exemplo.
 *
 * Os patterns de factory consistem em padrões para gerar objetos de forma dinâmica. O FactoryMethod tem
 * por objetivo definir uma interface para criar um objeto, mas deixar as subclasses decidirem qual objeto
 * será instanciado.
 *
 * No exemplo simulamos a criação de pratos de bife, frango e peixe a partir de um método factory (no caso
 * o método pedePrato da classe Cozinheiro. Esse método é responsável por decidir qual objeto será criado
 * com base em um parâmetro passado pela classe invocadora (no caso, o parâmetro tipoPrato do método pedePrato).
 *
 * Cada um dos objetos de prato (bife, frango e peixe) possui um método cozinhar, que devolve o prato que está
 *  sendo preparado. Esse método existe apenas para demonstrar cada objeto criado. Vale ressaltar que, independente
 *  do prato criado, é atribuído a um objeto IPrato em ExecutaFactoryMethod, o que demonstra que essa última não
 *  precisa necessariamente saber qual o objeto que foi criado.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaFactoryMethod {
    public static void go() {

        /*A classe cozinheiro é a responsável por devolver os objetos do tipo IPrato (no caso as subclasses
        Bife, Frango ou Peixe), conforme o parâmetro tipoPrato passado.
         */
        Cozinheiro c = new Cozinheiro();
        IPrato f1 = c.pedePrato("BIFE");
        f1.cozinhar();
        IPrato f2 = c.pedePrato("FRANGO");
        f2.cozinhar();
        IPrato f3 = c.pedePrato("PEIXE");
        f3.cozinhar();

    }
}

