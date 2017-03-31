package com.examples.dependencyInjection.servicos;

import com.examples.dependencyInjection.interfaces.IServicoMsg;

/**
 * Classe de serviço de envio de mensagem pelo canal e-mail. Essa classe é injetada como dependência
 * no objeto Comunicador através da classe injetora InjetorEmail
 */
public class ServicoEmail implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("E-mail enviado: " + assunto);
        System.out.println("Mensagem: " + mensagem);

    }
}
