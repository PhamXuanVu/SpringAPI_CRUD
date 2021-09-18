package com.example.SpringAPI_CRUD.controller;

import com.example.SpringAPI_CRUD.dto.StudentDTO;
import com.example.SpringAPI_CRUD.entity.Student;
import com.example.SpringAPI_CRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<StudentDTO> getStudentList(){
        List<Student> students = studentService.getListStudent();

        List<StudentDTO> dtoList = new ArrayList<>();
        for (Student student : students){
            dtoList.add(new StudentDTO(student));
        }
        return dtoList;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){

        return studentService.saveStudent(student);
    }
}
