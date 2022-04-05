package com.infy.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
