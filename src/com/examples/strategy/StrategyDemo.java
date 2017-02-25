package com.examples.strategy;

import com.examples.composite.IInimigo;

/**
 * Created by ricardo on 2/4/17.
 */
public class StrategyDemo {

    public static String realizarAtaque(IAtaque obj){
        return obj.atacar();
    }

    public void executarDemo()
    {
        IInimigo tartaruga1 = new IInimigo("Tartaruga básica 1", 2, 1);
        IInimigo tartaruga2 = new IInimigo("Tartaruga básica 2", 2, 1);
        IInimigo tartaruga3 = new IInimigo("Tartaruga básica 3", 2, 1);
        IInimigo flor1 = new IInimigo("Flor de fogo", 4, 2);

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
