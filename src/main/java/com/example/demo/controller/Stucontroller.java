package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.RestController;
import org.springframework.stereotype.service;
import com.example.demo.entity.Stuentity;
import com.example.demo.service.Stuservice;

@RestController
public class Stucontroller{
    @Autowired
    Stuservice studentservice;
    @PostMapping("/postdata")
    public Stuentity postdata(@RequestBody Stuentity student){
        return studentservice.saveStudent(student);
    }
}