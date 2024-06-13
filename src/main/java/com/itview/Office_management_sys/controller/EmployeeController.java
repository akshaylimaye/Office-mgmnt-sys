package com.itview.Office_management_sys.controller;

import com.itview.Office_management_sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    //Constructor based
//    @Autowired
//    public EmployeeController(DoctorController doctorController, PatientController patientController){
//        doctor = doctorController;
//        patient = patientController;
//    }


    @Autowired
    public EmployeeController(EmployeeService service){
        employeeService = service;
    }


    //Setter based
//    @Autowired
//    public void setDoctorController(DoctorController doctorController) {
//        doctor = doctorController;
//    }

    @GetMapping("/employees")
    public String getEmployees() {
        String listOfEmp = employeeService.getEmployee();
        return listOfEmp;
    }



}
