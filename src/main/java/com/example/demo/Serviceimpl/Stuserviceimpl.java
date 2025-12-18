package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.Sturepository;
import com.example.demo.service.Stuservice;

@service
public class Stuserviceimpl implements Stuservice{
   @Autowired
   Sturepository sturepository;

    public Stuentity saveStudent(Stuentity student){
       return sturepository.save(student); 
    }

} 