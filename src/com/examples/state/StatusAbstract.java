package com.examples.state;

import com.examples.state.interfaces.IStatus;

/**
 * Created by ricardo on 2/15/17.
 */
public abstract class StatusAbstract implements IStatus {

    String statusAtual = "Desligado";

    @Override
    public String getStatusAtual() {
        return statusAtual;
    }

}
