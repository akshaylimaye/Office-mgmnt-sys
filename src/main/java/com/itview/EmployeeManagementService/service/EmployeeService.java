package com.itview.EmployeeManagementService.service;

import com.itview.EmployeeManagementService.entity.Employee;
import com.itview.EmployeeManagementService.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee employeeData) {
        System.out.println(employeeRepo);
        return employeeRepo.save(employeeData);
    }

    public Employee getEmployeeById(Integer empId) {
        Employee employee = employeeRepo.findById(empId).get();
        return employee;
    }

    public Employee getEmployeeByUsername(String username) {
        Employee employee = employeeRepo.findByUsername(username);
        return employee;
    }

    public List<Employee> getEmployeeByage(int age) {
        List<Employee> employee = employeeRepo.findByAgeGreater18(age);
        return employee;
    }


}
