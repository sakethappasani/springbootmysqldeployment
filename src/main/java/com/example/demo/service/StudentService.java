package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService 
{
	public String addStudnet(Student s);
	public List<Student> viewStudents();
}
