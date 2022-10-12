package com.base.DesignPatterns.Adapter.DAO;

import com.base.DesignPatterns.Adapter.EmployeeAdapter;
import com.base.DesignPatterns.Adapter.EmployeeDTO;
import org.junit.jupiter.api.Test;

class EmployeeDaoTest {

    @Test
    public static void main(String[] args) {
        EmployeeDao employeeDao=new EmployeeDao();
        employeeDao.save(new EmployeeAdapter(new EmployeeDTO()));
    }
}