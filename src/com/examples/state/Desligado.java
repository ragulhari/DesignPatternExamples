package com.examples.state;

import com.examples.state.interfaces.StatusAbstract;

/**
 * Implementa o estado "Desligado". O método executar verifica as regras de negócio antes da mudança
 * do estado.
 */
public class Desligado extends StatusAbstract {
    @Override
    public void Executar(Motor motor) {

        //Para passar para o estado "Desligado" é necessário que o motor esteja em resfriamento
        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != EmResfriamento.class)) {
            System.out.println("Desligamento não habilitado, ligar o resfriamento do motor antes");
            return;
        }

        //Define a quantidade de cilindros e rotação para o estado.
        motor.setCilindrosEmUso(0);
        motor.setVelocidadeGiro(0);
        System.out.println("Motor Desligado");

        //Realiza a mudança do estado
        motor.setStatus(this);

    }
}
