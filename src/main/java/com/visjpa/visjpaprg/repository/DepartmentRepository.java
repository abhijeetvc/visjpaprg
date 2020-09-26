package com.visjpa.visjpaprg.repository;

import com.visjpa.visjpaprg.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
