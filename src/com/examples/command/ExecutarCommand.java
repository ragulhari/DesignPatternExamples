package com.examples.command;

public class ExecutarCommand {

    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private VenderProduto venda;
    private ReporEstoque reposicao;
    private Sequenciador sequencia;

    public ExecutarCommand(){
        produto1 = new Produto("Pen Drive", 20.30, 10);
        produto2 = new Produto("Impressora", 275.70, 8);
        produto3 = new Produto("Mouse", 75.10, 15);
        sequencia = new Sequenciador();
    }

    public void iniciar(){
        sequencia.empilharComando(new VenderProduto(produto1, 3));
        sequencia.empilharComando(new ReporEstoque(produto2, 5));
        sequencia.empilharComando(new VenderProduto(produto2, 6));
        sequencia.empilharComando(new VenderProduto(produto1, 4));
        sequencia.empilharComando(new VenderProduto(produto2, 12));
        sequencia.empilharComando(new VenderProduto(produto3, 11));
        sequencia.empilharComando(new ReporEstoque(produto3, 3));

        sequencia.dispararComandos();
    }


}
