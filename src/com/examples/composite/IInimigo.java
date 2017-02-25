package com.examples.composite;

import com.examples.composite.interfaces.IInimigoModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Definição da classe IInimigo, que implementa o método render definido na interface IInimigoModel.
 * Essa classe segue as mesmas definições da classe "Funcionário".
 * Nessa classe, define-se os métodos e propriedades dos inimigos, e o método "toString()" para formatar
 * a exibição dos dados do objeto.
 */

public class IInimigo implements IInimigoModel {

    public String tituloInimigo = "";
    int tamanho = 0;
    int alcanceAtaque = 0;
    List<IInimigo> especializacoes = new ArrayList<IInimigo>();

    public IInimigo(String titulo, int tamanho, int alcanceAtaque)
    {
        this.tituloInimigo = titulo;
        this.tamanho = tamanho;
        this.alcanceAtaque = alcanceAtaque;
    }

    //Método que adiciona um objeto subordinado a um objeto atual
    public void add(IInimigo i)
    {
        especializacoes.add(i);
    }

    /*Método para remoção de subordinados. Para a simplificação do exemplo
    * a única validação é se o inimigo indicado existe.*/
    public void remove(IInimigo i)
    {
        if (especializacoes.contains(i))
            especializacoes.remove(i);
    }

   /*Implementação particular de um método "toString()" que obtem os dados do inimigo
    * e estrutura a impressão.
    * */
    public String render()
    {
        return "IInimigo ativo: " + this.tituloInimigo +
                " com alcance de ataque " + Integer.toString(this.alcanceAtaque) +
                " e tamanho " + Integer.toString(this.tamanho);
    }

}