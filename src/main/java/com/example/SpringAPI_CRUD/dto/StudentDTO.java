package com.example.SpringAPI_CRUD.dto;

import com.example.SpringAPI_CRUD.entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StudentDTO {
    private String email;

    private String fullName;

    private String phone;

    private String avatar;

    public StudentDTO(Student original) {
        this.email = original.getEmail();
        this.fullName = original.getFullName();
        this.phone = original.getPhone();
        this.avatar = original.getAvatar();
    }
}
