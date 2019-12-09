package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;


@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRep;
	
	public Teacher createTeacher(int id,String name,String department,Double salary) {	
		return teacherRep.save(new Teacher(id, name, department, salary));
	}
	
	public void deleteTeacher() {
		teacherRep.deleteAll();
	}
	
//	public Teacher findOne(int id) {
//		return teacherRep.findOne(example);
//	}
	
	public String getAll(){
		List<Teacher> tList=teacherRep.findAll();
		String s= tList.toString();
		return s;
	}
	
	public String findbyId(int id) {
		Optional<Teacher> idList=teacherRep.findById(id);
		String s1=idList.toString();
		return s1;
	}
	
	public String getbyDept(String department) {
		List<Teacher> deptList = teacherRep.findbyDept(department);
		return deptList.toString();
	}
	
	public String getBetweenSal(Double sal1 , Double sal2) {
		List<Teacher> salList = teacherRep.findbySalary(sal1, sal2);
		return salList.toString();
 	}
	
	public void deleteOne(int id) {
		teacherRep.deleteById(id);
	}
	
}
