package com.examples.prototype.celulas;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Created by ricardo on 2/18/17.
 */
public class CelulaEstomacal extends Celula {

    public CelulaEstomacal() {
        tipo = "Estomacal";
    }

    @Override
    public Object mitose() {
        System.out.println("Nova célula estomacal criada");
        try {
            return this.clone();
        } catch (CloneNotSupportedException err) {
            return null;
        }
    }
}
