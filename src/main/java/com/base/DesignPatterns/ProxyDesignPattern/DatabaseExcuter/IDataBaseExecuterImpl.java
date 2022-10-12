package com.base.DesignPatterns.ProxyDesignPattern.DatabaseExcuter;

public class IDataBaseExecuterImpl implements IDataBaseExecuter {
    @Override
    public void dbExecuter(String query) throws Exception {
        System.out.println("Query: "+ query);
    }
}
