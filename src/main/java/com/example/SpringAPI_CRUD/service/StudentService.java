package com.example.SpringAPI_CRUD.service;

import com.example.SpringAPI_CRUD.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getListStudent();

    public Student saveStudent(Student student);
}
