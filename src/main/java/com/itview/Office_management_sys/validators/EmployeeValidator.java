package com.itview.Office_management_sys.validators;

import com.itview.Office_management_sys.model.Employee;
import com.itview.Office_management_sys.utils.CommonUtils;
import org.json.JSONObject;

public class EmployeeValidator {

    public static JSONObject validate(Employee employee) {

        JSONObject jsonObject = new JSONObject();

        if(employee.getUsername() == null) {
            jsonObject.put("username" , "Username is mandatory");
        }
        if(employee.getEmail() == null) {
            jsonObject.put("email" , "Email is mandatory");
        }
        if(employee.getPhoneNumber() == null) {
            jsonObject.put("phoneNumber" , "Phone number is mandatory");
        }
        if(employee.getPhoneNumber() != null) {
            if(!CommonUtils.isValidNumber(employee.getPhoneNumber())) {
                jsonObject.put("phoneNumber" , "Phone number is not valid");
            }
        }
        return jsonObject;


    }
}
