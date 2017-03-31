package com.examples.dependencyInjection.interfaces;

/**
 * Interface para as classes de serviço de envio de mensagem. Possui um único método, que realiza o
 * envio da mensagem.
 */
public interface IServicoMsg {
    void sendMessage(String assunto, String mensagem);
}
