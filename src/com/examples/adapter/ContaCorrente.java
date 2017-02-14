package com.examples.adapter;

import com.examples.adapter.interfaces.IContaCorrente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Essa classe "ContaCorrente" deve ser entendida, para esse exemplo, como um legado que não pode
 * ser mantido. Ela implementa métodos da interface IContaCorrente e é usada para ser "adaptada"
 * pelas duas classes adapter do exemplo (AdapterClassType e AdapterObjectType).
 */
public class ContaCorrente implements IContaCorrente {

    public String nomeCorrentista;
    List<Lancamentos> lancamentos;

    //Lançamento é um número sequencial para ordenar todos os lançamentos dessa conta corrente
    private int idLancamento;

    //Saldo é uma propriedade criada para impedir que toda busca de saldo não seja calculada
    private float saldoContaCorrente;

    public ContaCorrente(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
        this.idLancamento = 0;
        this.saldoContaCorrente = 0;
        this.lancamentos = new ArrayList<>();    
    }

    //Operação para buscar o saldo de conta corrente no momento
    @Override
    public float getSaldo()
    {
        return this.saldoContaCorrente;
    }

    //Operação para buscar a quantidade de lançamentos já feita nessa conta corrente
    @Override
    public int getQuantidadeLancamentos()
    {
        return idLancamento;
    }

    //Insere um novo lançamento na conta corrente
    @Override
    public void insereLancamento(String descricao, float valor){
        idLancamento++;
        this.saldoContaCorrente += valor;
        this.lancamentos.add(new Lancamentos(idLancamento, descricao, valor));
    }

    /*Um dos tipos de busca da classe, utiliza como filtro o ID de lançamento na conta corrente
    (O ID é um número sequencial único dentro da conta corrente) */
    @Override
    public Lancamentos buscaLancamentoPorID (int idLancamento){
        if (idLancamento > this.idLancamento)
            return null;
        else
            return this.lancamentos.get(idLancamento);
    }

    /*Outro método de busca, para retornar todos os lançamentos de uma data utilizada como filtro.
    todos os lançamentos retornam na forma de uma lista.
     */
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
