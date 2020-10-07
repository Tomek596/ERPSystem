package com.tomq.ERPSystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmployee;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToOne(mappedBy = "employee")
    private Operator operator;
}
