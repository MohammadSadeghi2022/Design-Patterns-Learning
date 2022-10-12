package com.base.DesignPatterns.Singleton.ThreadSafe;

public class DoubleCheckedLock {

    private static DoubleCheckedLock instance;

    public static DoubleCheckedLock getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckedLock.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLock();
                }

            }
        }
        return instance;

    }
}
