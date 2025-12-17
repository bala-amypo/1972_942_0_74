package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.
import com.example.demo.entity.Stuentity;

@Repository
public interface Sturepository extends JpaRepository<Student,Long>{

}