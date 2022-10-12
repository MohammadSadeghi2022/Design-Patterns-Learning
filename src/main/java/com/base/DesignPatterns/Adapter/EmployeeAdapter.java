package com.base.DesignPatterns.Adapter;

public class EmployeeAdapter extends Employee {

    private EmployeeDTO employeeDTO;

    public EmployeeAdapter(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    @Override
    public Long getId() {
        return employeeDTO.getId();
    }

    @Override
    public String getCode() {
        return employeeDTO.getCode();
    }

    @Override
    public String getFullName() {
        return employeeDTO.getFirstName()+" "+employeeDTO.getLastName();
    }
}
