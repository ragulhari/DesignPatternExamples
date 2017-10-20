package com.examples.strategy;

import com.examples.strategy.interfaces.IAtaque;

import java.util.Random;

/**
 * A classe "AtaqueVoador" implementa um tipo de ataque específico, por isso implementa os métodos definidos
 * em IAtaque.
 */
public class AtaqueVoador implements IAtaque {

    private int altura = 0;
    private int alcanceAtaque = 0;
    private String tituloInimigo = "";

    /*O método atacar devolve um texto informando a altura que o inimigo atingiu e o alcance de ataque,
    * bem como o nome do inimigo. As informações, com exceção do nome, são definidos por meio de parâmetros
    * randômicos*/
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

    /*O método defineInimigo recebe um nome de inimigo para identificar a qual será aplicado o ataque definido
    * no método "atacar"*/
    @Override
    public void defineInimigo(String inimigo) {
        this.tituloInimigo = inimigo;
    }
}
