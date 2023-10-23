package com.abdullah.controller;

import com.abdullah.dto.UserSkillDTO;
import com.abdullah.entity.User;
import com.abdullah.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/adduser")
    public User add(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/users")
    public List<UserSkillDTO> getusers(){
        return userService.getAllUser();
    }
}
