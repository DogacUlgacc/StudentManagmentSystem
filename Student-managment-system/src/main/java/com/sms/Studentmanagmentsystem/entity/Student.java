package com.sms.Studentmanagmentsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first-name",nullable = false)
    private String firstName;

    @Column(name = "last-name" ,nullable = false)
    private String lastName;

    @Column(name = "email",nullable = false)
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}