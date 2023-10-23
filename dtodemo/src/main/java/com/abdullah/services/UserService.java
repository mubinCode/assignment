package com.abdullah.services;

import com.abdullah.dto.UserSkillDTO;
import com.abdullah.entity.User;
import com.abdullah.repository.SkillsRepository;
import com.abdullah.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final SkillsRepository skillsRepository;

    public User add(User user){
        return userRepository.save(user);
    }

    public List<UserSkillDTO> getAllUser(){
        return userRepository.findAll()
                .stream()
                .map(this::getUser)
                .collect(Collectors.toList());
    }

    private UserSkillDTO getUser(User user){
        UserSkillDTO userSkillDTO = new UserSkillDTO();
        userSkillDTO.setName(user.getUserName());
        userSkillDTO.setEmail(user.getEmail());
        userSkillDTO.setLanguage(user.getSkills().getLanguage());
        userSkillDTO.setExperience(user.getSkills().getExperience());
        return userSkillDTO;
    }
}
