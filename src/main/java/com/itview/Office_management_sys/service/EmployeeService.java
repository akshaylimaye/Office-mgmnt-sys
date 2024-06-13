package com.itview.Office_management_sys.service;


import com.itview.Office_management_sys.dao.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public String getEmployee() {
        return employeeRepo.getEmployee();

    }


}
