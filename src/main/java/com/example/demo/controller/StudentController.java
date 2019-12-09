package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

		@Autowired
		private StudentService studentServ;
		
		@GetMapping(value="/create/{id}/{name}/{sub}")
		public String create(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("sub") String subject) {
			
			Student stud=studentServ.create(id, name, subject);
			String temp=stud.toString();
			return temp;
			
		}

}
