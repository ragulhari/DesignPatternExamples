package com.examples.state;

/**
 * Created by ricardo on 2/15/17.
 */
public class Ligado extends StatusAbstract {

    @Override
    public void Executar(Motor motor) {

        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != Desligado.class)) {
            System.out.println("Operação não realizada, motor não está desligado");
            return;
        }

        System.out.println("Ligando o motor!!");
        motor.setCilindrosEmUso(6);
        motor.setVelocidadeGiro(motor.getCilindrosEmUso() * 3000);
        motor.setStatus(this);
    }

}
