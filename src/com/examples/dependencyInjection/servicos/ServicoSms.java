package com.examples.dependencyInjection.servicos;

import com.examples.dependencyInjection.interfaces.IServicoMsg;

/**
 * Classe de serviço de envio de mensagem pelo canal SMS. Essa classe é injetada como dependência
 * no objeto Comunicador através da classe injetora InjetorSms
 */
public class ServicoSms implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("SMS-> " + assunto + ": " + mensagem);
    }
}
