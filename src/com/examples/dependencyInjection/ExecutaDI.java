package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class ExecutaDI {
    public static void go(){
        String assunto = "Olá!";
        String mensagem = "Há quanto tempo meu amigo!";

        IInjetor in;
        Comunicador p;

        in = new InjetorEmail();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);

        System.out.println("---------------");

        in = new InjetorSms();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);

        System.out.println("---------------");

        in = new InjetorTweet();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);

        System.out.println("---------------");

    }


}
