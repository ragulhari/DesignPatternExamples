package com.examples.state;

/**
 * Created by ricardo on 2/15/17.
 */
public class Desligado extends StatusAbstract {
    @Override
    public void Executar(Motor motor) {

        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != EmResfriamento.class)) {
            System.out.println("Desligamento não habilitado, ligar o resfriamento do motor antes");
            return;
        }
        motor.setCilindrosEmUso(0);
        motor.setVelocidadeGiro(0);
        System.out.println("Motor Desligado");

        motor.setStatus(this);

    }
}
