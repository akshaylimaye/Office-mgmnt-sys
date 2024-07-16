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

        //Add validation to check if username exists
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
    public ResponseEntity getEmployeesById(@Nullable @RequestParam String empId, @RequestHeader String auth) {
        Employee emp = employeeService.getEmployeeById(Integer.valueOf(empId));
        return new ResponseEntity<>(emp.toString(), HttpStatus.OK);
    }


    /**
     * Delete employee
     *
     * @param empId
     * @return
     */
    @DeleteMapping(value = "/employee/{empId}")
    public ResponseEntity deleteEmployee(@PathVariable int empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>("Employee deleted", HttpStatus.NO_CONTENT);
    }









}
