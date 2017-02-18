package com.examples.prototype;

import com.examples.prototype.celulas.CelulaBucal;
import com.examples.prototype.celulas.CelulaEpitelial;
import com.examples.prototype.celulas.CelulaEstomacal;
import com.examples.prototype.celulas.interfaces.Celula;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ricardo on 2/18/17.
 */
public class RepositorioCelulas {

    List<Celula> arrCelulas = new ArrayList<>();

    public Celula novaCelula(String tipo) {

        switch (tipo) {
            case "bucal":
                return (CelulaBucal) arrCelulas.get(0).mitose();
            case "estomacal":
                return (CelulaEstomacal) arrCelulas.get(1).mitose();
            case "epitelial":
                return (CelulaEpitelial) arrCelulas.get(2).mitose();
        }

        return null;
    }

    public RepositorioCelulas() {
        arrCelulas.add(new CelulaBucal());
        arrCelulas.add(new CelulaEstomacal());
        arrCelulas.add(new CelulaEpitelial());
    }
}
