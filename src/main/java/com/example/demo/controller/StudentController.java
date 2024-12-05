package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@GetMapping("displaystudents")
	public ModelAndView displaystudents()
	{
		List<Student> studentList = service.viewStudents();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaystudents");
		mv.addObject("stuList", studentList);
		return mv;
	}
}
