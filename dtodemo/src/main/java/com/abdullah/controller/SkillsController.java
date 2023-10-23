package com.abdullah.controller;

import com.abdullah.entity.Skills;
import com.abdullah.repository.SkillsRepository;
import com.abdullah.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {

    @Autowired
    private SkillService skillService;

    @PostMapping("/addskills")
    public Skills add(@RequestBody Skills skills){
        return skillService.add(skills);
    }
}
