package com.example.SpringAPI_CRUD.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotBlank(message = "Please input fist_name")
    @Length(min = 1 , max = 20,message = "less than 20 and greater than 1")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Email(message = "Please intput a email")
    private String email;
}
