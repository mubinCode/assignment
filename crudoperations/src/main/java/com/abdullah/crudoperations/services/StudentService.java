package com.abdullah.crudoperations.services;

import java.util.InputMismatchException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.crudoperations.entity.Student;
import com.abdullah.crudoperations.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        if(student.getStudentName().isEmpty() || student.getStudentName().length() == 0){
            throw new InputMismatchException();
        }
        return studentRepository.save(student);
    }
    public List<Student> getStudents(List<Student> student){
        if(student.size() > 2){
            throw new InputMismatchException();
        }
        return studentRepository.findAll();
    }
    
}
