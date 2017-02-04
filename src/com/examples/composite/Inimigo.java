package com.examples.composite;

import java.util.ArrayList;
import java.util.List;

public class Inimigo implements InimigoModel{

    public String tituloInimigo = "";
    int tamanho = 0;
    int alcanceAtaque = 0;
    List<Inimigo> especializacoes = new ArrayList<Inimigo>();

    public Inimigo(String titulo, int tamanho, int alcanceAtaque)
    {
        this.tituloInimigo = titulo;
        this.tamanho = tamanho;
        this.alcanceAtaque = alcanceAtaque;
    }

    public void add(Inimigo i)
    {
        especializacoes.add(i);
    }

    public void remove(Inimigo i)
    {
        if (especializacoes.contains(i))
            especializacoes.remove(i);
    }

    public String render()
    {
        return "Inimigo ativo: " + this.tituloInimigo +
                " com alcance de ataque " + Integer.toString(this.alcanceAtaque) +
                " e tamanho " + Integer.toString(this.tamanho);
    }

}
