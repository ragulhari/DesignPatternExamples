package com.examples.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Para garantir a otimização dos recursos, a criação dos objetos deve ser feita por um Factory. A classe
 * FlyweightFactory, dessa forma, tem o objetivo de criar os objetos do tipo Bloco. Para otimização, ela
 * verifica se alguma instância do objeto solicitado já foi criada. Se afirmativo, ela retorna a instância
 * atual e não cria uma nova instância. É essa verificação que garante a otimização dos recursos.
 */
public class FlyweightFactory {

    //Mantém uma lista dinãmica dos blocos já criados.
    public List<Bloco> listablocos = new ArrayList<>();

    /*Este método é o responsável por devolver o objeto solicitado, seja através da criação de uma nova
    instância, ou utilizando uma instância criada anteriormente.
    */
    public Bloco getBloco(String texturaArquivo){

        Bloco blocoEncontrado = null;

        /*esse bloco verifica a lista de blocos e, caso já exista instância do bloco solicitado, devolve
        a instância para a classe invocadora*/
        for (Bloco b : listablocos) {
            if (b.texturaArquivo.equals(texturaArquivo))
            {
                blocoEncontrado = b;
                break;
            }
        }

        /*Caso o bloco ainda não tenha sido criado, executa a criação do novo bloco e adiciona à lista*/
        if (blocoEncontrado == null) {
            blocoEncontrado = new Bloco(texturaArquivo);
            listablocos.add(blocoEncontrado);
        }

        return blocoEncontrado;
    }

    //Devolve a quantidade de objetos bloco efetivamente criados.
    public int getQuantidadeBlocos() {
        return listablocos.size();
    }

}
