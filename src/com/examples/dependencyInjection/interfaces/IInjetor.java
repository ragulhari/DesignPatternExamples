package com.examples.dependencyInjection.interfaces;

/**
 * Interface para as classes de injeção. Possui apenas um método, cujo objetivo é devolver o objeto
 * implementador do serviço
 */
public interface IInjetor {

    public IServicoMsg getMessageService();

}
