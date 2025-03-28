package com.K21CNT1.NQK.lesson03.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private float salary;
    private String email;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, float salary, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.email = email;
    }
}
