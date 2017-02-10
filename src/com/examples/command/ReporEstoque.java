package com.examples.command;

/**
 * Created by ricardo on 2/10/17.
 */
public class ReporEstoque implements Pedido {
    private Produto prod;
    private int quantidade;

    public ReporEstoque(Produto prod, int quantidade)
    {
        this.prod = prod;
        this.quantidade = quantidade;
    }

    @Override
    public void execute() {
        prod.incluirProdutoEmEstoque(this.quantidade);
        System.out.println("Incluido(s) " + this.quantidade + " unidades do produto " + this.prod.nomeProduto + " em estoque" );
        System.out.println("Estoque atual é de " + this.prod.quantidade + " unidades");
        System.out.println("----------");

    }

}
