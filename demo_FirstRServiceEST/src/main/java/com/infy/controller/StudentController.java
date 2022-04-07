package com.infy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Student>> getStudents()
	{
		List<Student> studentList = service.getAllStudent();
		return new ResponseEntity<>(studentList, HttpStatus.OK);
	}
	
	@GetMapping(value="/students/{rollno}")
	public Student getStudentByRollno(@PathVariable("rollno")Integer rno)
	{
		return service.getStudentDetails(rno);
	}
	
	@PostMapping("/students")
	public Student addStudentDetails(@RequestBody() Student s)
	{
		return service.insertStudent(s);
	}
	
	@PutMapping("/students/{rollno}")
	public Student updateStudent(@PathVariable("rollno")Integer rno,@RequestBody()Student s)
	{
		return service.editStudentDetails(rno, s);
	}
	
	@DeleteMapping("/students/{rollno}")
	public String deleteStudent(@PathVariable("rollno")Integer rollno)
	{
		service.deleteStudentDetails(rollno);
		return "Record Deleted Successfully.";
	}

}
