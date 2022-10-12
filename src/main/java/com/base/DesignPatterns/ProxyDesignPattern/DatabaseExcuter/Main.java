package com.base.DesignPatterns.ProxyDesignPattern.DatabaseExcuter;

public class Main {

    public static void main(String[] args) {
        IDataBaseExecuter proxy = new DataBaseExecuterProxy("MSD", "Admin@123");
        try {
            proxy.dbExecuter("select * from DB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
