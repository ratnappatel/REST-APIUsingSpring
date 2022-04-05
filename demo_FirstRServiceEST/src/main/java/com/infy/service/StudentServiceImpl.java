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
	@Override
	public Student insertStudent(Student s) {
		Student added=repository.save(s);
		return added;
	}
	@Override
	public Student editStudentDetails(int rollno, Student s) {
		Student existing=repository.findById(rollno).get();
		existing.setName(s.getName());
		existing.setMobileno(s.getMobileno());
		existing.setAddress(s.getAddress());
		return repository.save(existing);
		
	}
	@Override
	public Student deleteStudentDetails(int rollno) {
		repository.deleteById(rollno);
		return null;
	}
	

}
