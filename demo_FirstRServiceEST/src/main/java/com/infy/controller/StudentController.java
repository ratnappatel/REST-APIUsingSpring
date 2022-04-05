package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Student;
import com.infy.service.StudentService;


// A class creating a RESTful-WEbService
@RestController
//Context level mapping
@RequestMapping("/StudentApp")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	// to execute getStudents function over browser you must call URI ending with 
	// " /students " using HTTP-GET-REQUEST Method
	public List<Student> getStudents()
	{
		return service.getAllStudent();
	}
	
	@GetMapping(value="/students/{rollno}", produces = {"application/xml"})
	public Student getStudentByRollno(@PathVariable("rollno")Integer rno)
	{
		return service.getStudentDetails(rno);
	}

}
