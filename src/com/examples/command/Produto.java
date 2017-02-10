package com.examples.command;

class Produto {
    protected String nomeProduto;
    private double valor;
    public int quantidade;

    public Produto(String nomeProduto, double valorUnitario, int quantidadeInicial) {
        this.nomeProduto = nomeProduto;
        this.valor = valorUnitario;
        this.quantidade = quantidadeInicial;
    }

    public double fecharVenda(int quantidadeDesejada) {

        if (quantidadeDesejada > quantidade)
            return 0;

        this.quantidade -= quantidadeDesejada;
        return (valor * quantidadeDesejada);

    }

    public void incluirProdutoEmEstoque (int quantidadeAdquirida) {
        this.quantidade += quantidadeAdquirida;
    }

}
