package com.examples.dependencyInjection;

/**
 * A c.
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
