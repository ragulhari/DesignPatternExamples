package com.examples.prototype.celulas;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Implementação da célula do tipo "Bucal", estendendo a classe "Celula". O método mitose é o responsável
 * por devolver ao demandador o objeto clonado.
 */
public class CelulaBucal extends Celula {

    public CelulaBucal() {
        tipo = "Bucal";
    }

    @Override
    public Object mitose() {
        System.out.println("Nova célula bucal criada");
        try {
            return this.clone();
        } catch (CloneNotSupportedException err) {
            return null;
        }
    }
}
