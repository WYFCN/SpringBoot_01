package com.example.springboot01.service.Imps;

import com.example.springboot01.entities.Employee;
import com.example.springboot01.mapper.EmployeeMapper;
import com.example.springboot01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public void save(Employee employee) {
        employeeMapper.save(employee);
    }

    @Override
    public Collection<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public Employee get(Integer id) {
        return employeeMapper.get(id);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.delete(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }
}
