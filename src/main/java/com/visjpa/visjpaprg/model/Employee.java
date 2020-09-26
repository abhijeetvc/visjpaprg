package com.visjpa.visjpaprg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private Double salary;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="dept_id",nullable = false)
    private Department department;
}
