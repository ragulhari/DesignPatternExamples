package com.examples.dependencyInjection.servicos;

import com.examples.dependencyInjection.interfaces.IServicoMsg;

/**
 * Classe de serviço de envio de mensagem pelo canal Twitter. Essa classe é injetada como dependência
 * no objeto Comunicador através da classe injetora InjetorTweet
 */
public class ServicoTweet implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("Tweet sobre " + assunto + ": " + mensagem);
    }
}
