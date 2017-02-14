package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class InjetorTweet implements IInjetor {
    @Override
    public IServicoMsg getMessageService() {
        return new ServicoTweet();
    }
}
