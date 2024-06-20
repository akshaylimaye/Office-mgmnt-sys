package com.itview.Office_management_sys.dao;

import com.itview.Office_management_sys.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepo {

    public static Map<Integer, Employee> employeeMap = new HashMap<>();

    public ArrayList<Employee> getEmployee() {
        ArrayList<Employee> empList = new ArrayList<>();
        for (Integer key: employeeMap.keySet()){
            empList.add(employeeMap.get(key));
        }
        return empList;
    }

    public String saveEmployee(Employee employee) {
        int id = employee.getEmpId();
        employeeMap.put(id, employee);
        return "Employee Added";
    }

    public void deleteEmployee(String id) {
        employeeMap.remove(Integer.valueOf(id));
    }

    public void updateEmployee(Employee empNew, String id) {
        employeeMap.put(Integer.valueOf(id), empNew);
    }
}
