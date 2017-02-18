package com.examples.prototype.celulas;

import com.examples.prototype.celulas.interfaces.Celula;


public class CelulaEpitelial extends Celula {

    public CelulaEpitelial() {
        tipo = "Epitelial";
    }

    @Override
    public Object mitose() {
        System.out.println("Nova célula epitelial criada");
        try {
            return this.clone();
        } catch (CloneNotSupportedException err) {
            return null;
        }
    }
}
