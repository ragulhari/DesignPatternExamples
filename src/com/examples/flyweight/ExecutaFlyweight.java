package com.examples.flyweight;

import java.util.Random;

/**
 * Classe inicial do exemplo.
 *
 * Flyweight é um padrão que permite que seja utilizada uma imensa quantidade de objetos de forma otimizada,
 * de modo a economizar recursos da máquina. A quantidade de objetos é um parâmetro passado para inicializar o
 * exemplo.
 *
 * No caso do nosso exemplo, o sistema deve criar uma quantidade de blocos espalhados em posições X, Y e Z de uma área.
 * Cada bloco pode conter texturas diferentes entre si (no exemplo usamos 6 texturas). Em situações normais, para
 * cada bloco seria criado uma instância de objeto, o que pode consumir muito recurso, em especial memória.
 *
 * Ao utilizar o flyweight, o objetivo é reduzir a instanciação de objetos para que seja instanciado 1 objeto para
 * cada textura. a posição de cada bloco não é armazenado no próprio objeto, mas em um outro objeto responsável pelo
 * gerenciamento das posições X, Y e Z do objeto (no caso o objeto "ObjetosEmTela"). Dessa forma se mantém a
 * rastreabilidade do conjunto de objetos com o mínimo de utilização de memória.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaFlyweight {

    public static void go(int quantidade){

        //Lista de texturas utilizadas no exemplo
        String[] texturas = {"Pedra", "Madeira", "Agua", "Fogo", "Pedra Escura", "Isopor"};
        /*ObjetosEmTela tem o objetivo de armazenar todos os posicionamentos de cada bloco de forma
        otimizada.*/
        ObjetosEmTela[] obj = new ObjetosEmTela[quantidade];

        //FlyweightFactory é responsável por criar as novas instâncias de bloco, apenas se necessário.
        FlyweightFactory fly = new FlyweightFactory();

        /*Esse trecho do código é responsável por criar os N objetos solicitados. Para simplificação
        * os parâmetros de cada objeto são definidos por um objeto randômico.*/

        Random rnd = new Random();
        for (int i = 0; i < quantidade; i++) {
            obj[i] = new ObjetosEmTela();
            obj[i].x = rnd.nextInt() % 1000;
            obj[i].y = rnd.nextInt() % 1000;
            obj[i].z = rnd.nextInt() % 1000;

            //A expressão abaixo recupera aleatoriamnete da lista de texturas uma delas para o bloco
            obj[i].b = fly.getBloco(texturas[Math.abs(rnd.nextInt() % texturas.length)]);
        }


        //Após a criação dos objetos, o "For" abaixo realiza a impressão de todos os objetos criados
        for (ObjetosEmTela o : obj) {
            System.out.println(o.b.render(o.x, o.y, o.z));
        }

        //ao término mostramos quantos blocos foram criados e quantos objetos do tipo "Bloco" foram efetivamente instanciados.
        System.out.println("Foram renderizados " + quantidade + " blocos, porém apenas " + fly.getQuantidadeBlocos() + " instâncias de Bloco foram utilizadas.");

    }

}
