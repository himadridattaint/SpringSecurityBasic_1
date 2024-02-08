package com.example.JWT.SpringJWT.service;

import com.example.JWT.SpringJWT.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{
    private List<Student> student=new ArrayList<>();

    public StudentService()
    {
        student.add(new Student(1,"Himadri Datta","himadri.datta@gmail.com"));
        student.add(new Student(2,"Avishek Chakraborty","avishek.chakraborty@gmail.com"));
        student.add(new Student(3,"Dipak Datta","dipak.datta@gmail.com"));
    }
    public List<Student> getStudent()
    {
        return student;
    }
}
