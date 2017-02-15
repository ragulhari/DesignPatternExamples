package com.examples.command;

import com.examples.command.interfaces.IPedido;

/**
 * Classe cuja função é representar o comando "VenderProduto", ou seja, registrar venda de produtos no estoque.
 * Essa classe implementa a interface IPedido, que apresenta o método de execução do comando (Execute)
 */

public class VenderProduto implements IPedido {

    private Produto prod;
    private int quantidade;

    VenderProduto(Produto prod, int quantidade)
    {
        this.prod = prod;
        this.quantidade = quantidade;

    }

    /*Método de execução do comando. Basicamente este comando invoca o método de venda de produtos
    * da classe Produto e imprime no console uma devolutiva ao usuário*/
    @Override
    public void execute() {
        double valorVenda = prod.fecharVenda(this.quantidade);
        if (valorVenda == 0){
            System.out.println("Quantidade não suficiente no estoque");
            System.out.println("----------");
        } else {
            System.out.println("Venda do produto " + this.prod.nomeProduto + " efetivada no valor de R$ " + valorVenda);
            System.out.println("Restam " + this.prod.quantidade + " unidades");
            System.out.println("----------");
        }
    }
}
