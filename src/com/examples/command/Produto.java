package com.examples.command;

/**
 * Classe que descreve as propriedades e comportamentos padrão de um produto no sistema.
 * Os métodos fecharVenda e incluirProdutoEmEstoque são dois comportamentos podem executar.
 * Esses dois métodos são invocados pelos comandos VenderProduto e ReporEstoque
 */
class Produto {

    public String nomeProduto;
    public double valor;
    public int quantidade;

    public Produto(String nomeProduto, double valorUnitario, int quantidadeInicial) {
        this.nomeProduto = nomeProduto;
        this.valor = valorUnitario;
        this.quantidade = quantidadeInicial;
    }

    /*Método para executar operação de venda. No exemplo, apenas uma checagem simples se há a
    * quantidade disponível é realizada (caso contrário retorna 0 como valor da venda.
    * O retorno é o valor vendido dos produtos.
    * */
    public double fecharVenda(int quantidadeDesejada) {

        if (quantidadeDesejada > quantidade)
            return 0;

        this.quantidade -= quantidadeDesejada;
        return (valor * quantidadeDesejada);

    }

    /*Método para executar a operação de compra, consistindo apenas na adição da quantidade
    * de produtos comprados.*/
    public void incluirProdutoEmEstoque (int quantidadeAdquirida) {
        this.quantidade += quantidadeAdquirida;
    }

}
