package com.itview.Office_management_sys.controller;

import com.itview.Office_management_sys.concepts.Animal;
import com.itview.Office_management_sys.model.Employee;
import com.itview.Office_management_sys.service.EmployeeService;
import com.itview.Office_management_sys.validators.EmployeeValidator;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    private final Animal animal;

    @Autowired
    public EmployeeController(EmployeeService service,@Qualifier("dog") Animal animal){
        employeeService = service;
        this.animal = animal;
    }

    /**
     * Post mapping
     *
     * @param employeeData
     * @return
     */
    @PostMapping("/employee")
    public ResponseEntity saveEmployee(@RequestBody Employee employeeData){
        //validations
        JSONObject errorList = EmployeeValidator.validate(employeeData);

        if(!errorList.isEmpty()) {
            return new ResponseEntity(errorList.toString(), HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(employeeService.saveEmployee(employeeData), HttpStatus.CREATED);

    }

    /**
     * Get mapping
     *
     * @param age
     * @param id
     * @return
     */
    @GetMapping("/employee")
    public ResponseEntity getEmployees(@Nullable @RequestParam String age, @Nullable @RequestParam String id) {
        String listOfEmp = employeeService.getEmployee(age, id);
        return new ResponseEntity(listOfEmp, HttpStatus.OK);
    }


    /**
     * Delete mapping
     * @param id
     * @return
     */
    @DeleteMapping("/employee/{id}")
    public ResponseEntity deleteEmployee(@PathVariable String id) {

        employeeService.deleteEmployee(id);

        return new ResponseEntity("Employee deleted with Id-", HttpStatus.NO_CONTENT);
    }


    /**
     * Put mapping
     * @param employee
     * @param id
     * @return
     */
    @PutMapping("/employee/{id}")
    public ResponseEntity updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
        //Validations
        employeeService.updateEmployee(employee, id);
        return new ResponseEntity("Employee updated", HttpStatus.OK);
    }


    @GetMapping("/testQualifier")
    public String testQualifier() {
        return  animal.makeSound();
    }


}
