package com.base.DesignPatterns.Singleton;

public class Static_block {
    private static Static_block instance;

    static {
        try {
            instance=new Static_block();
        }catch (Exception exception){

            throw new RuntimeException("dddddddddddddddddddddd");

        }
    }
    private static Static_block getInstance(){

        return instance;
    }
}
