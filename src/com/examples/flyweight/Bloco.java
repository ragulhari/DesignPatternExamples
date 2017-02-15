package com.examples.flyweight;

/**
 * Created by ricardo on 2/14/17.
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
