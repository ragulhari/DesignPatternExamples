package com.examples.command;

import com.examples.command.interfaces.IPedido;

/**
 * Classe cuja função é representar o comando "ReporEstoque", ou seja, incluir produtos no estoque.
 * Essa classe implementa a interface IPedido, que apresenta o método de execução do comando (Execute)
 */
public class ReporEstoque implements IPedido {
    public Produto prod;
    private int quantidade;

    public ReporEstoque(Produto prod, int quantidade)
    {
        this.prod = prod;
        this.quantidade = quantidade;
    }

    /*Método de execução do comando. Basicamente este comando invoca o método de compra de produtos
    * da classe Produto e imprime no console uma devolutiva ao usuário*/
    @Override
    public void execute() {
        prod.incluirProdutoEmEstoque(this.quantidade);
        System.out.println("Incluido(s) " + this.quantidade + " unidades do produto " + this.prod.nomeProduto + " em estoque" );
        System.out.println("Estoque atual é de " + this.prod.quantidade + " unidades");
        System.out.println("----------");

    }

}
