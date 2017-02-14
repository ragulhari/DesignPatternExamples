package com.examples.flyweight;

import java.util.Random;

/**
 * Created by ricardo on 2/14/17.
 */
public class ExecutaFlyweight {

    public static void go(int quantidade){
        String[] texturas = {"Pedra", "Madeira", "Agua", "Fogo", "Pedra Escura", "Isopor"};

        ObjetosEmTela[] obj = new ObjetosEmTela[quantidade];
        FlyweightFactory fly = new FlyweightFactory();

        Random rnd = new Random();

        for (int i = 0; i < quantidade; i++) {
            obj[i] = new ObjetosEmTela();
            obj[i].x = rnd.nextInt() % 1000;
            obj[i].y = rnd.nextInt() % 1000;
            obj[i].z = rnd.nextInt() % 1000;
            obj[i].b = fly.getBloco(texturas[Math.abs(rnd.nextInt() % texturas.length)]);
        }

        for (ObjetosEmTela o : obj) {
            System.out.println(o.b.render(o.x, o.y, o.z));
        }

        System.out.println("Foram renderizados " + quantidade + " blocos, porém apenas " + fly.getQuantidadeBlocos() + " instâncias de Bloco foram utilizadas.");

    }

}
