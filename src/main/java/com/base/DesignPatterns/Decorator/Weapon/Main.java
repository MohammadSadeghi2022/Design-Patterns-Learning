package com.base.DesignPatterns.Decorator.Weapon;

import com.base.DesignPatterns.Decorator.Weapon.Accessory.Camera;
import com.base.DesignPatterns.Decorator.Weapon.Accessory.Silencer;
import com.base.DesignPatterns.Decorator.Weapon.Impl.Mp4;

public class Main {
    public static void main(String[] args) {
        Gun mp4=new Camera(new Silencer(new Mp4()));
        mp4.aim_and_fire();
    }
}
