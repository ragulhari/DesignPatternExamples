package com.examples.observer;

public class Vigilancia extends ChecklistSeguranca implements IAlarme{

    @Override
    public void alarme() {
        System.out.println( "Vigilância:" );
        procedimento();
    }

        protected void isolate() { System.out.println( "   testando câmeras" ); }
}
