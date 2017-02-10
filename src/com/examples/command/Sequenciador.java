package com.examples.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ricardo on 2/10/17.
 */
public class Sequenciador {
    private List<Pedido> listaComandos = new ArrayList<Pedido>();

    public void empilharComando(Pedido pedido){
        this.listaComandos.add(pedido);
    }

    public void dispararComandos() {
        for (Pedido p : listaComandos) {
            p.execute();
        }
    }

}
