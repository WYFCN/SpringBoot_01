package com.example.springboot01.controller;

import com.example.springboot01.entities.Department;
import com.example.springboot01.entities.Employee;
import com.example.springboot01.service.DepartmentService;
import com.example.springboot01.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeService.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentService.getDepartments();
        for(Department d:departments){
            System.out.println(d);
        }
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("save........");
        System.out.println(employee);
        employeeService.save(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeService.get(id);
        System.out.println(employee.getId());
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/update";
    }
    @PostMapping("/emp/update")
    public String updateEmployee(Employee employee){
        System.out.println("update.......");
        employeeService.update(employee);
        return "redirect:/emps";
    }
    @PostMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return "redirect:/emps";
    }
}
