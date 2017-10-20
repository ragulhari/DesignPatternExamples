package com.examples.composite.game;

import com.examples.composite.interfaces.IObjeto;

public class Caixa implements IObjeto {

    int tamanho = 0;
    String textura = "";

    public Caixa(int tamanho, String textura)
    {

        this.tamanho = tamanho;
        this.textura = textura;
    }

    /*Implementação particular de um método "toString()" que obtem os dados do inimigo
     * e estrutura a impressão.
     * */
    @Override
    public String render()
    {
        return "Caixa do tipo " + this.textura +
                " com tamanho " + Integer.toString(this.tamanho);
    }
}
