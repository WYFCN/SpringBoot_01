package com.example.springboot01.service;

import com.example.springboot01.entities.Department;

import java.util.Collection;

public interface DepartmentService {

    public Collection<Department> getDepartments();

    public Department getDepartment(Integer id);
}
