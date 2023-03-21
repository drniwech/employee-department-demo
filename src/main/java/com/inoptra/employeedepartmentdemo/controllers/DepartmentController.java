package com.inoptra.employeedepartmentdemo.controllers;

import com.inoptra.employeedepartmentdemo.models.Department;
import com.inoptra.employeedepartmentdemo.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping()
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PutMapping()
    public Department updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }

}
