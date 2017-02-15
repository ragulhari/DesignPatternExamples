package com.examples.templateMethod;

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
