package com.itview.EmployeeManagementService.controller;

import com.itview.EmployeeManagementService.entity.Employee;
import com.itview.EmployeeManagementService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * Post mapping
     *
     * @param employeeData
     * @return
     */
    @PostMapping("/employee")
    public ResponseEntity saveEmployee(@RequestBody Employee employeeData){

        Employee employee = employeeService.saveEmployee(employeeData);
        return new ResponseEntity(employee.getEmpId(), HttpStatus.CREATED);

    }

    /**
     * Get mapping
     *
     * @param empId
     * @return
     */
    @GetMapping("/employee")
    public ResponseEntity getEmployeesById(@Nullable @RequestParam String empId) {
        Employee emp = employeeService.getEmployeeById(Integer.valueOf(empId));
        return new ResponseEntity<>(emp.toString(), HttpStatus.OK);
    }


    @GetMapping("/employeeByUsername")
    public ResponseEntity getEmployees(@Nullable @RequestParam String username) {
        Employee emp = employeeService.getEmployeeByUsername(username);
        return new ResponseEntity<>(emp.toString(), HttpStatus.OK);
    }

    @GetMapping("/employeeByage")
    public ResponseEntity getEmployeeByage(@Nullable @RequestParam String age) {
        List<Employee> emp = employeeService.getEmployeeByage(Integer.valueOf(age));
        return new ResponseEntity<>(emp.toString(), HttpStatus.OK);
    }








}
