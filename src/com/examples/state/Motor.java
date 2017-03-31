package com.examples.state;

import com.examples.state.interfaces.IStatus;

/**
 * A classe motor possui dois parâmetros, velocidade de rotação e a quantidade de cilindros em uso.
 * Além disso possui um objeto Status, que serve para definir o estado corrente do Motor.
 */
public class Motor {

    private IStatus status;
    private int velocidadeGiro;
    private int cilindrosEmUso;

    public Motor(){
        status = null;
        cilindrosEmUso = 0;
        velocidadeGiro = 0;
    }

    //Manipulação do estado do motor
    public void setStatus(IStatus s) {
        this.status = s;
    }
    public IStatus getStatus() {
        return status;
    }

    //Manipulação da velocidade de rotação
    public void setVelocidadeGiro(int v){
        velocidadeGiro = v;
    }

    //Manipulação da quantidade de cilindros do motor
    public void setCilindrosEmUso(int c) {
        cilindrosEmUso = c;
    }
    public int getCilindrosEmUso() {
        return cilindrosEmUso;
    }

}
