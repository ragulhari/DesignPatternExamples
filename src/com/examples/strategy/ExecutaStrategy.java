package com.examples.strategy;

import com.examples.composite.IInimigo;
import com.examples.strategy.interfaces.IAtaque;

/**
 * Strategy é um padrão que consiste na implementação de algoritmos diferentes para resolver um mesmo problema,
 * de modo que a forma de resolução possa ser definida pelo sistema, conforme mais apropriado ao contexto que se
 * apresenta.
 *
 * Nosso exemplo é complementar ao exemplo do padrão Composite, que se define inimigos para um jogo. Neste exemplo
 * um mesmo inimigo pode ter padrões diferentes de ataque. Para definir o padrão de ataque de um inimigo se usa o
 * padrão Strategy.
 *
 * Definimos dois tipos de ataque, um descrito na classe "AtaqueFogo" outro na classe "AtaqueVoador". Esses ataques
 * são atribuidos aos inimigos criados na classe ExecutaStrategy e uma simulação de ataque é realizado por cada um
 */
public class ExecutaStrategy {

    //realizarAtaque é um método que invoca o ataque do algoritmo escolhido para o objeto
    public static String realizarAtaque(IAtaque obj){
        return obj.atacar();
    }

    public static void go() {
        //Definimos quatro inimigos para o exemplo, usando a classe IInimigo definido no exemplo de Composite
        IInimigo tartaruga1 = new IInimigo("Tartaruga básica 1", 2, 1);
        IInimigo tartaruga2 = new IInimigo("Tartaruga básica 2", 2, 1);
        IInimigo tartaruga3 = new IInimigo("Tartaruga básica 3", 2, 1);
        IInimigo flor1 = new IInimigo("Flor de fogo", 4, 2);

        /*Criamos um objeto para cada tipo de ataque. O objeto será atribuído ao inimigo para que o mesmo
        possa realizar a ação. */
        AtaqueVoador atkVoador = new AtaqueVoador();
        AtaqueFogo atkFlor = new AtaqueFogo();

        /*abaixo iniciamos a execução d exemplo. Primeiramente atribuimos um ataque ao inimigo pelo método
        * "defineInimigo" e depois executamos o método estático "realizarAtaque" para que o algoritmo de
        * ataque seja executado para o inimigo selecionado*/
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga1.tituloInimigo);
        System.out.println(realizarAtaque(atkVoador));
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga2.tituloInimigo);
        System.out.println(realizarAtaque(atkVoador));
        System.out.println("-------------");
        atkFlor.defineInimigo(flor1.tituloInimigo);
        System.out.println(realizarAtaque(atkFlor));
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga3.tituloInimigo);
        System.out.println(realizarAtaque(atkVoador));

    }
}
