/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.adapter.interfaces;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ricardo
 */
public interface IContaCorrente {
    
    public float getSaldo();
    public int getQuantidadeLancamentos();
    public void insereLancamento(String descricao, float valor);
    public com.examples.adapter.Lancamentos buscaLancamentoPorID (int idLancamento);
    public List<com.examples.adapter.Lancamentos> buscaLancamentoPorData (Date data);
    
}
