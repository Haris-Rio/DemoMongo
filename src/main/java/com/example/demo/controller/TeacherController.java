package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherServ;
	
	@GetMapping(value = "/createTeacher/{id}/{name}/{dept}/{sal}")
	public String create(@PathVariable("id") int id, @PathVariable("name") String name,@PathVariable("dept") String department,@PathVariable("sal") Double salary) {
		
		Teacher teach=teacherServ.createTeacher(id, name, department, salary);
		String flag=teach.toString();
		return flag;
	}
	@GetMapping(value = "/deleteTeacher")
	public void deleteTeacher() {
		teacherServ.deleteTeacher();
	}
	
	@GetMapping(value ="/getAll")
	public String getAll(){
		return teacherServ.getAll();
	}
	
	@GetMapping(value = "/findbyId/{id}")
	public String findbyId(@PathVariable("id") int id) {
		return teacherServ.findbyId(id);
	}
	
	@GetMapping(value = "/getbyDept/{dept}")
	public String getbyDept(@PathVariable("dept") String department) {
		return teacherServ.getbyDept(department);
	}
	
	@GetMapping(value = "/getBetweenSal/{sal1}/{sal2}")
	public String getBetweenSal(@PathVariable("sal1") Double sal1, @PathVariable("sal2") Double sal2) {
		return teacherServ.getBetweenSal(sal1, sal2);
	}
	
	@GetMapping(value = "/deleteOne/{id}")
	public void deleteOne(@PathVariable("id") int id) {
		teacherServ.deleteOne(id);
	}
}
