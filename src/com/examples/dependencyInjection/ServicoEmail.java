package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class ServicoEmail implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("E-mail enviado: " + assunto);
        System.out.println("Mensagem: " + mensagem);

    }
}
