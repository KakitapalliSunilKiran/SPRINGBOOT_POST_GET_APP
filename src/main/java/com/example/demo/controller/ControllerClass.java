package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ServiceClass;

@RestController
@RequestMapping("api/v1")
public class ControllerClass {
	
	@Autowired
	ServiceClass obj;
	
	@GetMapping("/getstudent/{id}")
	public Optional<Student> getStudent(@PathVariable("id") Integer id) {
		return obj.getStudent(id);
	}
	
	@PostMapping("/save")
	public void saveRecord(@RequestBody Student obj1) {
		obj.saveRecord1(obj1);
	}

}

////CRUD 
//create -> storing a record in db  post request
//read-> fetching a record from db