package com.visjpa.visjpaprg.repository;

import com.visjpa.visjpaprg.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findBySalaryGreaterThan(Double salary);
}
