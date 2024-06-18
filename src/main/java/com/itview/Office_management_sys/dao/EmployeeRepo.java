package com.itview.Office_management_sys.dao;

import com.itview.Office_management_sys.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepo {

    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public String getEmployee() {
        return employeeList.toString();
    }

    public String saveEmployee(Employee employeeName) {
        employeeList.add(employeeName);
        return "Employee Added";
    }
}
