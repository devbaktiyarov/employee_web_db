package com.devbaktiyarov.employee_web_db.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbaktiyarov.employee_web_db.entity.Employee;
import com.devbaktiyarov.employee_web_db.repository.EmployeeRepository;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/employees")
public class EmoployeeController {

    private final EmployeeRepository employeeRepository;

    public EmoployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        // Сохранение объекта в базе данных
        Employee savedEmployee = employeeRepository.save(employee);

        // Возвращение ответа с сохраненным объектом и статусом 201 Created
        return ResponseEntity.status(201).body(savedEmployee);
    }


    @GetMapping("/{id}")
    // http://localhost:8080/api/employees/1
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        
        Optional<Employee> e = employeeRepository.findById(id);
        if(e.isEmpty()) {
            throw new RuntimeException("Работник не найден");
        }

        System.out.println("API");

        return ResponseEntity.ok(e.get());
        
    }
    

}
