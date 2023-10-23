package com.abdullah.services;

import com.abdullah.entity.Skills;
import com.abdullah.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService {

    @Autowired
    private SkillsRepository skillsRepository;

    public Skills add(Skills skills){
        return skillsRepository.save(skills);
    }
}
