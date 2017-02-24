package com.examples.decorator;

import com.examples.decorator.interfaces.Weapon;

public abstract class WeaponAccessory implements Weapon {
    protected Weapon decoratedWeapon;

    public WeaponAccessory (Weapon weapon){
        this.decoratedWeapon = weapon;
    }

    public void load(){
        decoratedWeapon.load();
    }
}
