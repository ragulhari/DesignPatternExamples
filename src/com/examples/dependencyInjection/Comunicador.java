package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class Comunicador {

    private IServicoMsg messageServiceBroker;

    public Comunicador(IServicoMsg msgService){
        this.messageServiceBroker = msgService;
    }

    public void cumprimentarAmigo(String assunto, String mensagem) {
        messageServiceBroker.sendMessage(assunto, mensagem);
    }




}
