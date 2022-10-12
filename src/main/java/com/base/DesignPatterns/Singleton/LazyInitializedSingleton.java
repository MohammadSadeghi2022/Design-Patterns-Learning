package com.base.DesignPatterns.Singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private static LazyInitializedSingleton getInstance(){
        if (instance==null){
            instance=new LazyInitializedSingleton();
        }
        return instance;
    }
}
