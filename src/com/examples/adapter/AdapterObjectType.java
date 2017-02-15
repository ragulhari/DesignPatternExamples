package com.examples.adapter;

import com.examples.adapter.interfaces.INovaContaCorrente;

import java.util.ArrayList;
import java.util.List;


/**
 * Essa classe implementa a adaptação por objetos do exemplo. A adaptação por objeto consiste
 * na instanciação de um objeto da classe adaptada e o uso dela para criar as informaçẽos que
 * resultarão na saída adaptada. Os métodos que serão adaptados estão definidos em INovaContaCorrente
 */
public class AdapterObjectType implements INovaContaCorrente {

    //Instanciação da classe adaptada para ser usada na adaptação
    public ContaCorrente objContaCorrente;
    
    public void criarContaCorrente(String nomeCorrentista)
    {
        objContaCorrente = new ContaCorrente(nomeCorrentista);
    }


    /*Implementação do método de extrato dos últimos 12 lançamentos. Verifique como o objeto
    * objContaCorrente é utilizado e as operações que são utilizadas para adaptar a saída para
    * o desejado.*/
    @Override
    public String ultimos12Lancamentos() {
        String retorno = "";
        int numLancamentos = objContaCorrente.getQuantidadeLancamentos();
        int numLimite = 12;
        
        if (numLancamentos <= 12)
            numLimite = numLancamentos;
        
        for (int i = (numLancamentos - numLimite); i < numLancamentos; i++){
            retorno += objContaCorrente.buscaLancamentoPorID(i).imprimeLancamento() + "\n";
        }

        return retorno;
        
    }

    /*Implementação do método de histórico de saldo. Verifique como o objeto
    * objContaCorrente é utilizado e as operações que são utilizadas para adaptar a saída para
    * o desejado.*/
    @Override
    public float[] historicoSaldo() {
        List<Float> list = new ArrayList<>();
        float saldo = 0;
        for (Lancamentos l: objContaCorrente.lancamentos){
            saldo += l.fValor;
            list.add(saldo);
        }
        
        float[] retorno = new float[list.size()];
        for (int i = 0; i < retorno.length; i++){
            retorno[i] = list.get(i);
        }
        
        return retorno;
    }
   
}
