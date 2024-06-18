package com.itview.Office_management_sys.controller;

import com.itview.Office_management_sys.model.Employee;
import com.itview.Office_management_sys.service.EmployeeService;
import com.itview.Office_management_sys.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService service){
        employeeService = service;
    }

    @PostMapping("/employee")
    public String saveEmployee(@RequestBody Employee employeeData){

        String phoneNumber = employeeData.getPhoneNumber();

        if(!CommonUtils.isValidNumber(phoneNumber)) {
            return "Phone number is not valid";
        }
        return employeeService.saveEmployee(employeeData);

    }


    @GetMapping("/employee")
    public String getEmployees() {
        String listOfEmp = employeeService.getEmployee();
        return listOfEmp;
    }


}
