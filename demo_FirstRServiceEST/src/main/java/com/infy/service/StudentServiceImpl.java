package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.Student;
import com.infy.exception.StudentException;
import com.infy.repository.StudentRepository;

@Service
public class StudentServiceImpl  implements StudentService {
	
	@Autowired
	StudentRepository repository;
	public List<Student> getAllStudent()
	{
		List<Student> students=(List<Student>) repository.findAll();
		
		return students;
	}
	@Override
	public Student getStudentDetails(int rollno) {
		Student s=repository.findById(rollno).get();
		
		return s;
	}
	

}
