package com.examples.bridge;

import com.examples.bridge.interfaces.Tv;

/**
 * Created by ricardo on 2/27/17.
 */
public class ExecutaBridge {
    public static void go()
    {
        Tv tvSony = new TvSony();
        Tv tvPhilips = new TvPhilips();

        ControleUniversal controlSony = new ControleUniversal(tvSony);
        ControleUniversal controlPhilips = new ControleUniversal(tvPhilips);

        controlSony.ligar();
        controlSony.proximo();
        controlSony.proximo();
        controlSony.desligar();

        controlPhilips.ligar();
        controlPhilips.anterior();
        controlPhilips.anterior();
        controlPhilips.desligar();

    }
}
