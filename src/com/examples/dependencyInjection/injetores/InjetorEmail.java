package com.examples.dependencyInjection.injetores;

import com.examples.dependencyInjection.servicos.ServicoEmail;
import com.examples.dependencyInjection.interfaces.IInjetor;
import com.examples.dependencyInjection.interfaces.IServicoMsg;

/**
 * Classe que define o injetor de e-mail. A unica ação dessa classe é retornar o serviço correspondente ao
 * injetor definido.
 */
public class InjetorEmail implements IInjetor {
    @Override
    public IServicoMsg getMessageService() {
        return new ServicoEmail();
    }
}
