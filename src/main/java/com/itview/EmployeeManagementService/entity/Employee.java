package com.itview.EmployeeManagementService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "emp_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    private int empId;

    @Column(name = "empName")
    private String empName;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "status")
    private Status status;

}