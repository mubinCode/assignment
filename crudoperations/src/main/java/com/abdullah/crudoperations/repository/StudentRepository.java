package com.abdullah.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.crudoperations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
