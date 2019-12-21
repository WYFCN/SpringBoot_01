package com.example.springboot01.service;

import com.example.springboot01.entities.Employee;

import java.util.Collection;

public interface EmployeeService {

    public void save(Employee employee);

    public Collection<Employee> getAll();

    public Employee get(Integer id);

    public void delete(Integer id);

    public void update(Employee employee);
}
