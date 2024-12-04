package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class ClientController 
{
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public ResponseEntity<String> home()
	{
		return new ResponseEntity<>("<h3 align='center'>Welcome to Spring Boot + My SQL Deployement  in Railway App</h3>/",HttpStatus.OK);
	}
	
	@GetMapping("addstudent/{id}/{name}")
	public ResponseEntity<String> addstudent(@PathVariable int id, @PathVariable String name)
	{
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		String msg =  service.addStudnet(s);
		return new  ResponseEntity<>(msg, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("viewall")
	public ResponseEntity<List<Student>> viewstudents()
	{
		List<Student> stuList = service.viewStudents();
		return new ResponseEntity<>(stuList, HttpStatus.OK);
	}
}
