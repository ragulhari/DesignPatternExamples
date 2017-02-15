package com.examples.adapter;

import com.examples.adapter.interfaces.INovaContaCorrente;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe implementa a adaptação por classe do exemplo. A adaptação por classe consiste
 * na realização de uma herança da classe adaptada. A classe adaptadora pode, dessa forma,
 * utilizar os métodos e propriedades da classe adaptada para criar os métodos necessários na
 * adaptação, definidos em INovaContaCorrente.
 */
public class AdapterClassType extends ContaCorrente implements INovaContaCorrente {

    public AdapterClassType(String nomeCorrentista) {
        super(nomeCorrentista);
    }

    /*Implementação do método de extrato dos últimos 12 lançamentos. Verifique como
    a herança de classe é utilizada em suas propriedades e métodos para adaptar a saída para
    * o esperado na adaptação.*/
    @Override
    public String ultimos12Lancamentos() {
        String retorno = "";
        int numLancamentos = getQuantidadeLancamentos();
        int numLimite = 12;

        if (numLancamentos <= 12)
            numLimite = numLancamentos;

        for (int i = (numLancamentos - numLimite); i < numLancamentos; i++){
            retorno += buscaLancamentoPorID(i).imprimeLancamento() + "\n";
        }

        return retorno;
    }

    /*Implementação do método de listar o histórico de saldo. Verifique como
    a herança de classe é utilizada em suas propriedades e métodos para adaptar a saída para
    * o esperado na adaptação.*/
    @Override
    public float[] historicoSaldo() {
        List<Float> list = new ArrayList<>();
        float saldo = 0;
        for (Lancamentos l: lancamentos){
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
