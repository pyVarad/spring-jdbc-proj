package com.learn.springjdbc.controllers;


import com.learn.springjdbc.domain.Student;
import com.learn.springjdbc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentControllers {

    private final StudentService studentService;

    @Autowired
    public StudentControllers(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{lastName}")
    public ResponseEntity<List<Student>> getStudentsByLastName(@PathVariable("lastName") String lastName) {
        return ResponseEntity.ok().body(this.studentService.getStudentsByLastName(lastName));
    }
}
