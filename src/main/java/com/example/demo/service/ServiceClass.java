package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.Repositoryclass;

@Service
public class ServiceClass {
	
	
	@Autowired
	Repositoryclass repository;
	
	
	public Optional<Student> getStudent(int id) {
		return repository.findById(id);
		
	}
	
	public void saveRecord1(Student obj) {
		repository.save(obj);
	}

}
