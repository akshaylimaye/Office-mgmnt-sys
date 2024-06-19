package com.itview.Office_management_sys.dao;

import com.itview.Office_management_sys.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepo {

    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployee() {
        return employeeList;
    }

    public String saveEmployee(Employee employeeName) {
        employeeList.add(employeeName);
        return "Employee Added";
    }

    public void deleteEmployee(String id) {
        for (Employee employee:employeeList) {
            if (employee.getEmpId() == Integer.parseInt(id)) {
                employeeList.remove(employee);
                return;
            }
        }
    }
}
