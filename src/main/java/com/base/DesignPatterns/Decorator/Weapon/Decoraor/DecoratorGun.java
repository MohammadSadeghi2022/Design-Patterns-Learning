package com.base.DesignPatterns.Decorator.Weapon.Decoraor;

import com.base.DesignPatterns.Decorator.Weapon.Gun;

public class DecoratorGun implements Gun {
    private Gun gun;

    public DecoratorGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void aim_and_fire() {
        this.gun.aim_and_fire();
    }
}
