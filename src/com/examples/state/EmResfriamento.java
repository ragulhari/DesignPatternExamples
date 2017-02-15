package com.examples.state;

/**
 * Created by ricardo on 2/15/17.
 */
public class EmResfriamento extends StatusAbstract {
    @Override
    public void Executar(Motor motor) {
        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != Ligado.class)) {
            System.out.println("Resfriamento não habilitado, ligar o motor antes");
            return;
        }

        System.out.println("Entrando em estado de resfriamento!");
        motor.setCilindrosEmUso(4);
        motor.setVelocidadeGiro(motor.getCilindrosEmUso() * 8000);
        motor.setStatus(this);
    }
}
