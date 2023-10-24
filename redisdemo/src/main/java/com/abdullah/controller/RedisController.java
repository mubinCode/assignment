package com.abdullah.controller;

import com.abdullah.entity.Person;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource(name = "redisTemplate")
    private HashOperations<String, Long, Person> hashOperations;


    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Person person){
        hashOperations.put("Person", person.getId(), person);
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
    @GetMapping("/{key}")
    public Person getPerson(@PathVariable Long key){
        return hashOperations.get("Person", key);
    }
    @GetMapping("/all")
    public Map<Long, Person> getAll(){
       return hashOperations.entries("Person");
    }
    @GetMapping("/")
    public List<Person> All(){
        return hashOperations.values("Person");
    }

}
