package com.itview.EmployeeManagementService.controller;

import com.itview.EmployeeManagementService.entity.Employee;
import com.itview.EmployeeManagementService.service.EmployeeService;
import com.itview.EmployeeManagementService.service.LoginService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody String credentials) {

        JSONObject jsonCred = new JSONObject(credentials);
        String username = jsonCred.getString("username");
        String password = jsonCred.getString("password");


        String token = loginService.login(username, password);
        if (null == token) {
            return new ResponseEntity<>("username password not valid", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}



