package com.examples.command;

import com.examples.command.interfaces.IPedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar a sequência de comandos que será executado.
 * São disponíveis dois métodos nesse exemplo, uma para empilhar os comandos, outro para
 * executar os comandos.
 * Poderia também ser implementadas as funções "Undo" e "Redo" da sequencia de comandos.
 */
public class Sequenciador {

    //A lista abaixo implementa a sequencia de comandos que será executada.
    private List<IPedido> listaComandos = new ArrayList<IPedido>();

    //A função "empilhar" consiste apenas em adicionar na List o comando indicado
    public void empilharComando(IPedido pedido){
        this.listaComandos.add(pedido);
    }

    //A função "disparar" executa todos os comandos empilhados em sequencia first in first out (FIFO)
    public void dispararComandos() {
        for (IPedido p : listaComandos) {
            p.execute();
        }
    }

}
