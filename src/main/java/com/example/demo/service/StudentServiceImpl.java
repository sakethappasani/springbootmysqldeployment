package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService
{	
	@Autowired
	private StudentRepo repo;

	@Override
	public String addStudnet(Student s) {
		repo.save(s);
		return "Student Added Successfully";
	}

	@Override
	public List<Student> viewStudents() 
	{
		return repo.findAll();
	}

}
