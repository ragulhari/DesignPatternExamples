
package com.examples.adapter;

import java.util.Date;

/**
 *
 * @author ricardo
 */
public class Lancamentos {
    int id;
    String sDescricao;
    float fValor;
    Date dDataOperacao;
    
    Lancamentos(int id, String descricao, float valor){
        this.id = id;
        this.sDescricao = descricao;
        this.fValor = valor;
        this.dDataOperacao = new Date();
    }
    
    public String imprimeLancamento()
    {
        return this.dDataOperacao.toString() + " # " + this.sDescricao + "  ## " + Float.toString(fValor);
    }
}
