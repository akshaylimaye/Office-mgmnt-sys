package com.itview.EmployeeManagementService;

import com.itview.EmployeeManagementService.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementServiceApplication {

	@Autowired
	StatusRepo statusRepo;


	public static void main(String[] args) {
		//Add the script to add status to tbl_status
		SpringApplication.run(EmployeeManagementServiceApplication.class, args);
	}

}
