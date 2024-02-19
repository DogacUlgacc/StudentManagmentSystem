package com.sms.Studentmanagmentsystem.service.impl;

import com.sms.Studentmanagmentsystem.entity.Student;
import com.sms.Studentmanagmentsystem.repository.StudentRepository;
import com.sms.Studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository= studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
