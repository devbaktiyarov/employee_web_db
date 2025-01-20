package com.devbaktiyarov.employee_web_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbaktiyarov.employee_web_db.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
