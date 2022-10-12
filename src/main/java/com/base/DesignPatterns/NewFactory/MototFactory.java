package com.base.DesignPatterns.NewFactory;

public class MototFactory {

    public static MotorCycle getInstance(MotorCycle type) {
        MotorCycle instance = null;

        return type.getInstance();
//        switch (type) {
//            case "suzuki":
//                instance = new Suzuki();
//                break;
//            case "honda":
//                instance = new Honda();
//                break;
//        }
//        return instance;
    }
}
