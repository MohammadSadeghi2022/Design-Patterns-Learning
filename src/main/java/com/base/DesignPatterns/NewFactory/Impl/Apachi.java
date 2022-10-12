package com.base.DesignPatterns.NewFactory.Impl;

import com.base.DesignPatterns.NewFactory.MotorCycle;

import java.text.MessageFormat;

public class Apachi implements MotorCycle {
    @Override
        public void enginePower(String power) {
            System.out.println(MessageFormat.format(" Apachi man: {0}", power));
        }


    @Override
    public MotorCycle getInstance() {
        return new Apachi();
    }
}
