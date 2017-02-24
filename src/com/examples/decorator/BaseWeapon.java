package com.examples.decorator;

import com.examples.decorator.interfaces.Weapon;

public class BaseWeapon implements Weapon {
    @Override
    public void load() {
        System.out.println("Arma básica obtida");
    }
}
