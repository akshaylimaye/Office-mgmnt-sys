package com.itview.EmployeeManagementService.service;

import com.itview.EmployeeManagementService.entity.Employee;
import com.itview.EmployeeManagementService.util.EncryptDecrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    EmployeeService service;

    @Autowired
    JwtService jwtService;

    public String login(String username, String password) {

        //validation username exists
        Employee employee = service.getEmployeeByUsername(username);
        String encryptedData = EncryptDecrypt.encrypt(username, password);
        if(employee.getPassword().equals(encryptedData)) {
            String token = jwtService.generateToken(username, employee.getEmpId());
            return token;
        }
        return null;
    }


}
