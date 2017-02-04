package com.examples.strategy;

import com.examples.composite.Inimigo;

/**
 * Created by ricardo on 2/4/17.
 */
public class StrategyDemo {

    public static String realizarAtaque(IAtaque obj){
        return obj.atacar();
    }

    public void executarDemo()
    {
        Inimigo tartaruga1 = new Inimigo("Tartaruga básica 1", 2, 1);
        Inimigo tartaruga2 = new Inimigo("Tartaruga básica 2", 2, 1);
        Inimigo tartaruga3 = new Inimigo("Tartaruga básica 3", 2, 1);
        Inimigo flor1 = new Inimigo("Flor de fogo", 4, 2);

        AtaqueVoador atkVoador = new AtaqueVoador();
        FlorAtaque atkFlor = new FlorAtaque();

        //System.out.println(this.realizarAtaque(atkVoador));
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga1.tituloInimigo);
        System.out.println(this.realizarAtaque(atkVoador));
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga2.tituloInimigo);
        System.out.println(this.realizarAtaque(atkVoador));
        System.out.println("-------------");
        atkFlor.defineInimigo(flor1.tituloInimigo);
        System.out.println(this.realizarAtaque(atkFlor));
        System.out.println("-------------");
        atkVoador.defineInimigo(tartaruga3.tituloInimigo);
        System.out.println(this.realizarAtaque(atkVoador));


    }



}
