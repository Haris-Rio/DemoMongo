package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, Integer>{
	
	@Query("{'department':?0}")
	List<Teacher> findbyDept(String department);
	
	@Query("{'salary':{$gt:?0 , $lt:?1}}")
	List<Teacher> findbySalary(Double sal1,Double sal2);
}
