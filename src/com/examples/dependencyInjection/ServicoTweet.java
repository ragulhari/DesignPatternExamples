package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class ServicoTweet implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("Tweet sobre " + assunto + ": " + mensagem);
    }
}
