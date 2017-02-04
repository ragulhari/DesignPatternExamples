package com.examples.decorator;

public class BaseWeapon implements Weapon {
    @Override
    public void load() {
        System.out.println("Arma básica obtida");
    }
}
