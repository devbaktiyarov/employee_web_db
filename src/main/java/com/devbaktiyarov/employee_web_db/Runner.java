package com.devbaktiyarov.employee_web_db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devbaktiyarov.employee_web_db.entity.Employee;
import com.devbaktiyarov.employee_web_db.repository.EmployeeRepository;

@Component
public class Runner implements CommandLineRunner {


    private final EmployeeRepository employeeRepository;

    public Runner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setName("Alice Johnson");
        employee1.setSalary(75000.0);
        employee1.setDepartment("IT");
        employee1.setPosition("Software Engineer");
        employee1.setEmail("alice.johnson@example.com");
        employee1.setPhone("555-1234");
        employee1.setAddress("123 Main St, Springfield");
        employee1.setHireDate("2021-03-15");
        employee1.setAge(30);

        Employee employee2 = new Employee();
        employee2.setName("Bob Smith");
        employee2.setSalary(68000.0);
        employee2.setDepartment("HR");
        employee2.setPosition("HR Specialist");
        employee2.setEmail("bob.smith@example.com");
        employee2.setPhone("555-5678");
        employee2.setAddress("456 Elm St, Springfield");
        employee2.setHireDate("2020-08-22");
        employee2.setAge(35);

        Employee employee3 = new Employee();
        employee3.setName("Carol Davis");
        employee3.setSalary(82000.0);
        employee3.setDepartment("Finance");
        employee3.setPosition("Financial Analyst");
        employee3.setEmail("carol.davis@example.com");
        employee3.setPhone("555-8765");
        employee3.setAddress("789 Oak St, Springfield");
        employee3.setHireDate("2019-11-05");
        employee3.setAge(29);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);

    }

}