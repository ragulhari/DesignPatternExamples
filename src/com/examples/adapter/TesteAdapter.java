package com.examples.adapter;

/**
 * Classe construída para simular a execução dos dois exemplos, o "Class Type" e o "Object Type".
 * Essa classe contem dois métodos, um para cada exemplo.
 * Cada exemplo consiste na inclusão de uma série de lançamentos e a execução das duas operações
 * implementadas no adapter: extrato dos últimos 12 lançamentos e o hsitórico de saldos.
 */

public class TesteAdapter {

    //Realiza a execução do teste de adapter do tipo "Class Type"
    public void iniciarClassTypeTest() {

        /*A classe AdapterClassType recebe no construtor o nome do correntista. A classe ObjectTypeAdapter
        recebe o nome como um parâmetro. Isso porque cada uma das abordagens tem formas diferentes de instanciação.
        (verifique a implementação das classes)
         */
        AdapterClassType cc1 = new AdapterClassType("João Carlos");

        //Lista de lançamentos usados no teste
        cc1.insereLancamento("Depósito", 2000.0f);
        cc1.insereLancamento("Saque", -110.0f);
        cc1.insereLancamento("Conta de luz", -36.43f);
        cc1.insereLancamento("Conta de água", -25.50f);
        cc1.insereLancamento("Mensalidade Internet", -226.41f);
        cc1.insereLancamento("Pagamento cartão débito - casas bahia", -125.40f);
        cc1.insereLancamento("Pagamento cartão débito - lanchonete", -16.10f);
        cc1.insereLancamento("Pagamento cartão débito - lanchonete", -8.00f);
        cc1.insereLancamento("Emprestimo", -1200.00f);
        cc1.insereLancamento("Saque", -150.00f);
        cc1.insereLancamento("Cartão de crédito", -459.00f);
        cc1.insereLancamento("Depósito", 600.00f);
        cc1.insereLancamento("Prestação do Carro", -350.47f);
        cc1.insereLancamento("Pagamento cartão débito - mensalidade", -250.10f);
        cc1.insereLancamento("Depósito", 800.00f);

        //Execução do teste de impressão do extrato com últimos 12 lançamentos
        System.out.println(cc1.ultimos12Lancamentos());

        //Execução do teste de histórico de saldos
        float[] fHistoricoSaldo = cc1.historicoSaldo();
        for (int i = 0; i < fHistoricoSaldo.length; i++) {
            System.out.println("Saldo: " + Float.toString(fHistoricoSaldo[i]));
        }

        System.out.println("Saldo atual: " + cc1.getSaldo());
    }

    //Realiza a execução do teste de adapter do tipo "Object Type"
    public void iniciarObjectTypeTest()
    {
        /*A classe ObjectTypeAdapter recebe o nome como um parâmetro.
        A classe AdapterClassType recebe no construtor o nome do correntista.
        Isso porque cada uma das abordagens tem formas diferentes de instanciação.
        (verifique a implementação das classes)
         */
        AdapterObjectType cc1 = new AdapterObjectType();

        //Lista de lançamentos usados no teste
        cc1.criarContaCorrente("João Carlos");
        cc1.objContaCorrente.insereLancamento("Depósito", 2000.0f);
        cc1.objContaCorrente.insereLancamento("Saque", -110.0f);
        cc1.objContaCorrente.insereLancamento("Conta de luz", -36.43f);
        cc1.objContaCorrente.insereLancamento("Conta de água", -25.50f);
        cc1.objContaCorrente.insereLancamento("Mensalidade Internet", -226.41f);
        cc1.objContaCorrente.insereLancamento("Pagamento cartão débito - casas bahia", -125.40f);
        cc1.objContaCorrente.insereLancamento("Pagamento cartão débito - lanchonete", -16.10f);
        cc1.objContaCorrente.insereLancamento("Pagamento cartão débito - lanchonete", -8.00f);
        cc1.objContaCorrente.insereLancamento("Emprestimo", -1200.00f);
        cc1.objContaCorrente.insereLancamento("Saque", -150.00f);
        cc1.objContaCorrente.insereLancamento("Cartão de crédito", -459.00f);
        cc1.objContaCorrente.insereLancamento("Depósito", 600.00f);
        cc1.objContaCorrente.insereLancamento("Prestação do Carro", -350.47f);
        cc1.objContaCorrente.insereLancamento("Pagamento cartão débito - mensalidade", -250.10f);
        cc1.objContaCorrente.insereLancamento("Depósito", 800.00f);

        //Execução do teste de impressão do extrato com últimos 12 lançamentos
        System.out.println(cc1.ultimos12Lancamentos());

        //Execução do teste de histórico de saldos
        float[] fHistoricoSaldo = cc1.historicoSaldo();
        for (int i = 0; i < fHistoricoSaldo.length; i++){
            System.out.println("Saldo: " + Float.toString(fHistoricoSaldo[i]));
        }

        System.out.println("Saldo atual: " + cc1.objContaCorrente.getSaldo());

    }
}
