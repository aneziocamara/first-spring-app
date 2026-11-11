package com.jesus.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    //GET -> /hello-world
    @GetMapping
public String helloWorld(){
    return "Deus, tenha piedade de nós!" +
            " Cristo, tenha piedade de nós!" +
            " Maria, tenha piedade de nós!" +
            " Saint German, tenha piedade de nós!";
}
}
