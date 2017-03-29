package com.examples.state;

/**
 * Implementa o estado "Ligado". O método executar verifica as regras de negócio antes da mudança
 * do estado.
 */
public class Ligado extends StatusAbstract {

    @Override
    public void Executar(Motor motor) {

        //Para passar para o estado "Ligado" é necessário que o motor esteja desligado
        if ((motor.getStatus() != null) && (motor.getStatus().getClass() != Desligado.class)) {
            System.out.println("Operação não realizada, motor não está desligado");
            return;
        }

        //Define a quantidade de cilindros e rotação para o estado.
        System.out.println("Ligando o motor!!");
        motor.setCilindrosEmUso(6);
        motor.setVelocidadeGiro(motor.getCilindrosEmUso() * 3000);

        //Realiza a mudança do estado
        motor.setStatus(this);
    }

}
