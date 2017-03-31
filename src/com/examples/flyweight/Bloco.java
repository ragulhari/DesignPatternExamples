package com.examples.flyweight;

/**
 * A classe Bloco é o objeto básico do exemplo. Ele possui apenas a informação de textura, pois o
 * posicionamento dele em tela é definido por uma outra classe, chamado "ObjetosEmtela".
 */
public class Bloco {
    public String texturaArquivo;

    public Bloco(String txArquivo) {
        this.texturaArquivo = txArquivo;
    }

    public String render (int x, int y, int z) {
        return "Renderizando " + texturaArquivo + " em " + x + "," + y + "," + z;
    }
}
