package com.base.DesignPatterns.ProxyDesignPattern.InternetAccess;

public class RealInternetAccess implements OfficeInternetAccess {
    private String employeeName;

    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }
    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ employeeName);
    }
}
