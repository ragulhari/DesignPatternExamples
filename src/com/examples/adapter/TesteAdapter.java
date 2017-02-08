package com.examples.adapter;


public class TestarAdapterPattern {

    public TestarAdapterPattern() {}

    public void iniciarClassTypeTest() {
        AdapterClassType cc1 = new AdapterClassType("João Carlos");
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


        System.out.println(cc1.ultimos12Lancamentos());
        float[] fHistoricoSaldo = cc1.historicoSaldo();
        for (int i = 0; i < fHistoricoSaldo.length; i++) {
            System.out.println("Saldo: " + Float.toString(fHistoricoSaldo[i]));
        }

        System.out.println("Saldo atual: " + cc1.getSaldo());
    }

    public void iniciarObjectTypeTest()
    {
        AdapterObjectType cc1 = new AdapterObjectType();
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


        System.out.println(cc1.ultimos12Lancamentos());
        float[] fHistoricoSaldo = cc1.historicoSaldo();
        for (int i = 0; i < fHistoricoSaldo.length; i++){
            System.out.println("Saldo: " + Float.toString(fHistoricoSaldo[i]));
        }

        System.out.println("Saldo atual: " + cc1.objContaCorrente.getSaldo());

    }
}
