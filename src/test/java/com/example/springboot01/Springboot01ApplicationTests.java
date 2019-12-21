package com.example.springboot01;

import com.example.springboot01.entities.Employee;
import com.example.springboot01.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    EmployeeService employeeService;
    @Test
    void contextLoads() {
        Employee employee = employeeService.get(1001);
        System.out.println(employee);
    }

}
