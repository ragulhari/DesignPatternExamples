package com.examples.strategy;

import java.util.Random;

/**
 * Created by ricardo on 2/4/17.
 */
public class AtaqueVoador implements IAtaque {

    private int altura = 0;
    private int alcanceAtaque = 0;
    private String tituloInimigo = "";


    @Override
    public String atacar() {

        if (tituloInimigo.isEmpty())
            return "Não há adversário definido para o ataque";


        Random rnd = new Random();
        altura = Math.abs((rnd.nextInt() % 4)) + 1; //O método abs retorna o número absoluto, sem sinal
        alcanceAtaque = Math.abs((rnd.nextInt() % 4)) + 1; //O método abs retorna o número absoluto, sem sinal

        return "Inimigo  " + tituloInimigo +
                " ganhou asas e agora pula com altura " + altura +
                " e alcance do ataque " + alcanceAtaque;
    }

    @Override
    public void defineInimigo(String inimigo) {
        this.tituloInimigo = inimigo;
    }
}
