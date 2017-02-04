package com.examples.decorator;

public abstract class WeaponAccessory implements Weapon {
    protected Weapon decoratedWeapon;

    public WeaponAccessory (Weapon weapon){
        this.decoratedWeapon = weapon;
    }

    public void load(){
        decoratedWeapon.load();
    }
}
