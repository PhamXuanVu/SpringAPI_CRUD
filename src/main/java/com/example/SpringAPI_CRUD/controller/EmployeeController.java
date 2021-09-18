package com.example.SpringAPI_CRUD.controller;

import com.example.SpringAPI_CRUD.entity.Employee;
import com.example.SpringAPI_CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> employees = employeeService.getAllEmployee();
        return employees;
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployees(@PathVariable Long employeeId){
        Employee employee = employeeService.getEmployeeById(employeeId);
        return employee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployeeById(@PathVariable Long employeeId){
        employeeService.deleteById(employeeId);
        return "Delete sussces id " + employeeId;
    }
}
