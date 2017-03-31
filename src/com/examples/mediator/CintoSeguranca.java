package com.examples.mediator;

/**
 * A classe CintoSeguranca só mantém o status se o mesmo está atado ou não. Os métodos apenas
 * atribuem os status e devolvem o status para uso pelas outras classes.
 */
public class CintoSeguranca {

    private boolean cintoMotoristaHabilitado;

    public CintoSeguranca()
    {
        //Valor informado para facilitar o exemplo
        cintoMotoristaHabilitado = true;
    }

    public void soltarCintoMotorista() {

        /*Aqui entraria alguma implementação para realizar a operação.
        Para fins de exemplo, apenas definimos o valor da propriedade.
         */

        cintoMotoristaHabilitado = false;
    }


    public void apertarCintoMotorista() {

        /*Aqui entraria alguma implementação para realizar a operação.
        Para fins de exemplo, apenas definimos o valor da propriedade.
         */

        cintoMotoristaHabilitado = true;
    }

    public boolean statusCintoMotorista(){
        return  cintoMotoristaHabilitado;
    }

}
