package com.examples.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ricardo on 2/14/17.
 */
public class FlyweightFactory {
    public List<Bloco> listablocos = new ArrayList<>();

    public Bloco getBloco(String texturaArquivo){

        Bloco blocoEncontrado = null;

        for (Bloco b : listablocos) {
            if (b.texturaArquivo.equals(texturaArquivo))
            {
                blocoEncontrado = b;
                break;
            }
        }

        if (blocoEncontrado == null) {
            blocoEncontrado = new Bloco(texturaArquivo);
            listablocos.add(blocoEncontrado);
        }

        return blocoEncontrado;
    }

    public int getQuantidadeBlocos() {
        return listablocos.size();
    }

}
