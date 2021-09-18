package com.example.SpringAPI_CRUD.service;

import com.example.SpringAPI_CRUD.entity.Employee;
import com.example.SpringAPI_CRUD.error.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee e);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(long id) throws EmployeeNotFoundException;
    void deleteById(long id);
    Employee update(Long id , Employee employee);
}
