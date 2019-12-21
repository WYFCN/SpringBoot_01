package com.example.springboot01.mapper;

import com.example.springboot01.entities.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface EmployeeMapper {

    public void save(Employee employee);

    public Collection<Employee> getAll();

    public Employee get(Integer id);

    public void delete(Integer id);

    public void update(Employee employee);
}
