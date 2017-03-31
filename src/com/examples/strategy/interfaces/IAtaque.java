package com.examples.strategy.interfaces;

/**
 * A interface IAtaque definem dois métodos a ser implementados por todos os tipos de ataque, um para
 * definir o nome do inimigo, a segunda para efetivamente aplicar o algoritmo definido.*/
public interface IAtaque {
    String atacar();
    void defineInimigo(String inimigo);
}
