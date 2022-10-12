package com.base.DesignPatterns.NewFactory.Impl;

import com.base.DesignPatterns.NewFactory.MotorCycle;

public class Honda implements MotorCycle {
   static MotorCycle instance = null;

    @Override
    public void enginePower(String power) {
        System.out.println("Honda: " + power);
    }

    @Override
    public MotorCycle getInstance() {
        if (instance == null) {
            return new Honda();
        }
        return instance;
    }

}
