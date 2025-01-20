package com.devbaktiyarov.employee_web_db.entity;

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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String fullname;
    private String username;
    private String email;
    private String phoneNumber;
    private String confirmPassword;
    private String password;

}
