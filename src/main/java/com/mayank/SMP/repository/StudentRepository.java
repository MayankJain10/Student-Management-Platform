package com.mayank.SMP.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.SMP.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Optional<Student> findByEmail(String email);
}
