package com.examples.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class ContaCorrente implements IContaCorrente{
    
    private int idLancamento;
    public String nomeCorrentista;
    private float saldoContaCorrente;
    List<Lancamentos> lancamentos;
    
    public ContaCorrente(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
        this.idLancamento = 0;
        this.saldoContaCorrente = 0;
        this.lancamentos = new ArrayList<>();    
    }

    @Override
    public float getSaldo()
    {
        return this.saldoContaCorrente;
    }
    
    @Override
    public int getQuantidadeLancamentos()
    {
        return idLancamento;
    }

    @Override
    public void insereLancamento(String descricao, float valor){
        idLancamento++;
        this.saldoContaCorrente += valor;
        this.lancamentos.add(new Lancamentos(idLancamento, descricao, valor));
    }
    
    @Override
    public Lancamentos buscaLancamentoPorID (int idLancamento){
        if (idLancamento > this.idLancamento)
            return null;
        else
            return this.lancamentos.get(idLancamento);
    }
    
    @Override
    public List<Lancamentos> buscaLancamentoPorData (Date data){
        
        List<Lancamentos> obj = new ArrayList<>();
        
        for(Lancamentos l: this.lancamentos){
            if (l.dDataOperacao == data)
                obj.add(l);
        }
        
        return obj;
    }    
}
