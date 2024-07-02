package com.itview.EmployeeManagementService.repository;


import com.itview.EmployeeManagementService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    public Employee findByUsername(String username);

    @Query(value = "select * from emp_table where age > ?1", nativeQuery = true)
    public List<Employee> findByAgeGreater18(int id);

}
