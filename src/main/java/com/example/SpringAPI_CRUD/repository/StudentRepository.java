package com.example.SpringAPI_CRUD.repository;

import com.example.SpringAPI_CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
