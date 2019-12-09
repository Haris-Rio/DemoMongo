package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRep;
	
	public Student create(int id,String name,String subject) {
		return studentRep.save(new Student(id, name, subject));
	}
}
