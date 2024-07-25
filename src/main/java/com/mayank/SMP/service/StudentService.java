package com.mayank.SMP.service;

import java.util.List;
import java.util.Optional;

import com.mayank.SMP.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	public Optional<Student> findStudentByEmail(String email);
}
