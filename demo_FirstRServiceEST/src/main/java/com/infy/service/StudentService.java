package com.infy.service;

import java.util.List;

import com.infy.entity.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public Student getStudentDetails(int rollno);
	public Student insertStudent(Student s);
	public Student editStudentDetails(int rollno,Student s);
	public Student deleteStudentDetails(int rollno);
}
