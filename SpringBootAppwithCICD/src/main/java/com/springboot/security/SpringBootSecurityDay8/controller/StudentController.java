package com.springboot.security.SpringBootSecurityDay8.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.SpringBootSecurityDay8.entity.Student;
import com.springboot.security.SpringBootSecurityDay8.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService=studentService;
	}
	
	@PostMapping
	public Student createUser(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllUser(){
		return studentService.getStudents();
	}

}
