package com.examples.visitor;

import com.examples.visitor.interfaces.IPeriferico;

/**
 * Classe incial do exemplo
 *
 * Visitor é um padrão que permite que novas operações sejam adicionadas a uma estrutura de objetos bem
 * definidos sem a necessidade de codificar cada um destes objetos. Neste caso, cada visitor é uma operação,
 * e cada operação será codificada para todos os objetos de uma estrutura em uma única classe.
 *
 * No nosso exemplo, a estrutura de objetos bem definidos é um computador, que possui os seguintes componentes:
 * Monitor, Mouse, Teclado, além da própria classe Computador que agrega todos os componentes (todos implementam
 * a interface "IPeriferico". Para essa estrutura efinimos duas operações: Inicialização (definido na classe
 * "PerifericoAcaoVisitor") e a verificação do status (definido na classe "VerificaStatusComponenteVisitor"). Ambas
 * implementam a interface "IPerifericoVisitor".
 *
 * A classe ExecutaVisitor executa uma chamada em Computador, passando como parâmetro qual a ação que deve
 * ser realizada para todos os componentes (método "accept"). A classe computador varrerá todos os componentes,
 * invocando o método de visitação ("visit") para que a ação seja executada.
 *
 * @author Ricardo D. Agulhari
 * Março/2017

 */
public class ExecutaVisitor {

    public static void go() {

        //Define o objeto computador.
        IPeriferico computador = new Computador();

        /*Executa a primeira ação. O método accept passa qual a ação será realizada. Dentro desse método
        ocorre a visita de cada componente ao seu comportamento definido em "PerifericoAcaoVisitor" */
        computador.accept(new PerifericoAcaoVisitor());
        System.out.println("----------------");

        //Executa a segunda ação, de verificação de status do componente.
        computador.accept(new VerificaStatusComponenteVisitor());
    }

}
