package com.devbaktiyarov.employee_web_db.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devbaktiyarov.employee_web_db.entity.Employee;
import com.devbaktiyarov.employee_web_db.repository.EmployeeRepository;


@RestController
@RequestMapping("/api")
public class EmoployeeController {

    private final EmployeeRepository employeeRepository;

    public EmoployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(
            @RequestParam String fullname,
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String phoneNumber,
            @RequestParam String password,
            @RequestParam String confirmPassword
            ) {
    
        Employee employee = new Employee();
        employee.setFullname(fullname);
        employee.setUsername(username);
        employee.setEmail(email);
        employee.setPhoneNumber(phoneNumber);
        employee.setPassword(password);
        employee.setConfirmPassword(confirmPassword);

        employeeRepository.save(employee);

        return ResponseEntity.ok("Ok");       

    }


    @GetMapping("/{id}")
    // http://localhost:8080/api/1
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        
        Optional<Employee> e = employeeRepository.findById(id);
        if(e.isEmpty()) {
            throw new RuntimeException("Работник не найден");
        }

        System.out.println("API");

        return ResponseEntity.ok(e.get());
        
    }
    

}
