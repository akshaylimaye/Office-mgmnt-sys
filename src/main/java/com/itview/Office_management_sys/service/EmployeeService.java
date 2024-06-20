package com.itview.Office_management_sys.service;


import com.itview.Office_management_sys.dao.EmployeeRepo;
import com.itview.Office_management_sys.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public String getEmployee(String age, String id) {
        ArrayList<Employee> employeeList = employeeRepo.getEmployee();
        ArrayList<Employee> empAgeList = new ArrayList<>();
        if(null != age) {
            for (Employee employee: employeeList) {
                if(employee.getAge() > Integer.parseInt(age)) {
                    empAgeList.add(employee);
                }
            }
            return empAgeList.toString();
        }
        return employeeList.toString();

    }

    private boolean isUsernameExists(String userName) {
        ArrayList<Employee> employeeList = employeeRepo.getEmployee();
        for (Employee employee: employeeList) {
            if(employee.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public String saveEmployee(Employee empdata) {
        if(!isUsernameExists(empdata.getUsername())) {
            return employeeRepo.saveEmployee(empdata);
        }
        return "Username already exits, please try another username!";

    }

    public void deleteEmployee(String id) {
        employeeRepo.deleteEmployee(id);
    }

    public void updateEmployee(Employee employee, String id) {
        employeeRepo.updateEmployee(employee, id);
    }
}
