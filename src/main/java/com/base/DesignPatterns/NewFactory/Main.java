package com.base.DesignPatterns.NewFactory;

import com.base.DesignPatterns.NewFactory.Impl.Honda;

public class Main {
    public static void main(String[] args) {
        //Objects.requireNonNull(MototFactory.getInstance(new Honda()));
        MotorCycle honda = MototFactory.getInstance(new Honda());
        MotorCycle honda1 = MototFactory.getInstance(new Honda());
        System.out.println(honda);
        System.out.println(honda1);
        honda.enginePower("100");
    }
}
