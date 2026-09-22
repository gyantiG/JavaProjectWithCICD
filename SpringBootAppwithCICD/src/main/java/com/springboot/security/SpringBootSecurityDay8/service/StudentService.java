package com.springboot.security.SpringBootSecurityDay8.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.security.SpringBootSecurityDay8.entity.Student;
import com.springboot.security.SpringBootSecurityDay8.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getStudents() {
		long startTime=System.currentTimeMillis();
		List<Student> listOfStudents=studentRepository.findAll();;
		long endTime=System.currentTimeMillis();
		
		 System.out.println("Repository time = " + (endTime - startTime) + " ms" );
		return listOfStudents;
		
	}

}
