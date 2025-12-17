package com.example.demo.serviceimpl;


import com.example.demo.service.service;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.Sturepository;
import com.example.demo.service.Stuservice;

@service
public class Stuserviceimpl implements Stuservice{
    private final Sturepository Sturepository;
    public Stuserviceimpl(Sturepository Sturepository){
        this.Sturepository
    }

    public Stuentity saveStudent(Stuentity student){
       return Sturepository.save()
    }

} 