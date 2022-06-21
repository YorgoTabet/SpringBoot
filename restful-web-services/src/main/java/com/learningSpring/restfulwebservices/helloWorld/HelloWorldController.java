package com.learningSpring.restfulwebservices.helloWorld;


import org.springframework.web.bind.annotation.*;

//TEll Spring this is a conttroller (Hadnling HTTP Requests)
@RestController
public class HelloWorldController {

    //GET
    //URI - /HelloWorld
    // method - "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean("Hello World", name);
    }

}
