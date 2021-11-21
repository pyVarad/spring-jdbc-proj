package com.learn.springjdbc.service;

import com.learn.springjdbc.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentsByLastName(String lastName);
}
