package com.itview.EmployeeManagementService.repository;

import com.itview.EmployeeManagementService.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status, Integer> {
}
