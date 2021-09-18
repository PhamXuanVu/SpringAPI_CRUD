package com.example.SpringAPI_CRUD.service;

import com.example.SpringAPI_CRUD.entity.Student;
import com.example.SpringAPI_CRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getListStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
