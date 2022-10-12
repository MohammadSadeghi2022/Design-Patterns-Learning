package com.base.DesignPatterns.Singleton.ThreadSafe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
