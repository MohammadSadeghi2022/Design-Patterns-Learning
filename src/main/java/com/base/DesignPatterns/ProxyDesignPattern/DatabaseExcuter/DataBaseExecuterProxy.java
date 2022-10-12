package com.base.DesignPatterns.ProxyDesignPattern.DatabaseExcuter;

public class DataBaseExecuterProxy implements IDataBaseExecuter {
    private boolean isAdmin;
    private IDataBaseExecuterImpl dataBaseExecuter;

    public DataBaseExecuterProxy(String UserName, String pass) {
        if (UserName.equals("Admin") && pass.equals("Admin@123")) {
            this.isAdmin = true;
            this.dataBaseExecuter = new IDataBaseExecuterImpl();
        }
    }

    @Override
    public void dbExecuter(String query) throws Exception {
        if (isAdmin) {
            System.out.println("you have access.... ");
            this.dataBaseExecuter.dbExecuter(query);
        }
        else {
            throw new Exception(" you don't have right access...");
        }
    }
}
