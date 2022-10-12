package com.base.DesignPatterns.NewFactory.Impl;

import com.base.DesignPatterns.NewFactory.MotorCycle;

import java.text.MessageFormat;

public class Suzuki implements MotorCycle {
    @Override
    public void enginePower(String power) {
        System.out.println(MessageFormat.format(" Suzuki12: {0}", power));
    }

    @Override
    public Suzuki getInstance() {
        return new Suzuki();
    }
}
