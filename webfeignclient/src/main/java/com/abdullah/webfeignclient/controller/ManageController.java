package com.abdullah.webfeignclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.webfeignclient.entity.Student;
import com.abdullah.webfeignclient.service.ServiceFeign;

@RestController
public class ManageController {

    @Autowired
    private ServiceFeign serviceFeign;

    @PostMapping("/newadd")
    public Student add(@RequestBody Student student){
         return serviceFeign.add(student);
    }
    @GetMapping("/newall")
    public List<Student> getAll(){
        return serviceFeign.getAll();
    }
    @GetMapping("/newok")
    public String get(){
        return serviceFeign.getOk1();
    }
    
}
