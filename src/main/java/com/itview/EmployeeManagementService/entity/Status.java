package com.itview.EmployeeManagementService.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sts_id")
    private int statusId;

    @Column(name = "sts_name")
    private String statusName;

    @Column(name = "sts_descr")
    private String statusDescription;

}
