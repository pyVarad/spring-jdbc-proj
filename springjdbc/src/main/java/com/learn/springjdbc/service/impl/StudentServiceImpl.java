package com.learn.springjdbc.service.impl;

import com.learn.springjdbc.domain.Student;
import com.learn.springjdbc.repository.StudentRepository;
import com.learn.springjdbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudentsByLastName(String lastName) {
        return this.studentRepository.findByLastName(lastName);
    }
}
