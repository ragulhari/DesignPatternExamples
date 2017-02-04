package com.examples.observer;

/**
 * Created by ricardo on 2/4/17.
 */
public class ChecklistSeguranca {

    public void procedimento() {  // Template Method design pattern
        localizar();
        isolar();
        identificar();
    }

    protected void localizar() {
        System.out.println( "   Verificando locais" );
    }
    protected void isolar()  {
        System.out.println( "   Isolar cômodos inseguros" );
    }
    protected void identificar() {
        System.out.println( "   Identificar a fonte" );
    }

}
