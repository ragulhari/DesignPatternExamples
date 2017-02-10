package com.examples.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterClassType extends ContaCorrente implements INovaContaCorrente {

    public AdapterClassType(String nomeCorrentista) {
        super(nomeCorrentista);
    }

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
