package com.examples.strategy;

import java.util.Random;

/**
 * Created by ricardo on 2/4/17.
 */
public class FlorAtaque implements IAtaque {

    private int areaAtaque = 3;
    private int dano = 0;
    private int velocidade = 0;
    private String tituloInimigo = "";

    @Override
    public String atacar() {

        if (tituloInimigo.isEmpty())
            return "Não há adversário definido para o ataque";

        Random rnd = new Random();
        dano = Math.abs((rnd.nextInt() % 9)) + 1; //O método abs retorna o número absoluto, sem sinal
        velocidade = Math.abs((rnd.nextInt() % 9)) + 1; //O método abs retorna o número absoluto, sem sinal

        return "Ataque de fogo do inimigo " + tituloInimigo + " com área " + areaAtaque +
                ", dano " + dano +
                " e velocidade " + velocidade;
    }

    @Override
    public void defineInimigo(String inimigo) {
        tituloInimigo = inimigo;
    }
}
