package com.example.JWT.SpringJWT.controller;

import com.example.JWT.SpringJWT.model.Student;
import com.example.JWT.SpringJWT.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController
{
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }
}
