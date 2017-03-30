package com.examples.proxy.interfaces;

/**
 * Interface que identifica os métodos necessários para manipulação de imagem no nosso exemplo. Aqui
 * tanto a classe proxy como a classe "real" implementam esses métodos, permitindo ao cliente abstrair
 * o uso de qualquer uma das classes.
 */
public interface IImagem {
    void display();
    String getResolution();
}
