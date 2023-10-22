package com.abdullah.webfeignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.webfeignclient.entity.Student;
import com.abdullah.webfeignclient.service.ServiceFeign;

@RestController
public class ManageController {

    @Autowired
    private ServiceFeign serviceFeign;

    @PostMapping("/newadd")
    public Student add(Student student){
         return serviceFeign.add(student);
    }
    
}
