package com.example.springboot01.service.Imps;

import com.example.springboot01.entities.Department;
import com.example.springboot01.mapper.DepartmentMapper;
import com.example.springboot01.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public Collection<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentMapper.getDepartment(id);
    }
}
