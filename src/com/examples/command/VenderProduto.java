package com.examples.command;

public class VenderProduto implements Pedido {

    private Produto prod;
    private int quantidade;

    VenderProduto(Produto prod, int quantidade)
    {
        this.prod = prod;
        this.quantidade = quantidade;

    }

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
