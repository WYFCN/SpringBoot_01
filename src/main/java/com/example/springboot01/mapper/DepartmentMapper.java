package com.example.springboot01.mapper;

import com.example.springboot01.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface DepartmentMapper {

    public Collection<Department> getDepartments();

    public Department getDepartment(Integer id);

}
