package com.examples.state.interfaces;

import com.examples.state.Motor;

/**
 * Created by ricardo on 2/15/17.
 */
public interface IStatus {
    public void Executar(Motor motor);
    public String getStatusAtual();
}
