package com.examples.dependencyInjection;

import com.examples.dependencyInjection.injetores.InjetorEmail;
import com.examples.dependencyInjection.injetores.InjetorSms;
import com.examples.dependencyInjection.injetores.InjetorTweet;
import com.examples.dependencyInjection.interfaces.IInjetor;

/**
 * Classe inicial do exemplo.
 *
 * Implementamos, para exemplificar a injeção de dependência, um serviço de envio de mensagem que
 * pode utilizar três canais diferentes: E-mail, SMS ou Twitter. A classe responsável pela comunicaçõa
 * tem o nome "Comunicador". A classe Comunicador não tem conhecimento dos canais utilizados. Esses canais
 * são enviados à classe Comunicador por meio de uma injeção de dependência.
 *
 * Cada dependência a ser injetada precisa implementar uma interface (IServicoMsg) e, para cada uma dessas
 * dependências, há um injetor específico que implementa a interface IInjetor. O exemplo dessa forma pega
 * uma mensagem e utiliza a classe Comunicador com cada um dos canais de comunicaçõa, por meio da injeção
 * de dependẽncia.
 *
 * @author Ricardo D. Agulhari
 * Março/2017
 */
public class ExecutaDI {
    public static void go(){

        //Conteúdo da mensagem
        String assunto = "Olá!";
        String mensagem = "Há quanto tempo meu amigo!";

        //Por meio de "in" faremos a injeção da dependência da classe Comunicador
        IInjetor in;
        Comunicador p;

        /*Fazemos o envio usando o canal e-mail. Para isso, ao instanciar a classe Comunicador, é passado
        * o injetor da dependência do serviço de e-mail. Em seguida a mensagem é enviada pelo metodo
        * cumprimentarAmigo*/
        in = new InjetorEmail();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);
        System.out.println("---------------");

        /*Fazemos o envio usando o canal SMS. Para isso, ao instanciar a classe Comunicador, é passado
        * o injetor da dependência do serviço de e-mail. Em seguida a mensagem é enviada pelo metodo
        * cumprimentarAmigo*/
        in = new InjetorSms();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);
        System.out.println("---------------");

        /*Fazemos o envio usando o canal Twitter. Para isso, ao instanciar a classe Comunicador, é passado
        * o injetor da dependência do serviço de e-mail. Em seguida a mensagem é enviada pelo metodo
        * cumprimentarAmigo*/
        in = new InjetorTweet();
        p = new Comunicador(in.getMessageService());
        p.cumprimentarAmigo(assunto, mensagem);
        System.out.println("---------------");

    }


}
