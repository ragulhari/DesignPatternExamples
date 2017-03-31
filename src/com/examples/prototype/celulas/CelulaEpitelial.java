package com.examples.prototype.celulas;

import com.examples.prototype.celulas.interfaces.Celula;

/**
 * Implementação da célula do tipo "Epitelial", estendendo a classe "Celula". O método mitose é o responsável
 * por devolver ao demandador o objeto clonado.
 */
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
