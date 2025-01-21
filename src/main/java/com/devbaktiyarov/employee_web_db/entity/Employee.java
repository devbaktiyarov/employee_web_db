package com.devbaktiyarov.employee_web_db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "department", nullable = false, length = 50)
    private String department;

    @Column(name = "position", nullable = false, length = 50)
    private String position;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "phone", length = 60)
    private String phone;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "hire_date", nullable = false)
    private String hireDate;

    @Column(name = "age")
    private Integer age;


}
