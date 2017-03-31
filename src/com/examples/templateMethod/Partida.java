package com.examples.templateMethod;


/**
 * A classe abstrata Partida é a que implementa nosso templateMethod. Ela possui três métodos a serem implementados
 * (prepararJogo, iniciarPartida e terminarPartida) e a execução do algoritmo é realizado pelo método jogo.
 */
public abstract class Partida {
    abstract void prepararJogo();
    abstract void iniciarPartida();
    abstract void terminarPartida();

    public final void jogo()
    {
        prepararJogo();
        iniciarPartida();
        terminarPartida();
    }
}
