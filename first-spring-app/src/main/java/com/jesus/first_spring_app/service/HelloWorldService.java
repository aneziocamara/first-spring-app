package com.jesus.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Só Jesus salva, "+name+".";
    }
}
