package com.itview.Office_management_sys.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepo {

    public static ArrayList<String> employeeList = new ArrayList<>();

    public String getEmployee() {
        return employeeList.toString();
    }

    public String saveEmployee(String employeeName) {
        employeeList.add(employeeName);
        return "Employee Added";
    }
}
