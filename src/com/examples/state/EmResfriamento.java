package com.examples.state;

import com.examples.state.interfaces.StatusAbstract;

/**
 * Implementa o estado "EmResfriamento". O método executar verifica as regras de negócio antes da mudança
 * do estado.
 */
public class EmResfriamento extends StatusAbstract {
    @Override
    public void Executar(Motor motor) {

        //Para passar para o estado "EmResfriamento" é necessário que o motor esteja ligado
        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != Ligado.class)) {
            System.out.println("Resfriamento não habilitado, ligar o motor antes");
            return;
        }

        //Define a quantidade de cilindros e rotação para o estado.
        System.out.println("Entrando em estado de resfriamento!");
        motor.setCilindrosEmUso(4);
        motor.setVelocidadeGiro(motor.getCilindrosEmUso() * 8000);

        //Realiza a mudança do estado
        motor.setStatus(this);
    }
}
