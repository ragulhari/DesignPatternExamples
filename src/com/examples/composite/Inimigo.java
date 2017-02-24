package com.examples.composite;

import com.examples.composite.interfaces.InimigoModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Definição da classe Inimigo, que implementa o método render definido na interface InimigoModel.
 * Essa classe segue as mesmas definições da classe "Funcionário".
 * Nessa classe, define-se os métodos e propriedades dos inimigos, e o método "toString()" para formatar
 * a exibição dos dados do objeto.
 */

public class Inimigo implements InimigoModel {

    public String tituloInimigo = "";
    int tamanho = 0;
    int alcanceAtaque = 0;
    List<Inimigo> especializacoes = new ArrayList<Inimigo>();

    public Inimigo(String titulo, int tamanho, int alcanceAtaque)
    {
        this.tituloInimigo = titulo;
        this.tamanho = tamanho;
        this.alcanceAtaque = alcanceAtaque;
    }

    //Método que adiciona um objeto subordinado a um objeto atual
    public void add(Inimigo i)
    {
        especializacoes.add(i);
    }

    /*Método para remoção de subordinados. Para a simplificação do exemplo
    * a única validação é se o inimigo indicado existe.*/
    public void remove(Inimigo i)
    {
        if (especializacoes.contains(i))
            especializacoes.remove(i);
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