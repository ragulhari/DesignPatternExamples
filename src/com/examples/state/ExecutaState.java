package com.examples.state;

/**
 * Created by ricardo on 2/15/17.
 */
public class ExecutaState {
    public static void go() {
        Motor c = new Motor();
        Desligado desl = new Desligado();
        Ligado lig = new Ligado();
        EmResfriamento resf = new EmResfriamento();

        System.out.println("Vamos ligar o motor");
        lig.Executar(c);

        desl.Executar(c);

        resf.Executar(c);

        lig.Executar(c);

        desl.Executar(c);


    }

}
