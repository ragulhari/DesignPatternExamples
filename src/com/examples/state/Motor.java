package com.examples.state;

import com.examples.state.interfaces.IStatus;

/**
 * Created by ricardo on 2/15/17.
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

    public void setStatus(IStatus s) {
        this.status = s;
    }

    public IStatus getStatus() {
        return status;
    }

    public void setVelocidadeGiro(int v){
        velocidadeGiro = v;
    }

    public void setCilindrosEmUso(int c) {
        cilindrosEmUso = c;
    }


    public int getVelocidadeGiro(){
        return velocidadeGiro;
    }

    public int getCilindrosEmUso() {
        return cilindrosEmUso;
    }

}
