package com.visjpa.visjpaprg.controller;

import com.visjpa.visjpaprg.model.Employee;
import com.visjpa.visjpaprg.repository.EmployeeRepository;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Relations: a) OneToOne, b) OneToMany, c) ManyToOne, d) ManyToMany

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping(value="/getempbysalary/{salary}")
    public List<Employee> getEmpBySalary(@PathVariable Double salary){
        return employeeRepository.findBySalaryGreaterThan(salary);
    }
}
