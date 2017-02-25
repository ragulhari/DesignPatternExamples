package com.examples.decorator;

import com.examples.decorator.interfaces.IWeapon;


/**
 * Classe que implementa uma arma básica. Essa é a primeira classe criada e à ela
 * que serão adicionadas os decorators.
 */
public class BaseWeapon implements IWeapon {

    @Override
    public void load() {
        System.out.println("Arma básica obtida");
    }

    @Override
    public void shot() {
        System.out.println("Atirando com arma básica");
    }

    @Override
    public String getWeaponDescription() {
        return "Arma básica ";
    }
}
