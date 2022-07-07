package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Hello {
@Autowired
private UserRepo userRepo;

    @GetMapping("findall")

    public List<Student> userRepo(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody Student user){
        userRepo.save(user);
        return "succesfully registered";
    }

}
