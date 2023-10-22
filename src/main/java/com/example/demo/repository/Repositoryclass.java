package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface Repositoryclass extends CrudRepository<Student,Integer>{
	
	//save post request create a record //c
	//findbyid //get request it will retrive a record from db
	//deletebyid

}
