package com.abdullah.webfeignclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abdullah.webfeignclient.entity.Student;

// @Service
@FeignClient(value ="FeignDemo", url="http://localhost:8080/v1")
public interface ServiceFeign {

    @PostMapping("/add")
    public Student add(Student student);
    @GetMapping("/getall")
    public List<Student> getAll();
    @GetMapping("/ok")
    public String getOk1();
    
}
