package com.example.SpringAPI_CRUD.repository;

import com.example.SpringAPI_CRUD.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
