package com.examples.composite.game;

import com.examples.composite.interfaces.IObjeto;

import java.util.ArrayList;
import java.util.List;

/**
 * Definição da classe Inimigo, que implementa o método render definido na interface IObjeto.
 * Nessa classe, define-se os métodos e propriedades dos inimigos, e o método "render()" para formatar
 * a exibição dos dados do objeto.
 */

public class Inimigo implements IObjeto {

    public String tituloInimigo = "";
    int tamanho = 0;
    int alcanceAtaque = 0;

    public Inimigo(String titulo, int tamanho, int alcanceAtaque)
    {
        this.tituloInimigo = titulo;
        this.tamanho = tamanho;
        this.alcanceAtaque = alcanceAtaque;
    }

   /*Implementação particular de um método "toString()" que obtem os dados do inimigo
    * e estrutura a impressão.
    * */
    public String render()
    {
        return "Inimigo ativo: " + this.tituloInimigo +
                " com alcance de ataque " + Integer.toString(this.alcanceAtaque) +
                " e tamanho " + Integer.toString(this.tamanho);
    }

}