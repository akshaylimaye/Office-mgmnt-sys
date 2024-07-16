package com.itview.EmployeeManagementService.service;

import com.itview.EmployeeManagementService.entity.Employee;
import com.itview.EmployeeManagementService.entity.Status;
import com.itview.EmployeeManagementService.repository.EmployeeRepo;
import com.itview.EmployeeManagementService.repository.StatusRepo;
import com.itview.EmployeeManagementService.util.EncryptDecrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    StatusRepo statusRepo;

    public Employee saveEmployee(Employee employeeData) {

        String encodedPass = EncryptDecrypt.encrypt(employeeData.getUsername(),
                employeeData.getPassword());
        employeeData.setPassword(encodedPass);
        Status status = statusRepo.findById(1).get();
        employeeData.setStatus(status);

        return employeeRepo.save(employeeData);
    }

    public Employee getEmployeeById(Integer empId) {
        Employee employee = employeeRepo.findById(empId).get();

        Status status = employee.getStatus();

        if(status.getStatusId() == 1) {
            return employee;
        }
        return new Employee();

    }

    public Employee getEmployeeByUsername(String username) {
        Employee employee = employeeRepo.findByUsername(username);
        return employee;
    }

    public List<Employee> getEmployeeByage(int age) {
        List<Employee> employee = employeeRepo.findByAgeGreater18(age);
        return employee;
    }


    public void deleteEmployee(int empId) {
        Employee  employee = getEmployeeById(empId);
        Status status = statusRepo.findById(2).get();
        employee.setStatus(status);
        employeeRepo.save(employee);
    }

}
