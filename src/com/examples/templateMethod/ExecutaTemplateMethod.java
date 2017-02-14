package com.examples.templateMethod;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaTemplateMethod {
    public static void go() {
        Partida p = new Basquetebol();
        p.jogo();
        p = new Futebol();
        p.jogo();
    }
}
