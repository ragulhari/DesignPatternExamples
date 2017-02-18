package com.examples.prototype.celulas.interfaces;


public abstract class Celula implements Cloneable{

    protected String tipo;

    public abstract Object mitose();

    public String getTipo() {
        return tipo;
    }

    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException err) {
            err.printStackTrace();
        }

        return clone;
    }

}
