
package com.examples.adapter;

import java.util.Date;

/**
 *
 * Lançamentos é a unidade básica de uma conta corrente.
 * Contém propriedades atômicas de um lançamento.
 */
public class Lancamentos {

    String sDescricao;
    float fValor;
    Date dDataOperacao;

    //contém o ID do lançamento, gerado pela Conta Corrente.
    int id;

    Lancamentos(int id, String descricao, float valor){
        this.id = id;
        this.sDescricao = descricao;
        this.fValor = valor;
        this.dDataOperacao = new Date();
    }

    //Esse método tem por objetivo formatar a exibição do lançamento no caso de uma impressão
    public String imprimeLancamento()
    {
        return this.dDataOperacao.toString() + " # " + this.sDescricao + "  ## " + Float.toString(fValor);
    }
}
