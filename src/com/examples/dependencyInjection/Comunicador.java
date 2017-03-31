package com.examples.dependencyInjection;

import com.examples.dependencyInjection.interfaces.IServicoMsg;

/**
 * A classe Comunicador serve para disparar as mensagens, independentemente do canal. O canal a ser usado
 * (e-mail/twitter/SMS) é passado via dependência na criação do objeto.
 *
 * O método responsável por enviar a mensagem é "cumprimentarAmigo" e esse método invoca da classe de
 * serviço do canal, o método "sendMessage", definido na interface IServicoMsg
 */
public class Comunicador {

    private IServicoMsg messageServiceBroker;

    //como parâmetro do construtor é passado o serviço que implementa o canal desejado.
    public Comunicador(IServicoMsg msgService){
        this.messageServiceBroker = msgService;
    }

    /*Este método é o responsável pelo envio da mensagem. Ela usa o objeto implementador do canal para
     fazer esse envio*/
    public void cumprimentarAmigo(String assunto, String mensagem) {
        messageServiceBroker.sendMessage(assunto, mensagem);
    }

}
