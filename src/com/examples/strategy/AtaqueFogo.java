package com.examples.strategy;

import com.examples.strategy.interfaces.IAtaque;

import java.util.Random;

/**
 * A classe "AtaqueFogo" implementa um tipo de ataque específico, por isso implementa os métodos definidos
 * em IAtaque.
 */
public class AtaqueFogo implements IAtaque {

    private int areaAtaque = 3;
    private int dano = 0;
    private int velocidade = 0;
    private String tituloInimigo = "";

    /*O método atacar devolve um texto informando a velocidade que o inimigo atingiu e o dano,
    * bem como o nome do inimigo. As informações, com exceção do nome, são definidos por meio de parâmetros
    * randômicos*/
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

    /*O método defineInimigo recebe um nome de inimigo para identificar a qual será aplicado o ataque definido
    * no método "atacar"*/
    @Override
    public void defineInimigo(String inimigo) {
        tituloInimigo = inimigo;
    }
}
