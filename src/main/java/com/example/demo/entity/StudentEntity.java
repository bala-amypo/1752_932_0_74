package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private float cgpa;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
         this.email = Email;
    }
    public void getEmail(String email){
        return this.email;
    }
    public string setChpa(String cgpa){
        this.Cgpa=cgpa;
    }
    public void getCgpa(String cgpa){
        
    }
}