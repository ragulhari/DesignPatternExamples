package com.examples.templateMethod;

/**
 * Classe inicial do exemplo
 *
 * O padrão TemplateMethod implementa o esqueleto de um algoritmo, e permite que esse cada item
 * desse esqueleto seja implementado de diversas formas, porém mantendo a rigidez do esqueleto. No nosso
 * exemplo, implementamos o esqueleto de uma partida esportiva. Em geral toda partida de um esporte é
 * dividido em uma etapa de preparação, em seguida há o início da partida e o término.
 *
 * Em seguida fazemos duas implementações desse esqueleto (Partida é nosso TemplateMethod), uma de futebol
 * outra de basquetebol. Ambos usam a mesmo algoritmo esqueleto para execução (classe partida).
 *
 * @author Ricardo D. Agulhari
 * Março/2017

 */
public class ExecutaTemplateMethod {
    public static void go() {
        Partida p = new Basquetebol();
        p.jogo();
        p = new Futebol();
        p.jogo();
    }
}
