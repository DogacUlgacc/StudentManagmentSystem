package com.sms.Studentmanagmentsystem.repository;

import com.sms.Studentmanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

