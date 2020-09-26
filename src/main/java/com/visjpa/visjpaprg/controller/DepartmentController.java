package com.visjpa.visjpaprg.controller;

import com.visjpa.visjpaprg.model.Department;
import com.visjpa.visjpaprg.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
        return "Department saved";
    }
}
