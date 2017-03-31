package com.examples.state.interfaces;

import com.examples.state.interfaces.IStatus;

/**
 * A classe abstrata StatusAbstract deve ser usada para todas as classes que implementem regras de negócio
 * para um determinado status. Por padrão, assumimos inicialmente o status "Desligado".
 */
public abstract class StatusAbstract implements IStatus {

    String statusAtual = "Desligado";

    @Override
    public String getStatusAtual() {
        return statusAtual;
    }

}
