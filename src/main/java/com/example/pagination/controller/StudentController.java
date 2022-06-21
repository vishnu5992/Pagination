package com.example.pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagination.model.Student;
import com.example.pagination.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@GetMapping("/student/{pageNo}/{pageSize}")
	public List<Student> getPaginated(@PathVariable int pageNo, @PathVariable int pageSize){
		 return ss.findPaginated(pageNo, pageSize);
		
	}
}
